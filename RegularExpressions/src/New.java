public class New {

    public static void main(String[] args) {
       String one = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        one = one.replaceAll("[А-я.,-]+"," ").trim();
        String[] split = one.split("\\s+");
        int sum = 0;
        for (String e: split){
            sum += Integer.parseInt(e);
        }
        System.out.println(sum);
    }
}
