package com.mindtree.exceptions;

/**This is a user defined exception to handle exceptions that occur in webdriverhelper classes
 * @since 21/09/2019
 
 *
 */
@SuppressWarnings("serial")
public class WebDriverHelperException extends Exception {

	public WebDriverHelperException() {
		super();
	}

	public WebDriverHelperException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);

	}

	public WebDriverHelperException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public WebDriverHelperException(String arg0) {
		super(arg0);

	}

	public WebDriverHelperException(Throwable arg0) {
		super(arg0);

	}

}
