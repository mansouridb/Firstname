package FName;

import java.util.Scanner;

public class Surname {
    public static void main(String[] args) {
        Scanner reader = new Scanner( System.in );
        String first_name;
        System.out.print("Enter your first name: ");
        first_name = reader.next();
        System.out.println("You're first name is " + first_name);
    }
}
