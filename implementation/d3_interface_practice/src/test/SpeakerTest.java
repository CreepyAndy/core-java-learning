package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementations.Participant;
import implementations.Presenter;
import model.Hearer;
import model.Speaker;

public class SpeakerTest {
	@Test
	public void testDoSpeak() {
		Speaker presenter = new Presenter();
		Hearer patricipant = new Participant();
		String said = presenter.say("Hello World", patricipant);
		assertTrue(said.equals("this presenter speak to a hearer: Hello World"));
	}
	
	@Test
	public void testDidISay() {
		Speaker presenter = new Presenter();
		Hearer patricipant = new Participant();
		presenter.say("Hello World", patricipant);
		boolean isSaid = presenter.didISay("Hello World");
		assertTrue(isSaid);
	}
}
