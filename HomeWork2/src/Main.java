import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Сколько вам лет***\n");
        int age = new Scanner(System.in).nextInt();
        if (age >= 18) {
            System.out.println("Welcome");
        }
    }
}