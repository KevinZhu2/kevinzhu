package org.kz.mryang;

import org.kz.mryang.util.ConsoleInput;

public class July182020homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculate the average of the 5 numbers 
		
		ConsoleInput consoleinput = new ConsoleInput();
		
		int count = 1;
		double sum =0;
		while(count < 6) {
			System.out.println("Please enter your number: ");
			String number = consoleinput.read();
			System.out.println();
			
			try {
				double n = Integer.parseInt(number);
				sum=n+sum;
				count = count+1;
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		System.out.println("The average of the five numbers is "+ sum/5);
		
		
		
		
	}

}
