package data;

/**
 * Kanban Object
 */
public interface Kanban {
	
	/**
	 * @return number of Stages in the Kanban
	 */
	public int size();
	
	/**
	 * Add a Task to the Kanban sheet's first stage
	 * @param t the Task object to add
	 */
	public void addTask(Task t);
	
	/**
	 * Remove a Task from the Kanban sheet
	 * @param name the name of the Task object to be removed
	 */
	public void removeTask(String name);
	
	/**
	 * Move a Task object between stages
	 * @param name the name of the Task object to be moved
	 * @param change the number of Stages to move the Task by
	 */
	public void moveTask(String name, int change);
	
	/**
	 * @return a String representation of the Kanban Sheet which includes all Stages and Tasks
	 */
}