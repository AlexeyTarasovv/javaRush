package com.company.task_6_8_5;
/*
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
 */
public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = result + text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + text;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = multiply("Hello");
    }
}
