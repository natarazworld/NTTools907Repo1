package com.nt.upi;

public class UPIPayment {

	public   String  doPayment(long phoneNo, double amount) {
		
		System.out.println("UPIPayment.doPayment()  ");
		
		return  amount+"  amount  is  transfered to::"+phoneNo;
		
	}
	
}
