package com.groovy

class stringGstring {
	/*
	 * 9.1. Strings and GStrings
Groovy allows to use two different types of String, the java.lang.String and 
the groovy.lang.GString class. You can also define a single line or a multi-line string in Groovy.

Strings which are quoted in by "" are of type GString (short for Groovy Strings).
 In GStrings you can directly use variables or call Groovy code. The Groovy runtime
  evaluates the variables and method calls.
 An instance of GString is automatically converted to a java.lang.String whenever needed.
	 */

	static main(args) {
		def name = "John"
		def s1 = "Hello $name" // $name will be replaced
		def s2 = 'Hello $name' // $name will not be replaced
		println s1
		println s2
		println s1.class
		println s2.class
		
		// demonstrates object references and method calls
		def date = new Date()
		println "We met at $date"
		println "We met at ${date.format('MM/dd/yy')}"
	}

}
