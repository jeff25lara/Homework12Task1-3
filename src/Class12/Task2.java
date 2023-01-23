package Class12;

public class Task2 {
    public static void main(String[] args) {
        //2) Create a String and print it in reverse order (Sunday → yadnuS).

        String weekend = "Sunday";
        String reversedDay = "";

        for (int i = weekend.length() - 1; i >= 0; i--) {
            reversedDay = reversedDay + weekend.charAt(i);
        }
        System.out.println(reversedDay);
    }
}