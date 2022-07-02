package com.tnsif.framework;

abstract public class BankFactory {
	public abstract SavingAcc getNewSavingAcc(int AcNo,String accNm,float accBal,float isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int AccNo,String accNm,float accBal,float creditLimit);
	

}
