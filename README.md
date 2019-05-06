Spring Cloud microservices project is aimed to learn Spring Cloud with Netflix stack.
Project related configuration files are located in the separate repository - https://github.com/kuzma87/application-config.git

# Create databases
## Core Service database
1) sudo docker run --name sc-core-psql -p 5432:5432 -e POSTGRES_DB=sc_core_service -e POSTGRES_USER=sc_user -e POSTGRES_PASSWORD=sc_password -d postgres
2) copy docker container ID (f.e. ID = 40a49b212125)
## User Service database
1) docker exec -it 40a49b212125 psql -U postgres -c "CREATE DATABASE sc_user_service;"
2) docker exec -it 40a49b212125 psql -U postgres -c "GRANT ALL PRIVILEGES ON DATABASE sc_user_service TO sc_user;"
