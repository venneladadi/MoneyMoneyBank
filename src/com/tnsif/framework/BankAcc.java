package com.tnsif.framework;

abstract public class BankAcc {
	public int accNo;
	public String accNm;
	public float accBal;
	/**
	 * @param accNo
	 * @param accNm
	 * @param d
	 */
	public BankAcc(int accNo, String accNm, double d) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = (float) d;
	}




	public void withdraw(float accBal)
	{
		
	}
	public void deposite(float accBal)
	{
		
	}




	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
	
}
