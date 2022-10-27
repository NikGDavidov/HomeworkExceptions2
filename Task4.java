package HW3;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception,
//        когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        if (sc.nextLine().length()==0) throw new RuntimeException("Пустые строки вводить нельзя");
        }
}
