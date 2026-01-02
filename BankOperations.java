package com.oops.bankingsystem;
 
/** Documentation => 
 * Scenario: Banking System
 * 
 *       BankOperations (Interface)      => Abstraction
 *             |                         => Implements
 *           Bank     (Abstract class)   => Abstraction and Encapsulation
 *             |                      
 *       +-----------+  (Inheritance)    => extends
 *       |           |                   => polymorphism
 *     HDFC         SBI                  => child class
 *               
 *  1. Interface → Defines what actions a bank should perform (blueprint/contract).
 *  2. Abstract Class → Provides partial implementation for common behaviors. 
 *  3. Inheritance → Specific bank types inherit common behaviors. (SBI, HDFC)
 *  4. Encapsulation → Customer account details are private.
 *  5. Polymorphism → Same action behaves differently for different banks.
 *  
 * +------------------+-------------------------------------------------------------------+
 * | Concept          | Explanation                                                       |
 * |------------------+-------------------------------------------------------------------|
 * | super()          | Used to call parent constructor or methods                        |
 * | super            | Parent class reference                                            |
 * | this()           | Used to call another constructor in same class                    |
 * | this             | Current class object reference                                    |
 * | extends          | Inheriting features (properties, methods) from other class        |
 * | Encapsulation    | hiding data using `private` and accessing using set/get           |
 * | Abstraction      | hide unwanted details, show only necessary                        |
 * | Overriding       | Same name, same parameters, different class (runtime)             |
 * | @Override        | Indicates that method in a child has override a method from Parent|
 * | Overloading      | Same name, different parameters, same class (compile-time)        |
 * | Constructor order| Always runs from parent → child                                   |
 * | Polymorphism     | One name, many forms                                              |
 * +------------------+-------------------------------------------------------------------+
 *  
 * What’s Happening Here?
 * Interface (BankOperations) → defines what banks must do.
 * 
 **/

public interface BankOperations {
	
	void deposit(double amount); // abstract method, public by default
	void withdraw(double amount);
	
	// All banks must implement deposit & withdraw methods.
}
