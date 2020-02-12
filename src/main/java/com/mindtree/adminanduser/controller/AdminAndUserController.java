package com.mindtree.adminanduser.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.adminanduser.entity.Project;
import com.mindtree.adminanduser.entity.User;
import com.mindtree.adminanduser.exceptions.AdminAndUserException;
import com.mindtree.adminanduser.exceptions.controllerexception.ControllerException;
import com.mindtree.adminanduser.exceptions.serviceexceptions.AdminAndUserServiceException;
import com.mindtree.adminanduser.service.AdminAndUserService;

@Controller
public class AdminAndUserController {

	static int userId;
	@Autowired
	AdminAndUserService service;
	
	@RequestMapping("/")
	public String showFirstPage() {
		return "Initial";
	}
	
	@PostMapping("/AdminPage")
	public String showAdminPage(@RequestParam int userIdLocal,String password) throws ControllerException {
		
		String response = "";
		userId=userIdLocal;
		String check="";
		try {
			check = service.CheckWheterUserOrAdmin(userIdLocal,password);
		} catch (AdminAndUserServiceException e) {
			throw new ControllerException(e.getMessage(),e);
		}
		if(check.equalsIgnoreCase("admin"))
		response=response+"AdminPage";
		else if(check.equalsIgnoreCase("user"))
			response=response+"UserPage";
		return response;
			
	}
	
	@RequestMapping("/adduser")
	public String addUser(Map<String,Object> modelMap) {
		
		List<Project> projects = service.getAllProjects();
		System.out.println(projects.toString());
		modelMap.put("projects", projects);
		return "adduser";
	}
	
	
	@RequestMapping("/addproject")
	public String addProject() {
		return "addproject";
	}
	
	@PostMapping("/projectadded")
	public String addTheProject(Project project) throws ControllerException {
		try {
			service.addProjectToDB(project);
		} catch (AdminAndUserServiceException e) {
			throw new ControllerException(e.getMessage(),e);
		}
		return "AdminPage";
	}
	
	@PostMapping("/useradded")
	public String addTheUser(@RequestParam int projectId,User user) {
		System.out.println(user);
		service.addUserToDB(user,projectId);
		return "AdminPage";
	}
	
	@RequestMapping("/viewallprojects")
	public String showAllTheProjects(Map<String,Object> modelMap) {
		List<Project> projects = service.getAllProjects();
		System.out.println(projects.toString());
		modelMap.put("projects", projects);
		return "showallprojects";
		
	}
	@RequestMapping("/viewbyuserid")
	public String findUser() {
		
		return "findbyempid";
		
	}
	@PostMapping("/showUser")
	public String showUser(@RequestParam int userId,Map<String,Object> modelMap) {
		
		User user = service.getUserFromDB(userId);
		modelMap.put("user", user);
		return "showUser";
		
	}
	
	@RequestMapping("/viewallusers")
	public String showAllTheUsers(Map<String,Object> modelMap) {
		List<User> users = service.getAllUsersFromDB();
		modelMap.put("users", users);
		return "allusers";
	}
	
	@RequestMapping("/getProject/{projectId}")
	public String showProject(@PathVariable int projectId,Map<String,Object> modelMap) {
		System.out.println(projectId);
		Project project = service.getProject(projectId);
		modelMap.put("project", project);
		return "showProject";
	}
	
	@RequestMapping("/viewproject")
	public String showUserProject(Map<String,Object> modelMap) {
		
		Project project = service.getUserProject(userId);
		modelMap.put("project",project);
		return "showProject";
	}
	
	@RequestMapping("/changepassword")
	public String changePassword() {
		return "changepassword";
	}
	
	@PostMapping("/passwordChanged")
	public String passwordChanged(@RequestParam String oldPassword,String newPassword) {
		
		service.changeUserPassword(oldPassword,newPassword,userId);
		return "UserPage";
	}
	
	@RequestMapping("/viewteammembers")
	public String showTeamMembers(Map<String,Object> modelMap) {
		
		List<User> users = service.getTeamMembers(userId);
		modelMap.put("users", users);
		return "teamMembers";
	}
	
	@RequestMapping("/RedirectAdminPage")
	public String redirectAdminPage() {
		return "Initial";
	}
}
