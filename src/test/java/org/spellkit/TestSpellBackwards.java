/* Test the SpellBackwards class 
 * 
 * Author: Todd Paschal
 * Date:   14 Jan 2015
 */

package org.spellkit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestSpellBackwards {

	private SpellBackwards spell;
	
	@Before
	public void testSetup() {
		spell = new SpellBackwards();		
	}
	
	@Test
	public void testReverse() {
		spell.setWord("George Washington");
		Assert.assertEquals("Strings don't match.", "notgnihsaW egroeG", spell.reverse());
		
		spell.setWord("Supercalifragilisticexpialidocious");
		Assert.assertEquals("Strings don't match.", "suoicodilaipxecitsiligarfilacrepuS", spell.reverse());
		
		spell.setWord("Say it, don't spray it");
		Assert.assertNotEquals("Strings match,  but shouldn't", "Spray it", spell.reverse());
	}
}
