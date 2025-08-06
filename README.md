A simple **Spring Boot** application for managing inventory, built using Java and Maven. It allows you to perform CRUD operations on Items and provides RESTful APIs for integration.

---

## Features

- Add, view, update, and delete inventory Items
- RESTful APIs built with Spring Boot
- configured database support (MySQL)
- Structured using service-repository-controller pattern

## Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- MySQL (configurable)
- Eclipse IDE (project files included)

## Configure Application properties
### Database Connection
- spring.datasource.url=jdbc:mysql://localhost:3306/[Db-name]
- spring.datasource.username=[username]
- spring.datasource.password=[**password**]
- spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

### JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
