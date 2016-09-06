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
public class ApplicationException extends Exception{

    private String msgDesc;

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public ApplicationException(String msg){
        super(msg);
        msgDesc = msg;
    }   

}
