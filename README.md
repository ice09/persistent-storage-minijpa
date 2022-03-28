# Most Simple Spring Boot Persistent JPA PostgreSQL Sample

This sample should help projects to bootstrap a simple, but persistent, storage with PostgreSQL using Spring Boot and Spring Data JPA.

## Setup Instructions for Linux/WSL2

Create Docker-Container **storage** with DB **storage**, User **storage**, and Password **storage** in local folder `postgres-data`  
```
docker run -d --name storage \
-e POSTGRES_USER=storage -e POSTGRES_PASSWORD=storage -e PGDATA=/var/lib/postgresql/data/pgdata -e POSTGRES_DB=storage \
-p 5432:5432 -v $PWD/postgres-data:/var/lib/postgresql/data postgres
```

## Run

Once Docker is started, run `LocalStorageApplication`.

_Note: The PostgreSQL data will be persistet in the local volume `postgres-data` folder._ 