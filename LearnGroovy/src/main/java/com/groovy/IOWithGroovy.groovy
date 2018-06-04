package com.groovy

class IOWithGroovy {
/*
 * Groovy adds several convenient methods the File class from Java. 
 * The following example demonstrates how to print out every line to
 *  the console and and also how to change the output of a line by adding a prefix.
 */
	static main(args) {
		// write the content of the file to the console
		File file = new File("e:/test.txt")
		file.eachLine{ line -> println line }
		
		// adds a line number in front of each line to the console
		def lineNumber = 0
		file = new File("e:/test.txt")
		file.eachLine{ line ->
			lineNumber++
			println "$lineNumber: $line"
		}
		
		// read the file into a String
		String s = new File("e:/test.txt").text
		println s
	}

}
