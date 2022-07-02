package com.tnsif.applicationpart;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	
	
	public MMCurrentAcc(int accNo, String accNm, double d, double e) {
		super(accNo, accNm, d, e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	public void withdraw(float accBal)
	{
		
		
		System.out.println("Dear user your current balance :"+creditLimit);
	}
	

}
