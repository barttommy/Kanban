package data;

public interface Stage {
	
	/**
	 * @return name of the Stage
	 */
	public String name();
	
	/**
	 * @return number of Task Objects in the Stage
	 */
	public int size();
	
	/**
	 * @param name the name of the Task to get
	 * @return the Task that matches the name
	 * @throws IllegalArgumentException if no Task is found
	 */
	public Task getTask(String name);
	
	/**
	 * Add a Task to the Stage
	 * @param t Task to be added
	 */
	public void add(Task t);
	
	/**
	 * Remove a Task from the Stage
	 * @param t Task to be removed
	 */
	public void remove(Task t);
	
	/**
	 * @return String representation of each Task in the Stage
	 */
}