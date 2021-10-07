package Jannat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your section: ");
        String section = input.nextLine();


        Hobby myHobby = new Hobby();
        Info myDetails = new Info();
        System.out.println("Your section is : " +section);
        System.out.println("Your name is : " + myDetails.myName);
        System.out.println("Your id is : " + myDetails.myId);
        System.out.println("Your hobby is : " + myHobby.myHobbyName);



    }
}
