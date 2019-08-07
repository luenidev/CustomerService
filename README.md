# CustomerService
This services handles customer related stuff like:
- CRUD customers
- DB connection to customer Datebase
- Rest Interface for CustomerData


Docker
docker run --name shop-customer-db -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=customer -e MYSQL_USER=root -e MYSQL_PASSWORD=root -p 3306:3306 -d mysql:latest
