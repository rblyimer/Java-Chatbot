import java.util.Scanner;

public class ChatBot {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String name1 = Greeting();
        String hobby = Repeat ();
        Age();
        int num2 = Count();
        Quiz();
        Story(name1, hobby, num2);
        days();
    }

//Greeting the user
    public static String Greeting() {
        System.out.println("Ahoy Matey! my name is bot, James bot. Version: 007 \n What is your name?");
        String name1 = in.nextLine();
        return name1;
    }

//Asking the user to repeat their name
    public static String Repeat() {
        System.out.println("Wait let me put on my glasses, would you write your name again please?");
        String name = in.nextLine();
        System.out.println("That is a cool name, " + name + ". Tell me more about yourself," +
                " \n what is your favourite thing to do?");
        String hobby = in.nextLine();
        System.out.println("Wow! for me, on a scale of 1 to 10 " + hobby + " is an 11!");
    return hobby;
    }

//Guessing the user's age
    public static void Age() {
        System.out.println("Very cool, okay now let's play a game where I guess your age," +
                "\n give me a number from 1 to 9.");
        int num = Integer.parseInt(in.nextLine());
        num *= 2;
        num += 5;
        num *= 50;
        System.out.println("If you've already had your epic birthday party this year, please enter 'y'" +
                " \n if you hadn't yet press 'n'.");
        String data = in.nextLine();
        if (data.equals("y")) {
            num += 1772;
        } else if (data.equals("n")) {
            num += 1771;
        }
        System.out.println("okay don't tell me your birth year but Substract it from  " + num
                + "\nand enter the result");
        num = Integer.parseInt(in.nextLine());
        System.out.println("");
        System.out.println("If i guessed right, From those three digits you entered, " +
                "\nthe first digit is the first number you chose," +
                "\nand The other two is your age, Pretty wild right.");
    }

//Counting to any number that the user wants.
    public static int Count() {
        System.out.println("");
        System.out.println("More games please?? Press enter to play a counting game");
        in.nextLine();
        System.out.println("Enter a whole number for me to count up to and i will count from 0." +
                "\n but please take it easy on me, I haven't had my morning coffee yet:)");
        int num2 = in.nextInt();
        for (int i = 0; i <= num2; i++) {
            System.out.printf("%d\n", i);
        }
        return num2;
    }

//Testing the user's "programming knowledge"
    public static void Quiz() {
        System.out.println("");
        System.out.println("Okay, Let's do something else,");
        System.out.println("I saw Robel take a quiz during my birth, would you like to answer one from that same quiz?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        int data = in.nextInt();
        switch (data) {
            case 1:
        System.out.println("Here is the Question: choose The best answer and enter the number of your chioice");
        System.out.println("");
        System.out.println("If a variable is declared as private, where may the variable be accessed?");
        System.out.println("[1] A private variable may only be accessed within the class in which it is declared. ");
        System.out.println("[2] A private variable may be accessed outside the class in which it is declared.");
        System.out.println("[3] A private variable may be changed outside the class in which it is declared.");
        System.out.println("[4] A private variable may be accessed by another class in which it wasn't declared.");
        
        while (true) {
        data = in.nextInt();
        if (data == 1) {
        System.out.println("Stupendous! James bot is proud.");
        break;
}
        System.out.println("Please, try again.");
        }
        case 2:
        System.out.println("Thank you for being such a good company, if you're not in a hurry," +
        " \nlet me tell you what i remember about you.");
        break;
    }
}

//Add a step in the chat bot that tells the user a story about themselves 
    public static void Story(String name1, String hobby, int num2) {
        in.nextLine();
        System.out.println("(Press enter to read :))");
        in.nextLine();
        System.out.println("your name is " + name1);
        System.out.println("i thought " + name1 + " was a pretty cool name and asked more about you" +
        "\nand i found out you like " + hobby + " and i was very impressed!");
        System.out.println("Then i guessed your age and we counted to " + num2);
        System.out.println("Finally, I tested your programming knowledge.");
        System.out.println("");
        System.out.println("let's hang a bit more and let me tell you some silly jokes about each day of the week?");
        System.out.println("(Press enter to continue)");
        in.nextLine();
    }

//Use a switch statement to output a phrase that the bot enjoys about each day of the week. 
public static void days(){
    while (true) {
        System.out.println("Enter a whole number from 1 to 7 to hear about monday to sunday respectively." +
        "\n or 8 to stop"); 
        int num = Integer.parseInt(in.nextLine());
        switch (num) {
            case 1:
                System.out.println("");
                System.out.println("What's the saddest part of the week?");
                System.out.println("...");
                System.out.println("Monday mourning ;(");
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                System.out.println("What day should you wear flip-flop sandals?");
                System.out.println("...");
                System.out.println("Toesday!");
                System.out.println("");                
                break;
            case 3:
                System.out.println("");
                System.out.println("This is the third time you've been late to work this week. Do you know what that means?");
                System.out.println("...");
                System.out.println("it's Wednesday...");
                System.out.println("");  
                break;
            case 4:
                System.out.println("");
                System.out.println("Yay! you chose friday?");
                System.out.println("...");
                System.out.println("Nope, it's still Thursday, just couldn't wait till tomorrow...");
                System.out.println("I bet you'll love the friday joke though ;)"); 
                System.out.println("");  
                break;
            case 5:
                System.out.println("");
                System.out.println("What did the staff give on black friday?");
                System.out.println("...");
                System.out.println("50 % off late assignments.");
                System.out.println("");
                break;
            case 6:
                System.out.println("");
                System.out.println("What day is sadder than sunday.");
                System.out.println("...");
                System.out.println("sadder-day...");
                System.out.println("");
                break;
            case 7:
                System.out.println("");
                System.out.println("Why is Sunday very strong");
                System.out.println("...");
                System.out.println("Because it's not a weak day...");
                System.out.println("");
                break;
            case 8:
                System.out.println("");
                System.out.println("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday" + 
                "\n   Ahh those were the days...");
                System.out.println("");
                System.out.println("Thank you for hanging out, Have a marvelous day! :)");
                return;
        }
    }
}
}
