package main;

import data.Data;
import data.Task;
import data.Kanban;

import java.util.Scanner;

public class TextUI {
	public static Kanban kanban = Data.newKanban("Kanban Sheet");
	
	public static void displayInstructions() {
		String msg = "Instructions:\n"
						+ "\tEnter (t) to add a new task\n"
						+ "\tEnter (m) to move a task up\n"
						+ "\tEnter (d) to move a task down\n"
						+ "\tEnter (k) to view kanban sheet\n"
						+ "\tEnter (i) to see instructions\n" 
						+ "\tEnter (x) to exit\n";
		System.out.print(msg);
	}
	
	public static void displayError() {
		System.out.println("Invalid Input\n");
	}
	
	public static void createTask(String title, String desc) {
		try {
			Task task = Data.newTask(title, desc);
			kanban.addTask(task);
		} catch (IllegalArgumentException e) {
			displayError();
		}
	}
	
	public static void moveTask(String name, int change) {
		try {
			kanban.moveTask(name, change);
		} catch (IllegalArgumentException e) {
			displayError(); 
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		displayInstructions();
		while (true) {
			System.out.println("Input: ");
			String input = scan.nextLine();
			if (input.equals("t")) {
				System.out.println("Enter title: ");
				String title = scan.nextLine();
				System.out.println("Enter description: ");
				String desc = scan.nextLine();
				createTask(title, desc);
			} else if (input.equals("m")) {
				System.out.println("Which task would you like to move up?");
				System.out.println("Enter title: ");
				String title = scan.nextLine();
				moveTask(title, 1);
			} else if (input.equals("d")) {
				System.out.println("Which task would you like to move down?");
				System.out.println("Enter title: ");
				String title = scan.nextLine();
				moveTask(title, -1);
			} else if (input.equals("k")) {
				System.out.println(kanban.toString());
			} else if (input.equals("i")) {
				displayInstructions();
			} else if (input.equals("x")) {
				break;
			} else {
				displayError();
			} 
		}
		scan.close();
	} 
}