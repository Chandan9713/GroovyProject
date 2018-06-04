package com.groovy

class closure {
//If you define a closure you can also define default values for its parameters.	
	

	static main(args) {
		
		def multiply = {int a, int  b = 10 -> a * b}
		
		assert multiply(2) == 20
		assert multiply(2,5) == 10
		
		List<Integer> list = [5,6,7,8]
		list.each({line -> println line})
		list.each({println it})
		
		
		// calculate the sum of the number up to 10
		
		def total = 0
		(1..5).each {total+=it}
		println total
	}

}
