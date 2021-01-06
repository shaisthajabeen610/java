import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
 /*this is sample program to read an user input or input manually*/


        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("enter a number");
            int N = scanner.nextInt();

            /*scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/
            /*the above method skips the integer which matches the pattern*/
            if(N%2!=0){
                System.out.println("Weird");
            }
            else if(N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            else if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            else if(N>20 && N<=100){
                System.out.println("Not Weird");
            }

            scanner.close();
        }
    }


