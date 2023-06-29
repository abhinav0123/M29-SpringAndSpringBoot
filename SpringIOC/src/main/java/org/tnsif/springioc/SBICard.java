package org.tnsif.springioc;

public class SBICard implements DebitCard{

	@Override
	public void deposit() {
		System.out.println("SBI- Depositing an amount of lakh rupees");
	}

	@Override
	public void withdraw() {
		System.out.println("SBI- Withdrawing an amount of 20 thousand rupees");		
	}
	

}
