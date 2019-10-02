package data;

/**
 * A Task Object
 * 
 * <p><b>Invariants:</b></p>
 * <ul>
 *   <li>name is non-null, trimmed, non-empty, and less than or equal to 32 characters long</li>
 *   <li>description non-null, trimmed, non-empty, and less than or equal to 256 characters long</li>
 * </ul>
 */
public interface Task {
	
	/**
	 * @return the name of the Task
	 */
	public String name();
	
	/**
	 * @return the description of the Task
	 */
	public String description();
	
	/**
	 * @return the index of the Task's current Stage
	 */
	public int currentStage();
	
	/**
	 * Changes the current Stage of the Task
	 * @param stage the stage to change the Task object to
	 */
	public void changeStage(int stage);
	
	/**
	 * Compare the name of this Object to that Object
	 * @param thatObject the Object to be compared to this Object
	 * @return true if thatObject is the same as thatObject
	 */
	public boolean equals(Object thatObject);
	
	/**
	 * @returns a formatted string of a Task of the following format:
	 * <code>"name: description"</code>.
	 */
}
