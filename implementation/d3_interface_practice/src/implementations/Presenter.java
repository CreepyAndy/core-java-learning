package implementations;

import java.util.ArrayList;
import java.util.HashSet;

import model.Echoer;
import model.Hearer;
import model.Speaker;

// Represents a presenter with a list of statements said and a list of statements heard
public class Presenter implements Speaker, Echoer{
	private HashSet<String> heardStatement;
	private HashSet<String> saidStatement;
	
    // EFFECTS: list of statements said and list of statements heard are empty
    public Presenter() {
    	heardStatement = new HashSet<String>();
    	saidStatement = new HashSet<String>();
    }

    // MODIFIES: this
    // EFFECTS: statement is added to list of statements said and to list of statements heard
	@Override
	public String echo(String statement) {
		saidStatement.add(statement);
		heardStatement.add(statement);
		return "this presenter echo: " + statement;
	}

    // EFFECTS: returns true if this presenter has heard the statement
    public boolean didIHear(String statement) {
        return heardStatement.contains(statement);
    }

    // EFFECTS: returns true if this presenter has said the statement
    public boolean didISay(String statement) {
        return saidStatement.contains(statement);
    }

    // MODIFIES: this, hearer
    // EFFECTS: hearer hears statement and statement is added to list of statements said
	@Override
	public String say(String statement, Hearer hearer) {
		// TODO Auto-generated method stub
		saidStatement.add(statement);
		hearer.hear(statement);
		return "this presenter speak to a hearer: " + statement;
	}





}

