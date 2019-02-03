package de.c24.finacc.klt.exceptions;

public class AgeIsNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "The Age is not in between 18 and 67!";
	}
}
