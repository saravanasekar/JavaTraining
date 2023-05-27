package com.dal.controller;

import com.dal.Model.ModelClass;
//import java.util.Scanner;
public class ControllerClass {
//	Scanner sc = new Scanner();
	ModelClass mc = new ModelClass();
	public void addEmployee()
	{
		
	//	sc.nextLine();
		mc.setEmpName("Arya"); 
		mc.setEmpNo(101);
		
		
	}
    public void ViewEmployee()
    {
    	//System.out.println("Employe Name:"+mc.getEmpName());
		//System.out.println("Employee No:"+mc.getEmpNo());
    	System.out.println(mc);
    }
	
    
}
