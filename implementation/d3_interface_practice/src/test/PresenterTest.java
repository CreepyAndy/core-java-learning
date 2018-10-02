package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import implementations.Participant;
import implementations.Presenter;

public class PresenterTest {

	@Test
	public void testDoSpeak() {
		Presenter presenter = new Presenter();
		Participant patricipant = new Participant();
		String said = presenter.say("Hello World", patricipant);
		assertTrue(said.equals("this presenter speak to a hearer: Hello World"));
	}
	
	@Test
	public void testDidISay() {
		Presenter presenter = new Presenter();
		Participant patricipant = new Participant();
		presenter.say("Hello World", patricipant);
		boolean isSaid = presenter.didISay("Hello World");
		assertTrue(isSaid);
	}
	
	@Test
	public void testDoEcho() {
		Presenter presenter = new Presenter();
		String echoedStatement = presenter.echo("Hello Echo");
		assertTrue(echoedStatement.equals("this presenter echo: Hello Echo"));
	}
	
	@Test
	public void testDidIHear() {
		Presenter presenter = new Presenter();
		presenter.echo("Hello Echo");
		assertTrue(presenter.didIHear("Hello Echo"));
	}
	

}
