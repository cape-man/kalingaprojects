package com.mindtree.adminanduser.service;

import java.util.List;

import com.mindtree.adminanduser.entity.Project;
import com.mindtree.adminanduser.entity.User;
import com.mindtree.adminanduser.exceptions.serviceexceptions.AdminAndUserServiceException;

public interface AdminAndUserService {

	String CheckWheterUserOrAdmin(int userIdLocal,String password) throws AdminAndUserServiceException;

	void addProjectToDB(Project project) throws AdminAndUserServiceException;

	List<Project> getAllProjects();

	void addUserToDB(User user, int projectId);

	User getUserFromDB(int userId);

	List<User> getAllUsersFromDB();

	Project getProject(int projectId);

	Project getUserProject(int userId);

	void changeUserPassword(String oldpassword,String newPassowrd, int userId);

	List<User> getTeamMembers(int userId);

}
