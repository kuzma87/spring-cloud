Spring Cloud microservices project is aimed to learn Spring Cloud with Netflix stack.
Project related configuration files are located in the separate repository - https://github.com/kuzma87/application-config.git

# Create databases
## Core Service database
sudo docker run --name sc-core-psql -p 5432:5432 -e POSTGRES_DB=sc_core_service -e POSTGRES_USER=sc_user -e POSTGRES_PASSWORD=sc_password -d postgres

## User Service database
sudo docker run --name sc-user-psql -p 5432:5432 -e POSTGRES_DB=sc_user_service -e POSTGRES_USER=sc_user -e POSTGRES_PASSWORD=sc_password -d postgres
