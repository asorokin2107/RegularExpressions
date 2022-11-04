import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (char i :"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray()) {
            System.out.println(i + " (" + ((int) i) + ")");
        }
    }
}
