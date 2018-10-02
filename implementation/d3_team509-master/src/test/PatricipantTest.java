package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import implementations.Participant;
import implementations.Presenter;

public class PatricipantTest {
	Participant patricipant = new Participant();

//	@Before
//	public void buildTestEnvironment() {
//		Participant patricipant = new Participant();
//	}

	@Test
	public void testDoEcho() {
		String echoedStatement = patricipant.echo("Hello Echo");
		assertTrue(echoedStatement.equals("this participant echo: Hello Echo"));
	}
	
	@Test
	public void testDidIHear() {
		patricipant.echo("Hello Echo");
		assertTrue(patricipant.didIHear("Hello Echo"));
	}
	
	@Test
	public void testDidISay() {
		patricipant.echo("Hello Echo");
		assertTrue(patricipant.didISay("Hello Echo"));
	}
	
	@Test
	public void testDoHear() {
		String heard = patricipant.hear("Hello");
		assertTrue(heard.equals("I heard Hello"));
	}

}
