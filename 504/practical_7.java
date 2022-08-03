import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class practical_7{
    
    public static void main(String [] args){

        System.out.println("HashCode with MD5");

        System.out.println("For String :"+"\n" + generateHash("Salman"));
        System.out.println("For Number :"+"\n" + generateHash("42"));
        System.out.println("For Null :"+"\n" + generateHash(null));



    }

    public static String generateHash(String input){

        if (input == null){
            return null;
        }

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte [] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashtext = no.toString(16);
            return hashtext;

        }catch(NoSuchAlgorithmException e){
            return e.toString();
        }
    }
}