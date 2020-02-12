package com.mindtree.adminanduser.exceptions.controllerexception;

import java.io.Serializable;

import com.mindtree.adminanduser.exceptions.AdminAndUserException;

public class ControllerException extends AdminAndUserException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControllerException() {
		super();
	}

	public ControllerException(String description, Throwable cause, boolean arg2, boolean arg3) {
		super(description, cause, arg2, arg3);
	}

	public ControllerException(String description, Throwable cause) {
		super(description, cause);
	}

	public ControllerException(String description) {
		super(description);
	}

	public ControllerException(Throwable description) {
		super(description);
	}
	

}
