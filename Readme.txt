DB Issues:
	I used Mysql DB.
	I created 1 user table.
	Spring JPA auto creates tables under "jdbc:mysql://localhost:3306/db_finacc"
 because "spring.jpa.hibernate.ddl-auto=create" is selected. 
 it can be updated as none after creation. 
 Also mysql server url should be updated with valid in application.properties.	

Application Issues:
	I used Spring Boot to call method per 2 minutes. 
	Rss Feed Link is written in application.properties file. It can be updated from there.
	Inserting all entries in Embedded DB
API Documantation
	http://localhost:8080/swagger-ui.html#/
						-->Rss Feed Controller
	

