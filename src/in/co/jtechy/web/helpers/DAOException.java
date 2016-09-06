/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.jtechy.web.helpers;

/**
 *
 * @author Ganesh
 */
@SuppressWarnings("serial")
public class DAOException extends ApplicationException{

    public DAOException(String msg){
        super("Exception at DAO layer : " + msg);
    }

    public DAOException(String msg, String queryStr){
        super("Exception at DAO layer : " + msg + "\n Query String is : " + queryStr);
    }

}
