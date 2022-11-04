import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        String name = new Scanner(System.in).nextLine();
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя -";
        Integer spaceCount = 0;
        for (int i = 0; i < name.length(); i++) {

            if (symbols.contains(String.valueOf(name.charAt(i))) == false) {
                System.out.println("Введенная строка не является ФИО");
                return;
            }
            if (name.charAt(i) == ' ') {
                spaceCount++;

            }



        }
        if (spaceCount > 2 && spaceCount < 2) {
            int index = name.indexOf(' ');
            int index1 = name.lastIndexOf(' ');
            System.out.println("Фамилия - " + name.substring(0, index));
            System.out.println("Имя - " + name.substring(index, index1));
            System.out.println("Отчество - " + name.substring(index1));
        } else {
            System.out.println("Не хватает элемента имени");

        }

    }
}
