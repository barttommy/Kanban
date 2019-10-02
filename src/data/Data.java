package data;

public class Data {
	
	private Data() { }
	
	/**
	 * Factory method for creating a new Kanban sheet
	 */
	static public final Kanban newKanban(String name) {
		return new KanbanSheet(name);
	}
	
	/**
	 * Factory method for creating new task
	 * TODO: Develop rules for title/description length
	 */
	static public Task newTask(String title, String description) {
		if (title == null || description == null) {
			throw new IllegalArgumentException();
		}
		title = title.trim();
		description = description.trim();
		
		if (title.isEmpty() || description.isEmpty() || title.length() > 32 || description.length() > 256) {
			throw new IllegalArgumentException();
		}
		Task task = new TaskObj(title, description);
		return task;
	}
}  
