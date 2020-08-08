package org.kz.mryang.util;

import java.util.Scanner;

public class ConsoleInput {
	Scanner scanner = new Scanner(System.in);
	
	public String read() {
		//String input = "";
		
//		System.out.println("Please input your number: ");
//		
//		String input = scanner.nextLine();
		
		return scanner.nextLine();
		
	}
}
