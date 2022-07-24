package org.bank;

public class BankInfo {
	
	//,fixed(),deposit();
	
	public boolean saving(boolean btype) {
		System.out.println("Check whether the Bank Type is Saving : "+btype);
		return btype;
	}
	
	public boolean fixed(boolean bfixed) {
		System.out.println("Check whether you are having any Fixed Account : "+bfixed);
		return bfixed;
	}
	
	public boolean deposit(boolean bdeposit) {
		System.out.println("Check whether you are having any Deposited Amount : "+bdeposit);
		return bdeposit;
	}
	

}
