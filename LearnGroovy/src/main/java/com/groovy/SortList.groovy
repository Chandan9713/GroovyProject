package com.groovy

class SortList {
 /*
  * The Groovy collections have several methods which accept a closure as parameter, for example the each method.
  */
	static main(args) {
		
		def List strings = "this is a long sentence".split();
		strings.sort({s1, s2 -> s1.size() <=> s2.size()});
		println strings
	}

}
