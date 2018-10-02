package model;

public interface Speaker {
	public String say(String statement, Hearer hearer);
	public boolean didISay(String statement);
}
