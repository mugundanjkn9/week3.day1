package org.system;

public class Desktop extends Computer{
	
	public String desktopSize(String Size) {
		System.out.println("The Desktop size of my computer is "+Size);
		return Size;
	}
	
	
	public static void main(String[] args) {
		
		Desktop newdesk = new Desktop();
		newdesk.computerModel("MSI GF63THIN 95C");
		newdesk.desktopSize("17 Inch");
	}
	
}
