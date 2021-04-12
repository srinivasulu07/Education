package com.loan.education.model;

import java.util.Scanner;

import com.loan.education.controller.UserValidation;
import com.loan.education.doa.Age;
import com.loan.education.doa.Amount;
import com.loan.education.doa.CollegeRanking;
import com.loan.education.doa.CreditScore;
import com.loan.education.doa.Repaymentperiod;
public class EducationLoan {

	Scanner sc = new Scanner(System.in);
	
	public static String userid;
	public String password;
	public static int result;
	public static String name;
	public static String emailid;
	public static String phoneno;
	public static String address;
	public static String citizenship;
	
	public static int age;
	public static long amount;
	public static int rank;
	public static int credit;
	public static int period;
	
	public int employeValid() {
		
		
		
		System.out.println("Enter userid: ");
		userid = sc.nextLine();
		
		System.out.println("Enter password: ");
		password = sc.nextLine();
		System.out.println("Login Successfull...");
		UserValidation usr = new UserValidation();
		result = usr.validateEmployee(userid,password);

		return result;
		
	}

	public void mainMethod() {
		new EducationLoan();
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Enter your Emailid: ");
		emailid=sc.nextLine();
		System.out.println("Enter your Phoneno: ");
		phoneno=sc.nextLine();
		System.out.println("Enter your Address: ");
		address=sc.nextLine();
		System.out.println("Enter you Citizenship: ");
		citizenship=sc.nextLine();
		System.out.println("Enter your Age: ");
		age = sc.nextInt();
		UserValidation usr = new UserValidation();
		usr.validateAge(age);
		Age a = new Age();
		a.ageValidation();
		System.out.println("Enter your loan amount: ");
		amount =sc.nextLong();
		Amount am=new Amount();
		am.amountValidation();
		System.out.println("Enter the rank of college you are joining: ");
		rank = sc.nextInt();
		CollegeRanking cr=new CollegeRanking();
		cr.rankValidation();
		
		System.out.println("Enter your creditscore: ");
		credit = sc.nextInt();
		
		CreditScore cs=new CreditScore();
		cs.creditValidation();
		
		System.out.println("Enter your repaymentperiod: ");
		period = sc.nextInt();
		Repaymentperiod rp =new Repaymentperiod();
		rp.periodValidation();
		UserValidation u = new UserValidation();
		u.score();
	}
	
}
