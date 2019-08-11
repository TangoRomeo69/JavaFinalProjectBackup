/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectFactory;

/**
 *
 * @author chhabi
 */
public class UserOF {
 
    private int user_id;
    private String user_name;
    private String user_password;
    private String user_email;
    private String user_type;
    
    public UserOF(){
        this.user_id    = 0;
        this.user_name     = "";
        this.user_password = "";
        this.user_email    = "";
        this.user_type     = "";
    }
    
    public UserOF( int user_id, String user_name, String user_password, String user_email, String user_type ){
        this.user_id       = user_id;
        this.user_name     = user_name; 
        this.user_password = user_password;
        this.user_email    = user_email;
        this.user_type     = user_type; 
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
         
}
