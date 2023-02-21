import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант 2, РИБО-01-21, Совков Максим Сергеевич");

        Scanner in = new Scanner(System.in);
        TelephoneChar telephone = new TelephoneChar();

        System.out.println("Input telephone num");
        telephone.setNum(in.next());
        System.out.println("Input telephone provaider");
        telephone.setProvaider(in.next());
        System.out.println("Input telephone balance");
        telephone.setBalance(in.nextInt());
        System.out.println("Input telephone model");
        telephone.setModel(in.next());
        System.out.println("Input telephone charge");
        telephone.setCharge(in.nextInt());
        System.out.println(telephone.toString());

    }
}