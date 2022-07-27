//Aim:Write a program to implement Simple Columnar Technique.

import java.util.*;

public class Prac3b {
    public static void main(String[] args) {
        String text;
        int key1;
        int key[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message : ");
        text = sc.nextLine();
        char a[][] = new char[50][4];
        int l = text.length();
        int row;
        if (l % 4 == 0) {
            row = l / 4;
        } else {
            row = (l / 4) + 1;
        }
        int k = 0;
        System.out.println("\nMatrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = text.charAt(k);
                k++;
                System.out.print(a[i][j] + " ");
                if (l == k) {
                    break;
                }
            }
            System.out.println(" \n");
        }
        String s = "";
        System.out.println("Enter a key: ");
        for (int i = 0; i < 4; i++) {
            key[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {

            key1 = key[i];
            for (int j = 0; j < row; j++) {
                String c = a[j][key1] + " ";
                if (c != "\0") {
                    s = s + c;
                }
            }
        }
        System.out.println("Cipher text: " + s);
    }
}



Output:

Enter a message :
helloworld
Matrix:
h e l l

o w o r
l d
Enter a key:
3
1
0
2
Cipher text: l r e w d h o l l o