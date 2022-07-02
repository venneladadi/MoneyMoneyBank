package com.tnsif.main;

import com.tnsif.applicationpart.MMBankFactory;
import com.tnsif.applicationpart.MMCurrentAcc;
import com.tnsif.applicationpart.MMSavingAcc;

public class client
{
	public static void main(String[] args)
	{
		//step a
		MMBankFactory mmfactory=new MMBankFactory();
		mmfactory.getNewSavingAcc(101,"venni",10000,20000);
		mmfactory.getNewCurrentAcc(102,"siri",8000,100000);
		
		//step b
		MMSavingAcc mmsaving=new MMSavingAcc(101,"hari",10000,false, 20000,4000);
		
		//step c
		MMCurrentAcc mmcurrent=new MMCurrentAcc(101,"sai",100.0,10000.0);
		
		//step d
		mmsaving.withdraw(10000);
		mmcurrent.withdraw(78645);
		
		//step e
		mmsaving.toString();
		mmcurrent.toString();
		
		
		
	}

}
