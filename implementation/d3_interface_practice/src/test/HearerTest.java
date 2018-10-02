package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementations.Participant;
import implementations.Presenter;
import model.Hearer;
import model.Speaker;

public class HearerTest {
	@Test
	public void testDoHear() {
		Hearer patricipant = new Participant();
		String heard = patricipant.hear("Hello");
		assertTrue(heard.equals("I heard Hello"));
	}
	
	@Test
	public void testDidIHear() {
		Hearer patricipant = new Participant();
		Speaker presenter = new Presenter();
		presenter.say("Hello", patricipant);
		assertTrue(patricipant.didIHear("Hello"));
	}
}
