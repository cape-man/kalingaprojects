package com.mindtree.adminanduser.exceptions.serviceexceptions;

import java.io.Serializable;

import com.mindtree.adminanduser.exceptions.AdminAndUserException;

public class AdminAndUserServiceException extends AdminAndUserException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminAndUserServiceException() {
		super();
	}

	public AdminAndUserServiceException(String description, Throwable cause, boolean arg2, boolean arg3) {
		super(description, cause, arg2, arg3);
	}

	public AdminAndUserServiceException(String description, Throwable cause) {
		super(description, cause);
	}

	public AdminAndUserServiceException(String description) {
		super(description);
	}

	public AdminAndUserServiceException(Throwable description) {
		super(description);
	}
	
	

}
