/* SpellBackwards receives as input a word, and prints as output the word spelled in reverse.
 * 
 * Author:  Todd Paschal
 * 14 Jan 2015
 * 
 */

package org.spellkit;

public class SpellBackwards {
	
	// Member variables
	private String word;

	// Methods
	public String reverse() {
		StringBuilder reverseValue = new StringBuilder();
		for(int i =word.length()-1; i>=0; i-- ) {
			reverseValue.append(word.charAt(i));
		}
		return reverseValue.toString();
	}
	
	// Getters & Setters
	public String getWord() {
		return this.word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
}
