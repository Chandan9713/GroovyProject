package com.groovy

class Numbers {

	/*
	 * 7.4. Numbers
Numbers are objects in Groovy, as well as variables defined as int,
 float, double, etc. If you use numbers in your code Groovy assigns
  a type to it and performs automatically the down- and upcasting for you.

As numbers are object they have also methods for example the times
 method which executes a block of code the number of times defined by the number.

Create the following class called TypesTest to play with numbers.
	 * 
	 */
	
	static main(args) {
		int i = 1 // Short form for Integer i = new Integer(1)
		int j = i +3
		int k = i.plus(3) // Same as above
		// Make sure this worked
		assert(k==4)
		println i.class
		println j.class
		println k.class
		
		// Automatic type assignement
		def value = 1.0F
		println value.class
		def value2 = 1
		println value2.class
		// this would be zero in Java
		value2 = value2 / 2
		println value2
		// value was upcasted
		println value2.class
		
		10.times {println "Test"}
	}

}
