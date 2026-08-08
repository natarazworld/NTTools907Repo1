package com.nt.nb;

public class NetBankingService {

	
	public  String    doPayment(long srcAcno,long destAcno, double  amount) {
		System.out.println("NetBankingService.doPayment()");
		return amount+" amount is transfered from "+srcAcno+" to"+destAcno;
	}
}
