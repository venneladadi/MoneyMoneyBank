package com.tnsif.framework;

public class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	private final float Minbal;
	/**
	 * @param accNo
	 * @param accNm
	 * @param accBal
	 * @param isSalaried
	 * @param minbal
	 */
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float minbal) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
		Minbal = minbal;
	}
	
	public void withdraw(float accBal)
	{
		
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", Minbal=" + Minbal + "]";
	}
	 
	
	   
}
