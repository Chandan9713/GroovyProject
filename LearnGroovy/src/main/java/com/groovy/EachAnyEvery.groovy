package com.groovy

class EachAnyEvery {
/*
 * You can call closures on the elements, via the each(), any() and every()
 *  method. The any() and every() methods return a boolean depending whether
 *  any or every entry in the map satisfies a condition defined by a closure.
 */
	static main(args) {
		
		def mymap = [1:"Jim Knopf", 2:"Thomas Edison", 3:"Lars Vogel"]
		mymap.each {entry -> println (entry.key > 1)}
		mymap.each {entry -> println (entry.value.contains("o"))}
		println "Lars contained:" + mymap.any {entry -> entry.value.contains("Lars")}
		println "Every key small than 4:" + mymap.every {entry -> entry.key < 4}

		def result =''
		for (key in mymap.keySet()) {
			result += key
		}
		println result

		mymap.each { key, value ->
			print key + " "
			println value
		}

		mymap.each { entry ->
			print entry.key + " "
			println entry.value
		}
	}

}
