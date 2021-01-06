import java.util.*;
public class Sample_scanner_program {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s = scan.next();
            s = s + scan.nextLine();

            //if the string contains white spaces at the starting of the line are removed

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }

}
