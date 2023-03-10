import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант 2, РИБО-01-21, Совков Максим Сергеевич");

        Scanner in = new Scanner(System.in);
        Seller seller = new Seller();
        System.out.println("Input telephone manufacturer");
        seller.manufacturer = in.next();
        System.out.println("Input telephone num");
        seller.setNum(in.next());
        System.out.println("Input telephone provaider");
        seller.setProvaider(in.next());
        System.out.println("Input telephone balance");
        seller.setBalance(in.nextInt());
        System.out.println("Input telephone model");
        seller.setModel(in.next());
        System.out.println("Input telephone charge");
        seller.setCharge(in.nextInt());
        System.out.println(seller.toString());
        seller.modify();
        System.out.println(seller.toString());

    }
}