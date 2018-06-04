package com.groovy

class elvis {
	/*
	 * The ?: (called the Elvis operator) is a short form for the Java ternary operator.
	 *  You can use this to set a default if an expression resolves to false or null.
	 */

	static main(args) {
		// if user exists, return it, otherwise create a new User
		
		// Groovy with the Elvis operator
		String test = null
		String result2 = test ?: new String()
		
		// Java version
		String user = null;
		String result1 = user!=null ? user : new String();
	}

}
