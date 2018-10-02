package model;

public interface Echoer {
	public String echo(String statement);
	public boolean didISay(String statement);
	public boolean didIHear(String statement);
}