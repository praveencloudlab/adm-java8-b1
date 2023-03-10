package com;

public class Demo {
	interface I1{}
	class C1{}
	
	/*
	 * class
	 * =======================
	 * what class contains
	 *  1. properties / fields / variables
	 *  2. methods
	 *  3. constructors
	 *  4. inner classes
	 *  5. interface
	 *  6. Enums
	 *  7. blocks
	 *  
	 *  
	 *  1. properties / fields / variables
	 *  =====================================
	 *  1.instance properties
	 *  2.static properties
	 *  
	 *  instance: unique to objects. 
	 *  	ex: empId,emName, salary
	 *  static  : sharable across objects
	 *  	ex: companyName, mgrName, projectName
	 *  
	 *  
	 *   Objects
	 *   ============
	 *   why objects are needed?
	 *   ---------------------------
	 *   -> objects are needed to access instance data from static methods of the same class
	 *   -> objects are needed to access instance data from other class static and non instance methods
	 *  
	 *   where to to create objects?
	 *   ------------------------------
	 *   -> should create in static methods of the same class
	 *   -> should create in static , non static(instance) methods and constructors of other classes
	 *
	 *   why to create objects?
	 *   -------------------------
	 *   -> to access non static  data from static methods of same class
	 *   -> to access non static  data from static and non static methods of another classes
	 *
	 *
	 *   how to access static data
	 *   ----------------------------
	 *   -> static data should be accessed directly from the same class
	 *   -> static data must be accessed with class name from another class
	 *
	 *
	 *
	 *     2. methods
	 *     ------------------------
	 *     1.instance
	 *     2.static
	 *     3.native methods
	 *     4.abstract methods
	 *     
	 *     method signature
	 *     --------------------
	 *     -> name of method
	 *     -> number of arguments
	 *     -> type of arguments
	 *     -> position of arguments
	 *     
	 *     ex: void f1(), void f1(int x), void f1(int x,float y)
	 *      
	 *     arguments in methods : 2 types
	 *     --------------------------------
	 *     1.actual arguments: method declaration
	 *     		f1(x); // x is actual argument
	 *     2.formal arguments: method body or definition
	 *     		void f1(int x){} . here x is formal argument
	 *     
	 *     
	 *     call by value and call by reference
	 *     -------------------------------------
	 *     -> changes of formal argument reflects back to the actual argument. this is called call by reference
	 *     -> changes of formal arguments will not reflects back to the actual argument. This is called call by value
	 *    
	 *     note
	 *     -----
	 *     -> by default all objects are call by reference
	 *     -> all primitive types are call by value
	 *     
	 *     
	 *     
	 *     
	 *
	 */
	
	
	
	int empId; // instance : unique to every object of Employee class
	static String mgrName="M1";  // common content to all objects of Employee class
	
	void f1() { // instance method
		empId=100; // valid
		mgrName="M2"; // valid
	}
	static void f2() { // static method
		mgrName="M3"; // valid 
		//empId=7889; // invalid
		Demo d1=new Demo();
		d1.empId=98833; // valid
	}
	
	public static void main(String[] args) {
		
		//empId=100; // invalid
		mgrName="M4"; // valid	
		
	}
	

}
