package data;

import java.util.List;
import java.util.ArrayList;

final class StageSet implements Stage {
	private List<Task> stageData;
	private final String name;
	
	StageSet(String name) {
		this.name = name;
		stageData = new ArrayList<Task>();
	}
	
	public String name() {
		if (stageData != null) {
			return name;
		} else {
			throw new IllegalArgumentException();
		}
	} 
	
	public int size() {
		if (stageData != null) {
			return stageData.size();
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public Task getTask(String name) {
		for (Task task: stageData) {
			Task t = new TaskObj(name, "description");
			if (task.equals(t)) {
				return task;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public void add(Task t) {
		if (stageData != null) {
			stageData.add(t);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void remove(Task t) {
		if (stageData != null) {
			stageData.remove(t);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name+"\n"); 
		for (Task t: stageData) {
			buffer.append(t.toString()+"\n");
		}
		return buffer.toString();
	}
}