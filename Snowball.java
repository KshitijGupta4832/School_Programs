import java.util.*;
public class Snowball {
    public static String Snowballtest(String str) {
        int wordsize = 0, nextwordsize = 0;
        boolean space = false,check = true;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                wordsize++;
                space = false;
            } else if (!space) {
                if (nextwordsize > wordsize) {
                    check = false;
                    break;
                }
                nextwordsize = wordsize;
                wordsize = 0;
                space = true;
            }
        }
        return check==true?"SNOWBALL STRING":"NOT A SNOWBALL STRING"; 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT");
        String str = in.nextLine();
        int length = str.length();
        if (str.charAt(length - 1) == '.' || str.charAt(length - 1) == '?') {
            System.out.println(Snowballtest(str));
        } else {
            System.out.println("Invalid Input");
        }
        in.close();
    }
}
