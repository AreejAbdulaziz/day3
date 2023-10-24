import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1
        System.out.println("please enter your rule");
        String rule = s.next();
        if (rule.equals("Admin")) {

            System.out.println("welcome admin");

        } else if (rule.equals("superuser")) {
            System.out.println("welcome superuser");

        } else System.out.println("welcome user");

        //2
        System.out.println("please enter number");
        int number1 = s.nextInt();
        System.out.println("please enter second number");
        int number2 = s.nextInt();
        System.out.println("please enter third number");
        int number3 = s.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Greatest number " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Greatest number " + number2);
        } else System.out.println("Greatest number " + number3);

        //3

        Random random = new Random();
        int day = random.nextInt(7) + 1;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saterday");
                break;

            default:
                System.out.println("please enter number between 1-7");

                //4
                System.out.println("please enter your mark");
                int mark = s.nextInt();

                if (mark >= 0 && mark <= 59) {
                    System.out.println("Grade is F");

                } else if (mark >= 60 && mark <= 69) {
                    System.out.println("Grade is D");

                } else if (mark >= 70 && mark <= 79) {
                    System.out.println("Grade is C");

                } else if (mark >= 80 && mark <= 89) {
                    System.out.println("Grade is B");

                } else if (mark >= 90 && mark <= 100) {
                    System.out.println("Grade is A");

                } else System.out.println("invalid number");

                //5

                System.out.println("please enter your age");
                int age = s.nextInt();
                if (age <= 13) {
                    System.out.println("you are an child");

                } else if (age >= 14 && age <= 19) {
                    System.out.println("you are an Teenager");

                } else System.out.println("you are an Adult");


        }
    }}
