package com.groovy

class EqualMethod {
	
	/*
	 * 5.4. Equals, == and the method is()
	 * 
One difference between Java and Groovy is that the == operator will check 
for equality and not for identity. Java checks if both variables
 points to the same object while Groovy checks if both variables
  are equals. To check for identify you can use in Groovy the is() method.

In Groovy null == null returns true. If two references point to the same object
 it is also true. If an object implements the compareTo method, Comparable this
  method is used, otherwise the equals method.

5.5. Optional parameters in methods

Groovy allows to have optional parameter values. Optional parameter values are indicated by =0.
	 */

	static main(args) {
		
		println sum(1,5)
		println sum(1,2,5)
	}
	static sum(a,b,c=0){
		a+b+c;
		}

}
