package com.tnsif.applicationpart;

import com.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private final float Minbal;

	
	
	/**
	 * @param accNo
	 * @param accNm
	 * @param accBal
	 * @param isSalaried
	 * @param minbal
	 * @param minbal2
	 */
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float minbal, float minbal2) {
		super(accNo, accNm, accBal, isSalaried, minbal);
		Minbal = minbal2;
	}

	public void withdraw(float accBal)
	{
		System.out.println("Dear user your saving amount is:"+Minbal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [Minbal=" + Minbal + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	

}
