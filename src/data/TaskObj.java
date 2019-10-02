package data;

final class TaskObj implements Task {
	private final String name;
	private final String description;
	private int currentStage = 0;
	
	TaskObj(String name, String description) {
		this.name = name;
		this.description = description;
	} 
	
	public String name() {
		return name;
	}
	
	public String description() {
		return description;
	}
	
	public int currentStage() {
		return currentStage;
	}
	
	public void changeStage(int stage) {
		currentStage = stage;
	}
	
	public boolean equals(Object thatObject) {
		if (thatObject == this) {
			return true;
		} else if (!(thatObject instanceof Task)) {
			return false;
		} 
		Task t = (Task) thatObject;
		return t.name().toLowerCase().equals(name.toLowerCase());
	}
	
	public String toString() {
		return String.format("%s: %s", name, description);
	}
}