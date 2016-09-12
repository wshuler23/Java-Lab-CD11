package Shuler.Willie.AliceandBobGreeting;

import java.util.Scanner;

/**
 * Created by willieshuler on 9/9/16.
 */
public class AliceandBobGreeting {


    public void getUserName() {

        System.out.println("Enter your first name: ");
    }

    public void readUsersName() {

        Scanner userName = new Scanner(System.in);
        String usersName = userName.next();

        if (usersName.equals("Bob") || usersName.equals("Alice") ) {

            System.out.println("Greetings!");
        }

        else {
            System.out.println("I'm afraid I don't know who you are.");
        }

        }

    public static void main(String[] args) {

        AliceandBobGreeting aliceandBobGreeting = new AliceandBobGreeting();

        aliceandBobGreeting.getUserName();
        aliceandBobGreeting.readUsersName();

    }
}
