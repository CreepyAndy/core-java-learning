package implementations;

import model.Hearer;

// Represents a presenter with a list of statements said and a list of statements heard
public class Presenter {

    // EFFECTS: list of statements said and list of statements heard are empty
    public Presenter() {
        // stub
    }

    // MODIFIES: this
    // EFFECTS: statement is added to list of statements said and to list of statements heard
    public void echo(String statement) {
        // stub
    }

    // EFFECTS: returns true if this presenter has heard the statement
    public boolean didIHear(String statement) {
        return false;  // stub
    }

    // EFFECTS: returns true if this presenter has said the statement
    public boolean didISay(String statement) {
        return false;   // stub
    }

    // MODIFIES: this, hearer
    // EFFECTS: hearer hears statement and statement is added to list of statements said
    public void say(String statement, Hearer hearer) {
        // stub
    }
}

