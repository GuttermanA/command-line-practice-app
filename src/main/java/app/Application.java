package app;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter artist name");
        while(!userInput.nextLine().toLowerCase().equals('q') ) {

        }


        userInput.close();
    }

}
