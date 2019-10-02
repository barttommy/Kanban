package main;

import data.Data;
import data.Task;
import data.Kanban;


public class Main {
	public static void main(String[] args) {
		
		Kanban kanban = Data.newKanban("Project #1");
		
		Task task1 = Data.newTask("Kanban Prototype", "Create a working prototype for class");
		Task task2 = Data.newTask("Database", "Create a database for the capstone project");
		Task task3 = Data.newTask("Weekly log", "Turn in weekly log this monday");
		Task task4 = Data.newTask("Eat lunch", "Find something to eat for lunch");
		
		kanban.addTask(task1);
		kanban.addTask(task2);
		kanban.addTask(task3);
		kanban.addTask(task4);
		
		kanban.moveTask("Kanban Prototype", 1);
		kanban.moveTask("Database", 1);
		kanban.moveTask("EaT LUNCh", 2);
		
		kanban.removeTask("database");
		
		System.out.print(kanban.toString());
	}
}