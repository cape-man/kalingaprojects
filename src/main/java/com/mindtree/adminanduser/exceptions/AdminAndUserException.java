package com.mindtree.adminanduser.exceptions;

import java.io.Serializable;

public class AdminAndUserException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminAndUserException() {
		super();
	}

	public AdminAndUserException(String description, Throwable cause, boolean arg2, boolean arg3) {
		super(description, cause, arg2, arg3);
	}

	public AdminAndUserException(String description, Throwable cause) {
		super(description, cause);
	}

	public AdminAndUserException(String description) {
		super(description);
	}

	public AdminAndUserException(Throwable description) {
		super(description);
	}

}
