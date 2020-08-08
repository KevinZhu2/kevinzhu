package org.kz.mryang;


import org.kz.mryang.util.ConsoleInput;

public class July182020homework {

	public static void main(String[] args) {
		
		ConsoleInput consoleinput = new ConsoleInput();
		// TODO Auto-generated method stub
		// Calculate any 5 integers sum		
		int count = 1;
		int sum = 0;
		
		while (count < 6) {
			System.out.println("Please input your number: ");
			String number = consoleinput.read();
			
			System.out.println(); 
			
			try {
				int n = Integer.parseInt(number);
				sum=sum +n;
				count=count+1;
			}catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
		System.out.println("The sum of the five numbers is " + sum);
		
	}

}
