/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practical8sha;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author admin
 */
public class Practical8SHA {
    
    
    public static String encrypt(String input){
        
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            
            byte[] MessageDigest  = md .digest(input.getBytes());
            BigInteger no = new BigInteger(1, MessageDigest);
            
            String hashtxt = no.toString(16);
            return hashtxt;
            
        }catch(Exception e){
            return e.toString();
        }
        
    }
    
    
    


    public static void main(String[] args) {
        System.out.println("HashCode by SHA-1 for :");
        
        System.out.println("\n" + "Hello World"+"\n"+encrypt("Hello World"));
        
    }
    
    
    
}
