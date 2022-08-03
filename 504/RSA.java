import java.math.BigInteger;

public class RSApractical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plain text: ");
        BigInteger pt = new BigInteger(sc.next());
        System.out.println("Enter 2 Prime number:");
        
        BigInteger p = new BigInteger(sc.next());
        BigInteger q = new BigInteger(sc.next());
        BigInteger n = p.multiply(q);
        
        BigInteger one = new BigInteger("1");
        BigInteger two = p.subtract(one);
        BigInteger three = q.subtract(one);
        BigInteger four = two.multiply(three);
        
        BigInteger e;
        do{
            e = new BigInteger(2*512, new Random());
        }
        while((e.compareTo(four) != 1) || (e.gcd(four).compareTo(one)) !=0);
        System.out.println("Public Key is: " + e);
        BigInteger d = e.modInverse(four);
        System.out.println("private key is: "+ d);
        BigInteger ct = pt.modPow(e, n);
        
        System.out.println("Cipher Text is: "+ ct);
        BigInteger ptl = ct.modPow(d,n);
        System.out.println("Plain txt is: "+ ptl);
      }
  
}