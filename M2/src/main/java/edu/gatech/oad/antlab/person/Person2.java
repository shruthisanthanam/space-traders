package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Marissa
 * @version 1.2
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
      //Person 2 put your implementation here
        String newOutput = "";
        List<Character> charArray = new ArrayList<Character>();
        char[] inputCharArray = input.toCharArray();
        for(char i: inputCharArray) {
            charArray.add(i);
        }

        while(charArray.size()!=0){
            int rand = charArray.size() * (int)(Math.random());
            newOutput += charArray.get(rand);
            charArray.remove(rand);
        }
        return newOutput;
    }
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
