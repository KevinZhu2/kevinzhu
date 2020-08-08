package org.kz.mryang;

import org.kz.mryang.util.ConsoleInput;

public class July182020homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Calculate any 5 integers square sum
		ConsoleInput consoleinput = new ConsoleInput();
		
		int count = 1;
		int sum = 0;
		
		while (count < 6 ) {
			System.out.println("Please enter your number: " );
			String number = consoleinput.read();
			
			System.out.println();
			
			try {
				int n = Integer.parseInt(number);
				sum = sum+n*n;
				count = count+1;
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
				
		}
	
	System.out.println("The sum of the five numbers square is " + sum);	
	
	}

}
