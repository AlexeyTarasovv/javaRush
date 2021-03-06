package com.company.lecture12.task_46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/*
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal bd = new BigDecimal(1);
        if (n < 0) return "0";
        if (n == 0) return "1";

        for (int i = 1; i <= n ; i++) {
            bd = bd.multiply(new BigDecimal(i));
        }
        return bd.toString();
    }
}







