package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import implementations.Participant;
import implementations.Presenter;
import model.Echoer;

public class EchoerTest {
	@Test
	public void testDoParticipantEcho() {
		Echoer patricipant = new Participant();
		String echoedStatement = patricipant.echo("Hello Echo");
		assertTrue(echoedStatement.equals("this participant echo: Hello Echo"));
	}
	
	@Test
	public void testDoPresenterEcho() {
		Echoer patricipant = new Presenter();
		String echoedStatement = patricipant.echo("Hello Echo");
		assertTrue(echoedStatement.equals("this participant echo: Hello Echo"));
	}
	
	@Test
	public void testDidISay() {
		Echoer patricipant = new Participant();
		patricipant.echo("Hello Echo");
		assertTrue(patricipant.didISay("Hello Echo"));
	}
	
	@Test
	public void testDidIHear() {
		Echoer patricipant = new Participant();
		patricipant.echo("Hello Echo");
		assertTrue(patricipant.didIHear("Hello Echo"));
	}
	
	@Test
	public void testDidIHearPresenter() {
		Echoer patricipant = new Presenter();
		patricipant.echo("Hello Echo");
		assertTrue(patricipant.didIHear("Hello Echo"));
	}
}


