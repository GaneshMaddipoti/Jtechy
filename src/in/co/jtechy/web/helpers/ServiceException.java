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
public class ServiceException extends ApplicationException{

    public ServiceException(String msg){
        super("Exception at Service layer : " + msg);
    }

}
