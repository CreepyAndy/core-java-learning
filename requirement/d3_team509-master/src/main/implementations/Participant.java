package implementations;

// Represents a participant with a list of statements said and a list of statements heard
public class Participant {

    // EFFECTS: list of statements said and list of statements heard are empty
    public Participant() {
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
        return false;  // stub
    }

    // MODIFIES: this
    // EFFECTS: statement is added to list of statements heard and string of form "I heard <statement>" is returned
    public String hear(String statement) {
        return null;   // stub
    }
}

