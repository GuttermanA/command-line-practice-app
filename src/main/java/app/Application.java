package app;

import java.util.Scanner;

public class Application {

    public static void sayHello() {
        System.out.println("Hello world");
    }

    private static void mainMenuDisplay() {
        System.out.print(
                "Welcome. What do you want to do?" + System.lineSeparator() +
                        "1 - Search artist" + System.lineSeparator() +
                        "2 - Search song" + System.lineSeparator() +
                        "q - quit"
        );
    }

    private static void menuRouter(String entry) {
        switch (entry) {
            case "1": searchArtist(); break;
            case "2": searchSong(); break;
            default:
                System.out.println("Please enter a valid choice");
                menuRouter(entry);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        Timer timer = new Timer();
//        timer.schedule(sayHello(), 0, 1000);

        mainMenuDisplay();

//        System.out.println("Please enter artist name:");
        String entry;
        while(!userInput.nextLine().toLowerCase().equals("q") ) {

            entry = userInput.nextLine();
            sayHello();
        }


        userInput.close();

        System.exit(0);
    }

}
