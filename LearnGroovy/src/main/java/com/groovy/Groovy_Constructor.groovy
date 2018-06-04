package com.groovy

class Groovy_Constructor {
	/*
	 * Groovy provides constructors with named parameters

in which you can specify the element you would like to set during construction. 
This constructor is also called map based constructor, as it uses the property:value map syntax.

If such a constructor is used, Groovy calls the default constructor and then calls the setter methods for the attributes. This "constructor with named parameters" works also if you call a Java class from Groovy code as Groovy uses again the default constructor of the Java class and then the methods to set the properties.

The usage of the constructors with named parameters is demonstrated by the following example.
	 */

	String firstName
	String lastName
	int age
	def address
	static main(args) {
		
		Groovy_Constructor p = new Groovy_Constructor()
		// use the generated access methods
		p.setFirstName("Lars")
		// this will still use the generated access method, it is not a direct access!
		p.lastName = "Vogel"
		p.address = ("Homestreet 3");
		println(p.firstName + " " + p.lastName);
		// use the generated constructor
		p = new Groovy_Constructor(firstName: "Peter", lastName:"Mueller");
		println(p.firstName + " " + p.lastName);
	}

}
