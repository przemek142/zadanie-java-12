public class Main {
    public static void main(String[] args) {
        int result=0;

        for (int number =0; number <=100; number++){
            if (number % 2 == 0) {
                System.out.println(number);
                result+=number;
            }
        }
        System.out.println("Suma: " + result);

    }
}
