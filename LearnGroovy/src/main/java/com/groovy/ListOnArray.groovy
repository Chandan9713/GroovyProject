package com.groovy

class ListOnArray {
/*
 * Groovy converts automatically an Array to a List and vice versa. This is demonstrated by the following snippet.
 */
	static main(args) {
		
		def String[] strings = "This is a long sentence".split();
		// convert Array to list
		def List listStrings = strings
		// convert List back to Array
		def String[] arrayStrings = listStrings
		
		println strings.class.name
		println listStrings.class.name
		println arrayStrings.class.name
	}
	
	

}
