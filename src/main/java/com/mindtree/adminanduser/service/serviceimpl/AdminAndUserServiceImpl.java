package com.mindtree.adminanduser.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.adminanduser.entity.Project;
import com.mindtree.adminanduser.entity.User;
import com.mindtree.adminanduser.exceptions.AdminAndUserException;
import com.mindtree.adminanduser.exceptions.serviceexceptions.AdminAndUserServiceException;
import com.mindtree.adminanduser.exceptions.serviceexceptions.InvalidUserException;
import com.mindtree.adminanduser.exceptions.serviceexceptions.ProjectAlreadyExistsException;
import com.mindtree.adminanduser.repository.ProjectRepository;
import com.mindtree.adminanduser.repository.UserRepository;
import com.mindtree.adminanduser.service.AdminAndUserService;

@Service
public class AdminAndUserServiceImpl implements AdminAndUserService {

	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public String CheckWheterUserOrAdmin(int userIdLocal,String password) throws AdminAndUserServiceException {
		
		User user2 = userRepository.getOne(userIdLocal);
		String response="";
		if(this.userRepository.existsById(userIdLocal)) {
			if(user2.getPassword().equals(password)) {
			if(user2.getRole().equalsIgnoreCase("user"))
				response=response+"user";
			else if(user2.getRole().equalsIgnoreCase("admin"))
				response=response+"admin";
			else
				response=response+"error";
		}
			else
				throw new InvalidUserException("Invalid User ID or password");
		}
		else
		{
			throw new InvalidUserException("Invalid User ID or password");	
		}
		return response;
	}

	@Override
	public void addProjectToDB(Project project) throws AdminAndUserServiceException {

		int count = 0;
		List<Project> projectsInDB = projectRepository.findAll();
		for(Project projectI:projectsInDB) {
			
			if(!(projectI.getProjectName().equals(project.getProjectName())))
					count++;
		}
		if(count<projectsInDB.size())
			throw new ProjectAlreadyExistsException("Project Already Exists");
		else
		projectRepository.save(project);
	}

	@Override
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	@Override
	public void addUserToDB(User user, int projectId) {

		Project project = projectRepository.getOne(projectId);
		user.setProject(project);
		user.setRole("user");
		userRepository.save(user);
	}

	@Override
	public User getUserFromDB(int userId) {
		return userRepository.getOne(userId);
	}

	@Override
	public List<User> getAllUsersFromDB() {
		
		return userRepository.findAll();
	}

	@Override
	public Project getProject(int projectId) {
		return projectRepository.getOne(projectId);
	}

	@Override
	public Project getUserProject(int userId) {
		
		User user = userRepository.getOne(userId);
		int projectId = user.getProject().getProjectId();
		return projectRepository.getOne(projectId);
	}

	@Override
	public void changeUserPassword(String oldPassword,String newPassword, int userId) {
		
		User user = userRepository.getOne(userId);
		if(user.getPassword().equals(oldPassword)) {
		user.setPassword(newPassword);
		userRepository.save(user);
		}
		
	}

	@Override
	public List<User> getTeamMembers(int userId) {
		
		User user = userRepository.getOne(userId);
		int projectId = user.getProject().getProjectId();
		System.out.println(projectId);
		List<User> users = new ArrayList<User>();
		List<User> allUsers = userRepository.findAll();
		for(User userI : allUsers)
		{
			if(userI.getProject()!=null)
			if((userI.getProject().getProjectId()==projectId)) {
				System.out.println(userI.getProject().getProjectId());
				users.add(userI);
			}
		}
		return users;
	}
}
