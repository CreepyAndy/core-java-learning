package implementations;

import java.util.ArrayList;
import java.util.HashSet;

import model.Echoer;
import model.Hearer;

// Represents a participant with a list of statements said and a list of statements heard
public class Participant implements Echoer, Hearer{
	private HashSet<String> heardStatement;
	private HashSet<String> saidStatement;
	

    // EFFECTS: list of statements said and list of statements heard are empty
    public Participant() {
    	heardStatement = new HashSet<String>();
    	saidStatement = new HashSet<String>();
    }

    // MODIFIES: this
    // EFFECTS: statement is added to list of statements said and to list of statements heard
	@Override
	public String echo(String statement) {
		// TODO Auto-generated method stub
		heardStatement.add(statement);
		saidStatement.add(statement);
		return "this participant echo: " + statement;
	}

    // EFFECTS: returns true if this presenter??? (Participant???) has heard the statement
    public boolean didIHear(String statement) {
    	return heardStatement.contains(statement);
    }

    // EFFECTS: returns true if this presenter??? (Participant???) has said the statement
    public boolean didISay(String statement) {
        return saidStatement.contains(statement);
    }

    // MODIFIES: this
    // EFFECTS: statement is added to list of statements heard and string of form "I heard <statement>" is returned
	@Override
	public String hear(String statement) {
		heardStatement.add(statement);
		return "I heard " + statement;
	}




}

