 import java.util.Scanner;


public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strinput = sc.nextLine();

        String temp = "";

        for (int i = 0; i < strinput.length(); i++) {
            char ch = strinput.charAt(i);
            if (temp.indexOf(ch) == -1) {
                temp += ch;
            }

        }

        System.out.println(temp);
    }

}