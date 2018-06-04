package com.groovy

class Range {
	/*
	 * 7.5. Ranges
Groovy supports the Range data type is a Collection. Ranges 
consists of two values separated by two dots. Ranges
 can for example be used to define a loop statement.
	 */

	static main(args) {
		for (i in 0..9) {
			println ("Hello $i" )
		}
		assert 'B'..'E' == ['B', 'C', 'D', 'E']
	}

}
