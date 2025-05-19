package com.java;

import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi I am AI Bot. How can I help you!");
		
		while(true) {
			System.out.println("You: ");
			String input = sc.nextLine().toLowerCase();
			
			if(input.contains("hello") || input.contains("hi")) {
				System.out.println("AI Bot: Hello, How are you!");
			} 
			
			else if (input.contains("your name")) {
					System.out.println("AI Bot: I am AI Bot, your assistant.");
				} 
			
			else if (input.contains("bye")) {
				System.out.println("AI Bot: Goodbye.");
				break;
			}
			
			else if(input.contains("how are you.")) {
				System.out.println("AI Bot: I'm good. Thank You.");
			}
			
			else {
				System.out.println("AI Bot: Sorry, error occured.");
			     }
			}
		}
	}


