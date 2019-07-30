/*classname averageAndMinimalDifference
 * created 30.07.2019*/
package com.epam.andrei_korotkov.java.lesson1.task1;

public class averageAndMinimalDifference {//задача 1 вариант 5
    public static void main(String[] args) {

        averageAndMinimalDifference app = new averageAndMinimalDifference();
        app.countDifference();
    }
    public void countDifference() {


        int [] a = new int [20];

        for (int x=0; x<20; x++){
            a[x]=x-10;
            /*каждый элемент больше следующего на 1, отсчет от -10*/
            System.out.println(a[x]);
            }
        double average = 0;
        double sum = 0;
            /*переменные для суммы и среднего арифметического значения*/
        for (int i = 0; i < 20; i++) {
            sum += a[i];
            }
            average=sum/20;


        int min = a[0];
        for(int i = 0; i != a.length; i ++){

            if(a[i] < min){
                min = a[i];
            }
        }
            System.out.println("Difference is: " + (average-min));

        }
    }

