package Interface;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Rahat
 */
public class Validation {
    String validationType;
    String textString;
    
    public boolean checkValidation(String validationType, String textString){               
        String pattern = "";        
        if(textString.equals("")){
            return false;
        }else{
            if(validationType.equals("text")){
                pattern = "^[a-z A-Z]*$";
            }else if(validationType.equals("number")){
                pattern = "^[0-9]*$";
            }else if(validationType.equals("email")){
                pattern = "^[A-Za-z0-9]*@[A-Za-z0-9]*.[A-Za-z0-9]*$";		
            }else if(validationType.equals("phone")){
                pattern = "\\d{3}-\\d{7}";
            }else{
                return false;
            }
        }
        Pattern uPattern = Pattern.compile(pattern);
        Matcher m = uPattern.matcher(textString);
        if (m.find())
            return true;
        else
            return false;
    }    

    boolean checkValidation(String text, JTextField catTxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
