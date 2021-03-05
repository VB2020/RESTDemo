package com.example.demo123;

public class Other {
    public static void main(String[] args) {
        int[] mass = new int[100];

        for (int i = 0; i < 100; i++)
        {
            mass[i] = i + 1;
            if (mass[i] % 3 == 0)
            {
                System.out.print("fizz");
            }
            if (mass[i] % 5 == 0)
            {
                System.out.print("buzz");
            }
            else if ((mass[i] % 3 != 0) && (mass[i] % 5 != 0))
            {
                System.out.print(mass[i]);
            }
            System.out.print(", ");
        }
    }
}
