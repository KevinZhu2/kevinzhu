package org.kz.mryang;

import org.kz.mryang.util.ConsoleInput;

public class July182020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInput consoleinput = new ConsoleInput();
		
		int counter = 1;
		
//		while (counter < 10) {
//			String name = consoleinput.read();
//			System.out.println("Hello " + name);
//			System.out.println();
//			counter = counter + 1;
//			
//		}
		while (counter < 10) {
			System.out.println("Please input your number: ");
			String number = consoleinput.read();
			
			try {
				int n = Integer.parseInt(number);
				
				System.out.println("The square of  " + n + " is " + n * n );
			
				System.out.println();
				
				counter = counter + 1;
				
			}catch (Exception e ) {
				
				System.out.println(e.getMessage());
			
			}		
			
		}
		
	} 
	
}


