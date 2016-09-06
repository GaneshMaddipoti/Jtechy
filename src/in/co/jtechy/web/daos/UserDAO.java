package in.co.jtechy.web.daos;

import in.co.jtechy.web.helpers.ApplicationException;
import in.co.jtechy.web.helpers.DAOException;
import in.co.jtechy.web.models.User;

import java.util.List;

@SuppressWarnings("rawtypes")
public class UserDAO extends BaseDAO implements IUserDAO {

    @Override
    public User login(String name, String passwd) throws ApplicationException {
    	User daoObj = null;
        try{
            List list = super.find("from User where name = '" + name + "' and password = '" + passwd + "'");
            if (list.size() > 0) {
                daoObj = (User) list.get(0);
            }
        } catch (Exception e) {
            throw new DAOException(e.getMessage());
        }
        return daoObj;
    }

}
