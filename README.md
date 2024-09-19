# Spring-Boot, MYSQL, Docker Integration !

Run MySql Image in docker with below command

**docker run -p 3307:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test mysql:8.0.13**

After running above command create new connection in mysql workbench with port 3306 and hostname as localhost

Run below command to create network for spring
**docker network create spring-net**

Run below command to connect network with mysqldb connection
**docker network connect spring-net mysqldb**

Go to project directory and run below command to create image 
**docker build -t spring-mysql-docker .**

Run below command to run container
**docker run -p 9090:8080 --name spring-mysql-docker --net spring-net -e MYSQL_HOST=mysqldb -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_PORT=3306 spring-mysql-docker**
-p 9090:8080 9090 is external port and 8080 is internal port
run api on http://localhost:9090/student/insert



