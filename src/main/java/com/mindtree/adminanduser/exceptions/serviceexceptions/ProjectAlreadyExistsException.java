package com.mindtree.adminanduser.exceptions.serviceexceptions;

import java.io.Serializable;

public class ProjectAlreadyExistsException extends AdminAndUserServiceException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProjectAlreadyExistsException() {
		super();
	}

	public ProjectAlreadyExistsException(String description, Throwable cause, boolean arg2, boolean arg3) {
		super(description, cause, arg2, arg3);
	}

	public ProjectAlreadyExistsException(String description, Throwable cause) {
		super(description, cause);
	}

	public ProjectAlreadyExistsException(String description) {
		super(description);
	}

	public ProjectAlreadyExistsException(Throwable description) {
		super(description);
	}
	

}
