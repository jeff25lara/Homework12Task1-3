package Class12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Write a program that reads two people's first
        // names and if they're expecting boy or girl?

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter moms first name");
        String momName=scan.next();
        System.out.println("Please enter dads first name");
        String dadName=scan.next();
        System.out.println("Is it a boy or girl?");
        String gender=scan.next();
        String suggestedName="";

        if (gender.equals("boy")){
            suggestedName=dadName.substring(0,2)+momName.substring(0,2);
        }else {
            suggestedName=momName.substring(0,2)+dadName.substring(0,2);
        }

        System.out.println("Suggested baby name is "+suggestedName);
    }
}
