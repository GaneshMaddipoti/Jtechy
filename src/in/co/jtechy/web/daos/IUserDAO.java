package in.co.jtechy.web.daos;

import in.co.jtechy.web.helpers.ApplicationException;
import in.co.jtechy.web.models.User;

public interface IUserDAO {

    public User login(String name, String passwd) throws ApplicationException;

}
