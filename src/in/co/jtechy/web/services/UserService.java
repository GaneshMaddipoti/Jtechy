package in.co.jtechy.web.services;

import in.co.jtechy.web.daos.IUserDAO;
import in.co.jtechy.web.helpers.ApplicationException;
import in.co.jtechy.web.models.User;

public class UserService implements IUserService {

    private IUserDAO userDAO;
    
    public UserService() {
    }

    public IUserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User loginUser(String name, String passwd) throws ApplicationException {
    	User user =  getUserDAO().login(name, passwd);
        return user;
    }


    
}
