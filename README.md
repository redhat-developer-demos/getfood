## Create PostgreSQL instance
`oc new-app openshift/postgresql-ephemeral -p DATABASE_SERVICE_NAME=postgresql -e POSTGRESQL_USER=postgres -e POSTGRESQL_PASSWORD=postgres --labels=app.kubernetes.io/part-of=foods,systemname=foods,tier=database,database=postgresql,foods=database`


## Create configmap file on local machine
`oc create configmap db-config --from-file=./configmap --dry-run=client -o yaml > db-configmap.yaml`  


## Create configmap object in OpenShift
`oc create -f db-configmap.yaml`  


## Create deployment object in OpenShift
`oc create -f .\mydeploy.yaml`  


## Check to see results  
Run `curl` against the route, with the "/foods" path.
