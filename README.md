This repository contains Java classes demonstrating good practices in object-oriented programming, focusing on class design, encapsulation, and methods implementation. The repository includes the following files:

Files Included:
+ Address.java
The Address class represents a basic structure of an address with relevant getters, setters, and essential methods such as constructors, getters, setters, toString(), and copy operations.

+ Student.java
The Student class showcases a well-structured class with fields, constructors, getters, setters, equals comparison, toString() method, and copy operations. It also incorporates an Address object to demonstrate composition.

+ Main.java
The Main class serves as an entry point to demonstrate the usage of the Address and Student classes. It contains sample instances of Address and Student, showcasing equality comparisons, toString() outputs, and copy operations.

Class Descriptions:

Address Class
+ Fields: street, city, state, zipCode
+ Methods:
+ Constructor
+ Getters and setters for fields
+ toString(): Provides a string representation of the Address object

Student Class
+ Fields: name, emplID, gpa, address (an instance of the Address class)
Methods:
+ Constructor
+  Getters and setters for fields
+ equals(Object obj): Compares two Student objects based on their emplID
+ toString(): Represents the Student object as a string
+ copy(): Creates a copy of the Student object
+ Copy constructor: Constructs a new Student object by copying the values from another Student object

Main Class
Main Method: Contains sample code demonstrating the usage of Address and Student classes.
+ Instantiates Address and Student objects
+ Tests equality between Student objects
+ Displays string representations using toString()
+ Demonstrates copy operations
