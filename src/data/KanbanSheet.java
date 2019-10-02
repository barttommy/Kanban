package data;

import java.util.List;
import java.util.ArrayList;

final class KanbanSheet implements Kanban {
	private List<Stage> kanbanData;
	private final String name;
	
	KanbanSheet(String name) {
		kanbanData = new ArrayList<Stage>();
		Stage stage1 = new StageSet("REQUESTED");
		Stage stage2 = new StageSet("IN PROGRESS"); 
		Stage stage3 = new StageSet("DONE");
		kanbanData.add(stage1);
		kanbanData.add(stage2);
		kanbanData.add(stage3);
		this.name = name;
	}    
	
	public int size() {
		return kanbanData.size();
	} 
	
	public Stage getStage(int index) {
		return kanbanData.get(index);
	}
	
	public void addTask(Task task) {
		if (searchForTask(task.name()) == null) {
			kanbanData.get(task.currentStage()).add(task);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void removeTask(String name) {
		Task task = searchForTask(name);
		if (task != null) {
			kanbanData.get(task.currentStage()).remove(task);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void moveTask(String name, int change) {
		Task task = searchForTask(name);
		if (task == null) { 
			throw new IllegalArgumentException();
		}
		int oldStage = task.currentStage();
		int newStage = oldStage + change;
		if (newStage < 0 || newStage > kanbanData.size()) {
			throw new IllegalArgumentException();
		}
		kanbanData.get(oldStage).remove(task);
		task.changeStage(newStage);
		kanbanData.get(newStage).add(task); 
	}
	
	public Task searchForTask(String name) {
		Task task = null;
		for (Stage stage: kanbanData) {
			try {
				task = stage.getTask(name);
			} catch (IllegalArgumentException e) { }
		}
		return task;
	} 
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("======================================================\n");
		buffer.append(name + "\n\n"); 
		for (Stage s: kanbanData) {
			buffer.append(s.toString()+"\n");
		}
		buffer.append("======================================================");
		return buffer.toString();
	}
}
