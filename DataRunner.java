import java.util.Scanner;

public class DataRunner {
    public static void main(String[] args) {
        UserStory userStory = new UserStory("Year.txt", "Winner.txt");
        System.out.println(userStory);

        // Creates a variable to track the user's choice and sets it to "y"
        String choice = "y";
        Scanner scanner = new Scanner(System.in);

        // Repeats while the user's choice is not "n"
        while (!choice.equals("n")) {
            
          // Prompts user to choose which information to retrieve
            System.out.print("Enter an option (1-45): ");
            int option = scanner.nextInt();

            // Shows who won the 1st to 45th champions league
            if (option == 1) {
                System.out.println("Real Madrid won the " + option + "st UCL");
            } else if (option == 2) {
                System.out.println("Real Madrid won the " + option + "nd UCL");
            } else if (option == 3) {
                System.out.println("Real Madrid won the " + option + "rd UCL");
            } else if (option == 4) {
                System.out.println("Real Madrid won the " + option + "th UCL");
            } else if (option == 5) {
                System.out.println("Real Madrid won the " + option + "th UCL");
            } else if (option == 6) {
                System.out.println("SL Benfica won the " + option + "th UCL");
            } else if (option == 7) {
                System.out.println("SL Benfica won the " + option + "th UCL");
            } else if (option == 8) {
                System.out.println("AC Milan won the " + option + "th UCL");
             } else if (option == 9) {
                System.out.println("Inter Milan won the " + option + "th UCL");
              } else if (option == 10) {
                System.out.println("Inter Milan won the " + option + "th UCL");
              } else if (option == 11) {
                System.out.println("Real Madrid won the " + option + "th UCL");
              } else if (option == 12) {
                System.out.println("Celtic FC won the " + option + "th UCL");
              } else if (option == 13) {
                System.out.println("Manchester United won the " + option + "th UCL");
              } else if (option == 14) {
                System.out.println("AC Milan won the " + option + "th UCL");
              } else if (option == 15) {
                System.out.println("RV & AV Feijenoord won the " + option + "th UCL");
              } else if (option == 16) {
                System.out.println("Ajax Amsterdam won the " + option + "th UCL");
              } else if (option == 17) {
                System.out.println("Ajax Amsterdam won the " + option + "th UCL");
              } else if (option == 18) {
                System.out.println("Ajax Amsterdam won the " + option + "th UCL");
              } else if (option == 19) {
                System.out.println("Bayern Munich won the " + option + "th UCL");
              } else if (option == 20) {
                System.out.println("Bayern Munich won the " + option + "th UCL");
              } else if (option == 21) {
                System.out.println("Bayern Munich won the " + option + "th UCL");
              } else if (option == 22) {
                System.out.println("Liverpool FC won the " + option + "th UCL");
              } else if (option == 23) {
                System.out.println("Liverpool FC won the " + option + "th UCL");
              } else if (option == 24) {
                System.out.println("Nottingham Forest won the " + option + "th UCL");
              } else if (option == 25) {
                System.out.println("Nottingham Forest won the " + option + "th UCL");
              } else if (option == 26) {
                System.out.println("Liverpool FC won the " + option + "th UCL");
              } else if (option == 27) {
                System.out.println("Aston Villa won the " + option + "th UCL");
              } else if (option == 28) {
                System.out.println("Hamburger SV won the " + option + "th UCL");
              } else if (option == 29) {
                System.out.println("Liverpool FC won the " + option + "th UCL");
              } else if (option == 30) {
                System.out.println("Juventus FC won the " + option + "th UCL");
              } else if (option == 31) {
                System.out.println("Steaua Bucharest won the " + option + "th UCL");
              } else if (option == 32) {
                System.out.println("FC Porto won the " + option + "th UCL");
              } else if (option == 33) {
                System.out.println("PSV Eindhoven won the " + option + "th UCL");
              } else if (option == 34) {
                System.out.println("AC Milan won the " + option + "th UCL");
              } else if (option == 35) {
                System.out.println("AC Milan won the " + option + "th UCL");
              } else if (option == 36) {
                System.out.println("Red Star Belgrade won the " + option + "th UCL");
              } else if (option == 37) {
                System.out.println("FC Barcelona won the " + option + "th UCL");
              } else if (option == 38) {
                System.out.println("Olympique Marseille won the " + option + "th UCL");
              } else if (option == 39) {
                System.out.println("AC Milan won the " + option + "th UCL");
              } else if (option == 40) {
                System.out.println("Ajax Amsterdam won the " + option + "th UCL");
              } else if (option == 41) {
                System.out.println("Juventus FC won the " + option + "th UCL");
              } else if (option == 42) {
                System.out.println("Borussia Dortmund won the " + option + "th UCL");
              } else if (option == 43) {
                System.out.println("Real Madrid won the " + option + "th UCL");
              } else if (option == 44) {
                System.out.println("Manchester United won the " + option + "th UCL");
              } else if (option == 45) {
                System.out.println("Real Madrid won the " + option + "th UCL");
            } else {
                System.out.println("Invalid option. Please select a number between 1 and 45.");
            }

            // Asks the user if they want to search again
            System.out.println("Do you want to search again? (y/n): ");
            choice = scanner.next();
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}