package com.dal.hibproj;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.dal.controller.EmployeeController;
import com.dal.model.Department;
import com.dal.model.Employee;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	EmployeeController ec=new EmployeeController();
		EmployeeController ec = new EmployeeController();
		int choice;
		String c=null;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Search Employee by ID");
			System.out.println("5. Search Employee by using Criteria Query");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				ec.addEmployee();
				break;
			case 2:
				ec.viewEmployee();
				break;
			case 3:
				ec.updateEmployee();
				break;
			case 4:
				ec.searchEmpByIDusingNamedQuery();
				break;
			case 5:
				ec.searchUsingCriteriaQuery();
				break;
			default:
				System.out.println("Choose the right choice !!");
			}
			System.out.println("Do you want to continue? y or Y");
			c=sc.next();
		}while(c.equals("y") || c.equals("Y"));
		
		sc.close();
		System.out.println("Exited from application.");
		System.exit(0);
	}

}
