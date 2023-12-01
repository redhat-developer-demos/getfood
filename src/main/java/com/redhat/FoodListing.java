package com.redhat;

public class FoodListing {

    private Integer foodCode;
    private String displayName;
    private Integer portionDefault;
    private Float portionAmount;
    private String portionDisplayName;
    private Float factor;
    private Float increment;
    private Float multiplier;
    private Float grains;
    private Float wholeGrains;
    private Float vegetables;
    private Float orangeVegetables;
    private Float drkgreenVegetables;
    private Float starchyVegetables;
    private Float otherVegetables;
    private Float fruits;
    private Float milk;
    private Float meats;
    private Float soy;
    private Float drybeansPeas;
    private Float oils;
    private Float solidFats;
    private Float addedSugars;
    private Float alcohol;
    private Float calories;
    private Float saturatedFats;

    public FoodListing() {
    }

    public FoodListing(Integer id) {
        this.foodCode = id;
    }

    public void setFoodCode(Integer i) {
        foodCode = i;
    }

    public Integer getFoodCode() {
        return foodCode;
    }

    public void setDisplayName(String s) {
        displayName = s;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Integer getPortionDefault() {
        return this.portionDefault;
    }

    public void setPortionDefault(Integer portionDefault) {
        this.portionDefault = portionDefault;
    }

    public Float getPortionAmount() {
        return this.portionAmount;
    }

    public void setPortionAmount(Float portionAmount) {
        this.portionAmount = portionAmount;
    }

    public String getPortionDisplayName() {
        return this.portionDisplayName;
    }

    public void setPortionDisplayName(String portionDisplayName) {
        this.portionDisplayName = portionDisplayName;
    }

    public Float getFactor() {
        return this.factor;
    }

    public void setFactor(Float factor) {
        this.factor = factor;
    }

    public Float getIncrement() {
        return this.increment;
    }

    public void setIncrement(Float increment) {
        this.increment = increment;
    }

    public Float getMultiplier() {
        return this.multiplier;
    }

    public void setMultiplier(Float multiplier) {
        this.multiplier = multiplier;
    }

    public Float getGrains() {
        return this.grains;
    }

    public void setGrains(Float grains) {
        this.grains = grains;
    }

    public Float getWholeGrains() {
        return this.wholeGrains;
    }

    public void setWholeGrains(Float wholeGrains) {
        this.wholeGrains = wholeGrains;
    }

    public Float getVegetables() {
        return this.vegetables;
    }

    public void setVegetables(Float vegetables) {
        this.vegetables = vegetables;
    }

    public Float getOrangeVegetables() {
        return this.orangeVegetables;
    }

    public void setOrangeVegetables(Float orangeVegetables) {
        this.orangeVegetables = orangeVegetables;
    }

    public Float getDrkgreenVegetables() {
        return this.drkgreenVegetables;
    }

    public void setDrkgreenVegetables(Float drkgreenVegetables) {
        this.drkgreenVegetables = drkgreenVegetables;
    }

    public Float getStarchyVegetables() {
        return this.starchyVegetables;
    }

    public void setStarchyVegetables(Float starchyVegetables) {
        this.starchyVegetables = starchyVegetables;
    }

    public Float getOtherVegetables() {
        return this.otherVegetables;
    }

    public void setOtherVegetables(Float otherVegetables) {
        this.otherVegetables = otherVegetables;
    }

    public Float getFruits() {
        return this.fruits;
    }

    public void setFruits(Float fruits) {
        this.fruits = fruits;
    }

    public Float getMilk() {
        return this.milk;
    }

    public void setMilk(Float milk) {
        this.milk = milk;
    }

    public Float getMeats() {
        return this.meats;
    }

    public void setMeats(Float meats) {
        this.meats = meats;
    }

    public Float getSoy() {
        return this.soy;
    }

    public void setSoy(Float soy) {
        this.soy = soy;
    }

    public Float getDrybeansPeas() {
        return this.drybeansPeas;
    }

    public void setDrybeansPeas(Float drybeansPeas) {
        this.drybeansPeas = drybeansPeas;
    }

    public Float getOils() {
        return this.oils;
    }

    public void setOils(Float oils) {
        this.oils = oils;
    }

    public Float getSolidFats() {
        return this.solidFats;
    }

    public void setSolidFats(Float solidFats) {
        this.solidFats = solidFats;
    }

    public Float getAddedSugars() {
        return this.addedSugars;
    }

    public void setAddedSugars(Float addedSugars) {
        this.addedSugars = addedSugars;
    }

    public Float getAlcohol() {
        return this.alcohol;
    }

    public void setAlcohol(Float alcohol) {
        this.alcohol = alcohol;
    }

    public Float getCalories() {
        return this.calories;
    }

    public void setCalories(Float calories) {
        this.calories = calories;
    }

    public Float getSaturatedFats() {
        return this.saturatedFats;
    }

    public void setSaturatedFats(Float saturatedFats) {
        this.saturatedFats = saturatedFats;
    }
}