package com.redhat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.json.JsonArray;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import io.quarkus.jsonb.*;

@Path("/foods")
public class FoodResource {

    int SLEEP_MILLISECONDS = 0;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String foodList() {
        try {
            SLEEP_MILLISECONDS = Integer.parseInt(System.getenv().getOrDefault("SLEEP_MILLISECONDS", "0"));
            TimeUnit.MILLISECONDS.sleep(SLEEP_MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JSONArray result = new JSONArray();

        // TODO: Get from PostgreSQL database table

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://postgresql:5432/foods";
        String user = "postgres";
        String password = "postgres";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the PostgreSQL server successfully.");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food ORDER BY Display_Name");
            ResultSetMetaData md = rs.getMetaData();
            int numCols = md.getColumnCount();
            List<String> colNames = IntStream.range(0, numCols)
                    .mapToObj(i -> {
                        try {
                            return md.getColumnName(i + 1);
                        } catch (SQLException e) {
                            e.printStackTrace();
                            return "?";
                        }
                    })
                    .collect(Collectors.toList());

            System.out.println(colNames);

            while (rs.next()) {
                JSONObject row = new JSONObject();
                colNames.forEach(cn -> {
                    try {
                        System.out.println(cn);
                        System.out.println(rs.getObject(cn));
                        row.put(cn, rs.getObject(cn));
                    } catch (JSONException | SQLException e) {
                        e.printStackTrace();
                    }
                });
                System.out.println(row);
                result.put(row);
            }

            rs.close();
            st.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result.toString();
    }
}