package com.nt.upi;

public class UPIPayment {

	public   String  doPayment(long phoneNo, double amount) {
		
		System.out.println("UPIPayment.doPayment()  ");
		 if(phoneNo<0  ||  amount<0)
			 throw new  IllegalArgumentException("Invalid Id");
		return  amount+"  amount  is  transfered to::"+phoneNo;
		
	}
	
}
