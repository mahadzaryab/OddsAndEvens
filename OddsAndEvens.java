import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String entry = input.next();
        if (entry.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("------------------------------------------");

        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"finger(s)\".");
        System.out.println("------------------------------------------");
        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);

        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven) {
            System.out.println(sum + " is ...even");
        } else {
            System.out.println(sum + " is ... odd!");
        }
        System.out.println("------------------------------------------");

        if (oddOrEven){
            if (entry.equalsIgnoreCase("E")){
                System.out.println("That means " + name + " wins!");
            } else {
                System.out.println("That means the computer wins!");
            }
        } else {
            if (entry.equalsIgnoreCase("O")) {
                System.out.println("That means " + name + " wins!");
            } else{
                System.out.println("That means the computer wins!");
            }
        }
    }
}

