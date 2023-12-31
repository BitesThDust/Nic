package F;
import java.util.Scanner;
public class Stokcalc {
    public static Scanner scanner;
    static String ant, bnt, k;
    static String op;
    static int a;
    static String res;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        ant = scanner.next();
        if (!ant.matches("[a-zA-Zа-яА-Я]+")) {
            throw new Exception();
        }
        if (ant.length() >= 11) {
            throw new Exception("Перебор ");
        }
        op = scanner.next();
        k = "\"";
        res = null;
        switch (op) {
            case "+":
                bnt = scanner.next();
                if (bnt.length() >= 11) {
                    throw new Exception("Перебор ");
                }
                res = ant + bnt;
                break;
            case "-":
                bnt = scanner.next();
                if (bnt.length() >= 11) {
                    throw new Exception("Перебор ");
                }
                res = Calculation.replace(ant, bnt);
                break;
            case "*":
                a = scanner.nextInt();
                if (a >= 11) {
                    throw new Exception("Перебор ");
                }
                res = Calculation.multiply(ant, a);
                break;
            case "/":
                a = scanner.nextInt();
                if (a >= 11) {
                    throw new Exception("Перебор ");
                }
                res = Calculation.davide(ant, a);
                break;

        }
        if (res.length() >= 41) {
            System.out.println(res.substring(0, 40) + "...");
        } else {
            System.out.println(k + res + k);
        }
    }
}