package com.groovy

class withMethod {

	/*
	 * Every Groovy object has a with method which allows to group method and
	 *  property calls to an object. The with method gets a closure as parameter
	 *   and every method call or property access in this closure is applied to the object.
	 */
	String property1
	String property2
	List<String> list = []
	def addElement(value) {
		list << value
	}
	def returnProperties () {
		"Property 1: $property1, Property 2: $property2 "
	}

	static main(args) {
		def sample = new withMethod()
		def result= sample.with {
			property1 = 'Input 1'
			property2 = 'This is cool'
			addElement 'Ubuntu'
			addElement 'Android'
			addElement 'Linux'
			returnProperties()
		}
		println result
		assert 3 == sample.list.size()
		assert 'Input 1' == sample.property1
		assert 'This is cool' == sample.property2
		assert 'Linux' == sample.list[2]
		
		
		def sb = new StringBuilder()
		sb.with {
			append 'Just another way to add '
			append 'strings to the StringBuilder '
			append 'object.'
		}
	}

}
