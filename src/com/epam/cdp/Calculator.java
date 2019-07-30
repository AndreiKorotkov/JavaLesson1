/*classname Calculator
 * created 30.07.2019*/

package com.epam.andrei_korotkov.java.lesson1.task3;

import java.util.Scanner; //импорт сканера

public class Calculator { //Андрей Коротков, задача 3

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Calculator app = new Calculator();
        app.startApplication();
    }
    public void startApplication() {



        int num1 = getInt();
        int num2 = getInt();//создать переменные для ввода чисел
        char operation = getOperation();//переменная для оператора
        int result = calc(num1,num2,operation);//переменная для результата
        System.out.println("Result is : "+result);
        }

            public static int getInt(){
            System.out.println("Enter a number:");
            int num;
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
            } else {
                System.out.println("Error. Please enter a number");
                scanner.next();
                num = getInt();
            }
            return num;//ввести 2 номера с клавиатуры, если введено не число, выводится сообщение об ошибке
            }

            public static char getOperation(){
            System.out.println("Enter an operator (+, -, * or / ):");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Error. Select an operator.");
                scanner.next();
                operation = getOperation();
            }
            return operation;
            }//ввод оператора, определяется только первый символ в строке, при вводе других знаков выводится ошибка

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Error. Try again.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}