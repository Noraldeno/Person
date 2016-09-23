package person;

public interface Person{

	/**
	 * Returns name of person
	 */
	public int getName();

	/**
	 * Returns age of person
	 */
	public int getAge();

	/**
	 * Updates how many miles person walked in
	 * a set time
	 * 
	 * @param miles Takes in the number of miles walked
	 * @param min   Takes in how long the person has been walking
	 */
	public void walk(int miles, int min);

	/**
	 * Updates how long the person has sat
	 * 
	 * @param min Takes the amount of time person has sat down
	 */
	public void sit(int min)
}