/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.jtechy.web.actions;

import in.co.jtechy.web.helpers.ApplicationConstants;
import in.co.jtechy.web.helpers.ApplicationException;
import in.co.jtechy.web.models.User;
import in.co.jtechy.web.services.IUserService;

/**
 *
 * @author Ganesh
 */
public class UserAction {

	// Properties that will be injected
	private IUserService userService;

	// Properties that will be maintained by valuestack
	private User user;
	private ApplicationException applicationException;
	private String message;

	public ApplicationException getApplicationException() {
		return applicationException;
	}

	public void setApplicationException(
			ApplicationException applicationException) {
		this.applicationException = applicationException;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLiveDefault() {
		return ApplicationConstants.SUCCESS;
	}

	public String login() {
		String flagStr = ApplicationConstants.FAILURE;
		try {
			if (user != null) {
				user = userService
						.loginUser(user.getName(), user.getPassword());
				flagStr = ApplicationConstants.SUCCESS;
			}
		} catch (ApplicationException ae) {
			applicationException = ae;
		}
		return flagStr;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
