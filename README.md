# Servlet CRUD Operations.

In this project user can Insert the data, View the Data, Update the data, Fetch the data and Delete the data by passing input from front end used technologyies are
Java, Servlets, JSP, Html, CSS.

## Installation
- Java 8.
- Apache Tomcat server
- MySQL Workbench
- Maveen Repository

Instructions on how to install and run the project:

1. Clone the repository: `git clone  `
2. Install dependencies: `servlet`,`Hibernate`,`Mysql`

## Usage

Instructions on how to use the project:

1. Run the application: `start Apache tomcat server and page will open in browser`

## Contributing
If you'd like to contribute to the project, please follow these steps:
Persistance file:/
<?xml version="1.0" encoding="UTF-8"?>/
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"/
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence/
  http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"/
	version="2.1">/

	<persistence-unit name="dev">/
		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>/
		<shared-cache-mode>ENABLE_SELECTIVE</shared-cache-mode>/ 
		<properties>/
			<property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />/
			<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/databasename"/>/
			<property name="javax.persistence.jdbc.user" value="root" />/
			<property name="javax.persistence.jdbc.password" value="root" />/
			<property name="hibernate.show_sql" value="true" />/
			<property name="hibernate.hbm2ddl.auto" value="update" />/
			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>/
		</properties>/
	</persistence-unit>/
</persistence>

