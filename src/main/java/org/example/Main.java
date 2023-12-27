package org.example;

public class Main {
    public static void main(String[] args) {
        String number1 = "(+380)67-195-66-25";
        String number2 = "(+380)607-195-66-25";

        String HTML = "<div>\n" +
                "<p>Символи <> круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";

        String textWithMoreSpace = "Я хочу    бути     програмістом";

        boolean number_bool_1 = number1.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
        boolean number_bool_2 = number2.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
        String clearHTML = HTML.replaceAll("<[^>]+>", "");
        String text = textWithMoreSpace.replaceAll("\\s+", " ");

        System.out.println(number1 + " - " + number_bool_1);
        System.out.println(number2 + " - " + number_bool_2);
        System.out.println(clearHTML);
        System.out.println(text);
    }
}