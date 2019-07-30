/*classname average string
 * created 30.07.2019*/
package com.epam.andrei_korotkov.java.lesson1.task2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class averageString {      //Андрей Коротков, задача 2 вариант 3

    public static void main(String[] args) {
        int n = 0;
        //Ввод количества строк с клавиатуры
        while(true){
            System.out.println("Enter amount of strings");
            Scanner sc1 = new Scanner (System.in);
            try{
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Wrong input");
            }

        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);

        //Инициализация массива str строками
        for(int i = 0; i < str.length; i++){
            System.out.println("Enter string №" + (i+1));
            str[i] = sc2.nextLine();
        }
        float average = 0f;
        //Считаем общую сумму длин строк
        for(String item : str){
            average += (float) item.length();
        }
        //Считаем среднее арифметическое суммы длин этих строк
        average /= str.length;

        System.out.println("Average string length = (" + average + ")");
        //Выводим результат (выводит все строки имеющие длину ниже средней)
        for(int i = 0; i < n; i++){
            if (str[i].length() < average){
                System.out.println("Shorter than average string is: ");
                System.out.println(str[i] + " its length is = " + str[i].length());
            }
        }

    }


}