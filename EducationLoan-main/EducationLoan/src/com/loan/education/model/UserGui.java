package com.loan.education.model;

public class UserGui extends EducationLoan{

	public static void main(String[] args) {
		EducationLoan el = new EducationLoan();
		int result = el.employeValid();
		if(result == 0) {
			EducationLoan ed = new EducationLoan();
			ed.mainMethod();
		}
	}
	
}
