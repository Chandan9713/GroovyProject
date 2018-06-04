package com.groovy

class loop {

	static main(args) {
		
		def list = ["Lars", "Ben", "Jack"]
		// using a variable assignment
		list.each{firstName->  println firstName
		}
		// using the it variable
		list.each{println it}
		
		
		5.times {println "Times + $it "}
		1.upto(3) {println "Up + $it "}
		4.downto(1) {println "Down + $it "}
		def sum = 0
		1.upto(100) {sum += it}
		println sum
		(1..6).each {print "Range $it"}
	}

}
