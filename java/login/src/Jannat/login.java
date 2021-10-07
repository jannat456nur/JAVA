package Jannat;
import java.util.Scanner;
public class login {

    public static void main(String[] args) {
	// write your code here
        Scanner input =new Scanner (System.in);
        String user,confirmUser,pass,confirmPass;

        System .out.print("Hi there!!For get help please registered first.");

        System .out.print("Enter your Username:");
        user=input.nextLine();
        System .out.print("Enter your confirm Username:");
        confirmUser=input.nextLine();


        System .out.print("Enter your pass:");
        pass=input.nextLine();


        System .out.print("Enter your confirm pass:");
        confirmPass=input.nextLine();
        if(user.equals(confirmUser)&&(pass.equals(confirmPass))){
            System.out.println("Welcome Sir/Madam,");
        }
        else{
            System.out.println("Something wrong!");
        }
    }
}
