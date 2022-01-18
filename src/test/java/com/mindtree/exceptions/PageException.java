package com.mindtree.exceptions;

/**This is a user defined exception to handle exceptions that occur in page classes
 * @since 21/09/2019
 
 *
 */
@SuppressWarnings("serial")
public class PageException extends Exception {

	public PageException() {
		super();

	}

	public PageException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);

	}

	public PageException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public PageException(String arg0) {
		super(arg0);

	}

	public PageException(Throwable arg0) {
		super(arg0);

	}

}
