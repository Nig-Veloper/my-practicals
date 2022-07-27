package prac1a_504;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Prac1a_504 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message ,encryptedmessage="";
        int key;
        char ch ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message : ");
        message=sc.nextLine();
        
        System.out.println("Enter Key : ");
        key = sc.nextInt();
        for(int i=0;i<message.length();i++){
         ch = message.charAt(i);
           if(ch>='a' && ch<='z'){
           ch = (char)(ch + key);
              if(ch > 'z'){
               ch = (char)(ch - 'z' + 'a' - 1);
                }
           encryptedmessage +=ch;
           }
           
           else if(ch >= 'A' && ch <= 'Z'){
           ch = (char)(ch + key);
            if(ch > 'Z'){
               ch = (char)(ch - 'Z' + 'A' - 1);
                }
           encryptedmessage +=ch;
           }
           
           else{
           encryptedmessage +=ch;
           }
         
         }
        System.out.println("Encrypted message is: "+encryptedmessage);
        
    }
}

OUTPUT:
run:
Enter a message : 
hello rehan
Enter Key : 
12345
Encrypted message is: ょやるるゎ ゑやょむろ
BUILD SUCCESSFUL (total time: 14 seconds)