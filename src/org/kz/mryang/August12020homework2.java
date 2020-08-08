package org.kz.mryang;

import java.util.Scanner;

public class August12020homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count<3) {
			System.out.println("Please enter the number of your filling taxes:");
			try {
				String number1= sc.nextLine();
				String taxIncome1= sc.nextLine();
				int status = Integer.parseInt(number1);
				int taxincome = Integer.parseInt(taxIncome1);
				
				if(status <0 || status >4 & taxincome <0) {
					System.out.println("Invalid Input");
					System.out.println();
				}else {
					if (status == 0) {
						System.out.println("tax for single filers");
						if(taxincome <=8350) {
							System.out.println();
						}
						
						}
						else if (status == 1) {
						System.out.println("tax for married filing jointly or qualifying widow(er)");
						}
						else if (status == 2) {
						System.out.println("tax for married filing separately");
						}
						else if (status == 3) {
						System.out.println("tax for head of household");
						}
					System.out.println(); 
					count++;
					
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Invalid input");
				System.out.println();
			}
		}








	}

}
