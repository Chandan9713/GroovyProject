package com.groovy

class RegularExpression {
	/*
	 * 9.3. Regular expressions
Groovy is based on Java regular expression support and add the
 addition support operators to make the usage of regular expressions easier.

Groovy adds the Slashy string as String declaration. Slashy strings are
 Strings between two "/" signs. They don’t need escape backslashes in regular expressions.
	 * 
	 */

	static main(args) {
		// Defines a string with special signs
		def text = "John Jimbo jingeled happily ever after"

		// Every word must be followed by a nonword character
		// Match
		if (text==~/(\w*\W+)*/){
			println "Match was successful"
		} else {
			println "Match was not successful"
		}
		// Every word must be followed by a nonword character
		// Find
		if (text=~/(\w*\W+)*/){
			println "Find was successful"
		} else {
			println "Find was not successful"
		}

		if (text==~/^J.*/ ){
			println "There was a match"
		} else {
			println "No match found"
		}
		def newText = text.replaceAll(/\w+/, "hubba")
		println newText
	}

}
