import java.util.Scanner;
import java.util.regex.Pattern;

public class Phone {
    public static void main(String[] args) {
            String num = new Scanner(System.in).nextLine();
            num = num.replaceAll("[^0-9]", "");
            if (Pattern.matches("^7[0-9]{10}$", num)) {
                System.out.println(num);
            } else if (Pattern.matches("^8[0-9]{10}$", num)) {
                System.out.println("7" + num.substring(1));
            } else if (Pattern.matches("^[0-9]{10}$", num)) {
                System.out.println("7" + num);
            } else {
                System.out.println("Неверный ввод");
            }
        }
    }
