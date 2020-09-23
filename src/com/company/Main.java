package com.company;

//Skrive koden for en metode der hedder "fun" som tager som parametre et "int[]" ved navn "a" og en "int" ved navn "b".
//Den returnerer et "int[]".
//Funktionen skal løbe "a" igennem, gange "b" på hvert element og returnere resultatet.
//Alså, hvad a=[1, 2, 3] og b=4 så skal metoden returnere [4, 8, 12].


import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int b = 4;
        System.out.println(Arrays.toString(fun(a, 4)));

    }

    public static int[] fun(int[] a, int b)  {
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++){
            result[i] = a[i] * b;
        }
        return result;
    }
}
