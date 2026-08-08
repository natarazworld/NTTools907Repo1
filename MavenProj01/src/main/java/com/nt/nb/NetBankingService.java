package com.nt.nb;

public class NetBankingService {

	
	public  String    doPayment(long srcAcno,long destAcno, double  amount) {
		System.out.println("NetBankingService.doPayment()");
		if(srcAcno<0  ||  destAcno<0  ||  amount<0)
			throw  new IllegalArgumentException("Invalid  inputs");
		
		return amount+" amount is transfered from "+srcAcno+" to"+destAcno;
	}
	
	public  String  doChequePayment(long chequeNo,  double amount) {
		System.out.println("NetBankingService.doChequePayment()");
		if(chequeNo<0 ||  amount<0)
			throw  new IllegalArgumentException("Invalid inputs");
		
		return  amount+" amount is  withdrawn  using cheque Number ::"+chequeNo;
	}
}
