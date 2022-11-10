* enhanced class
 * @Author:kritika kumari
 * @Date:26 oct 2022
 */

package com.test;

public class enhanced {

}

package learning;

// import package
import java.util.Scanner;

//declaring a class
public class tagLine {
	
	//static method to print message
	public static void main(String[]args) {
		String company;
		Scanner str = new Scanner(System.in);
		System.out.println("Enter any company name to print its TagLine(MMI/INFO/TCS/TT)");
		company =str.nextLine();
		
		//switch case with print the message
		switch(company) {
		case "MMI";
		System.out.println("MapMyIndia");
		break;
		case "INFO";
		System.out.PRINTLN("infosys Limited");
		break;
		case "TCS";
		System.out.println("Tata computing services");
		break;
		case "TT";
		System.out.Println("Tata Technologies");
		break;
		
		//by defaulting
		default:
			System.out.println("Company name not mentioned");
		}
	}
}	
		



