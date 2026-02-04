package exceptions;

public class InvalidBrowserException extends RuntimeException {
	
	public InvalidBrowserException() {
	super("Use a valid browser");
	}
}
