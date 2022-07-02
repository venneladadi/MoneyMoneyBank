package com.tnsif.applicationpart;

import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class MMBankFactory extends BankFactory
{
	
	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public void getAccount(int i,String string,int j,int k)
	{
		System.out.println("Dear user this is your saving ammount:"+j);
	}

	@Override
	public SavingAcc getNewSavingAcc(int AcNo, String accNm, float accBal, float isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
