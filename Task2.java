package HW3;

public class Task2 {

    // Если необходимо, исправьте данный код (задание 2
//            try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }
    public static void task2(int intArray []){
    int d = 0;
    try {

        double catchedRes1 = intArray[8] / (double)d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
    catch (ArithmeticException e) {
     System.out.println("Dividing by zero");
     e.printStackTrace();
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Index out of bond");
        e.printStackTrace();

    }

    }


}
