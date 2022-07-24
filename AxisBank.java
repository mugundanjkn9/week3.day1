package org.bank;

public class AxisBank extends BankInfo{
	
	public int deposit(int abdeposit) {
		System.out.println("The amount you want to deposit is : "+abdeposit);
		return abdeposit;
	}
	
	public static void main(String[] args) {
		
		AxisBank abank = new AxisBank();
		abank.saving(true);
		abank.fixed(false);
		abank.deposit(false);
		abank.deposit(50000);
	}

}
