package org.kz.mryang;

import java.util.Scanner;

public class August12020homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that allows 3 users to input their birth year, and calculates if the birth year is leap year. 
//		Your program should take care of invalid inputs.
		Scanner sc = new Scanner(System.in);
		int count =0;
		
		while(count<3) {
			System.out.println("please type your birth year: ");
			
			try {
				String year1 = sc.nextLine();
				int year = Integer.parseInt(year1);
				boolean isLeap = year%4==0 && year%100!=0 || year%400==0;
				if(isLeap){
					System.out.format("%d is leap year\n", year);
					System.out.println();
				}else {
					System.out.format("%d is not leap year\n", year);
					System.out.println();
				}
			count++;
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("your input is invalid");
				System.out.println();
			}
			
		}
		
		
		
	}

}
