import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество товара на складе: ");
        int stock = input.nextInt();
        System.out.print("Введите количество проданного товара: ");
        int sold = input.nextInt();

        int remainder = stock - sold;
        System.out.println("Осталось товара на складе: " + remainder);

        System.out.print("Введите оптовую цену одного товара: ");
        double wholesale = input.nextDouble();

        double acquired = stock * wholesale;
        System.out.println("Цена закупа товара: " + acquired);

        System.out.print("Введите стоимость продажи одного товара: ");
        double price = input.nextDouble();

        double revenue = sold * price;
        System.out.println("Доход от продаж: " + revenue);
    }
}
/*public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Сколько вам лет***\n");
        int age = new Scanner(System.in).nextInt();
        if (age >= 18) {
            System.out.println("Welcome");
        } else {
            System.out.println("\t\t\t***Too Young***\n");
        }
    }
}**/