package com.mindtree.adminanduser.exceptions.serviceexceptions;

import java.io.Serializable;

public class InvalidUserException extends AdminAndUserServiceException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidUserException() {
		super();
	}

	public InvalidUserException(String description, Throwable cause, boolean arg2, boolean arg3) {
		super(description, cause, arg2, arg3);
	}

	public InvalidUserException(String description, Throwable cause) {
		super(description, cause);
	}

	public InvalidUserException(String description) {
		super(description);
	}

	public InvalidUserException(Throwable description) {
		super(description);
	}
	
	

}
