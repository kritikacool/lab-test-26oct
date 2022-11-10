* employee class
 * @Author:kritika kumari
 * @Date:26 oct 2022
 */

//declaring a package
package com.test3;

//declaring a class
public class employee {

	//instance variables
	int sid;
	String name;
	String department
	String salary;
	
	//method to get the details
	void getdetails(int id,String n,String d,String s) {
		sid = id;
		name = n;
		department = d;
		salary = s;
	}
	
	//method for printing details
	void printDetails() {
		System.out.println("Employee Details are:");
		System.out.println("Employee Id:"+ sid);
		System.out.println("Employee Name:"+ name);
		System.out.println("Employee Department:"+ department);
		
	}
	
}	