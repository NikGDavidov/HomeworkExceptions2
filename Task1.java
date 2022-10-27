package HW3;

import java.util.Scanner;

public class Task1 {
    //    Реализуйте метод, который запрашивает у пользователя ввод дробного числа
//            (типа float), и возвращает введенное значение.
//    Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        System.out.println("Введите дробное число");
        double d = enterDouble();
    }
    public static double enterDouble(){
       double result = 0;
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        try {
             result = Double.parseDouble(temp);
        }
        catch (NumberFormatException nfe){
            System.out.println("Ошибка ввода данных");
            nfe.printStackTrace();
            main(new String[0]);
        }
        return result;
    }
}
