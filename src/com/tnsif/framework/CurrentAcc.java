package com.tnsif.framework;

public class CurrentAcc extends BankAcc
{
	protected final float creditLimit;

	/**
	 * @param accNo
	 * @param accNm
	 * @param d
	 * @param e
	 */
	public CurrentAcc(int accNo, String accNm, double d, double e) {
		super(accNo, accNm, d);
		this.creditLimit = (float) e;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ "]";
	}
	
	public void withdraw(float accBal)
	{
		
	}
	

}
