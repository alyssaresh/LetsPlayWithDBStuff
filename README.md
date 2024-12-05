# Lets Play With DB Stuff

Recall out introduction to MySQL, and the databases we've created. Let's combine that with the skills you've picked up from our introduction to JDBC, Object-oriented design, TDD, String formatting, and the lessons we've learned at the farm.

==

Your task, is to create an application that allows us to perform all of the CRUD operations necessary to interact with the data structure we created during our MySQL introduction: 
 - It should allow users to **create**, **read**, **update**, and **delete** records from all of the tables relevant to teachers, students, assignments, submissions (assignment_student relationships) and relevant meta data, and associate them to Objects of the classes represented by the tables' records.

You will need to make a UML for your application, and write relevant unit tests for testing the construction of the relevant objects.
- the unit tests should validate the construction of your objects and the methods attached to them.  
- the database interactions will be tested via use of your running app, as it will be interacting with your database. - think of using the Singleton pattern when putting together your database connection for your DB interactions.
- remember to separate your concerns, and remember to use a dedicated class to handle your Console I/O operations. (I've take the liberty of creating a stub for you.) 

## Other things to think about:  
- Which methods or variable should be static?
- Which methods should be overloaded?
- What interfaces should you create/use?

## Additional tips: 
 - We're also going to work with securing database access in your application by not commiting usernames and passwords to your codebase.
### Adding an environment variable: 

This is the syntax used in shell for creating an environment variable:
```shell
export VARNAME="my value" 
```

So, if I wanted to create environment variables for this lab, I could set them adding the following to my `~/.zshrc` file:
```shell
export PLAYWITH_DB_USERNAME="daffy" 
export PLAYWITH_DB_PASSWORD="quack" 
export PLAYWITH_DB="playwith" 
export PLAYWITH_DB_HOST="localhost" 
export PLAYWITH_DB_PORT="3306" 
```

and to view a variable's value in a shell terminal: 
```shell
printenv PLAYWITH_DB_USERNAME
```

Once the variable is set, you can access it in your Java applications using the static method `System.getenv("NAME_OV_VARIABLE)`:

```shell
String dbUserName = System.getenv("PLAYWITH_DB_USERNAME");
System.out.println(System.getenv(dbUserName));
```
Use these tips to set your environment variables to your settings and verify using the commented-out method calls included in **MainApplication.java**
### Backup and import of a MySQL database: 
Remember, to backup a database, export it to a SQL file: 
```shell
mysqldump -u db_username -p name_of_database > name_of_file.sql
```
and to import it into a new database:
```shell
mysql -u db_username -p name_of_destination_database < name_of_file.sql
```


