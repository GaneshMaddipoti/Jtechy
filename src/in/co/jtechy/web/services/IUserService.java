package in.co.jtechy.web.services;

import in.co.jtechy.web.helpers.ApplicationException;
import in.co.jtechy.web.models.User;

public interface IUserService {

    public User loginUser(String name, String passwd) throws ApplicationException;

}
