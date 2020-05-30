/**
 * 
 */
package com.athul.sample;

/**
 * @author Apple
 *
 */
public class Testing {

	static Testing test = null;
	

	
	public static Testing setTesting() {
		if(null==test) {
			test = new Testing();
		}
		return test;
	}


}
