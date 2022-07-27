//Aim:Write a program to implement RailFence Cipher.

import java.util.Scanner;
public class prac3 {
        public static void main(String[] args) {
        String rf;
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        rf=sc.nextLine();
        int i;
        System.out.println("string="+rf);
        for(i=0;i<rf.length();i=i+2)
        {
            char c=rf.charAt(i);
            s=s+c;
            System.out.print(c);
        }
        for(int j=1;j<rf.length();j=j+2)
        {
            char c=rf.charAt(j);
            s=s+c;
            System.out.print(c);
        }
        System.out.println("\nCipher text is="+s);
        
    }
        
}


Output:

Enter a string:
workhard

---
First half:
wrhr
Second half:
okad
---
Cipher text: wrhrokad
