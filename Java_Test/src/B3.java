import java.util.Random;
import java.util.Scanner;
//Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.
//Phương thức kiểm tra số nguyên tố

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rdNumbers = rd.nextInt(100);
        System.out.println(rdNumbers);
        // truyền số ngẫu nhiên vào phương thức để in check , nếu true thì in ra SNT , false thì không phải snt
        if (isPrimeNumber(rdNumbers)) {
            System.out.println(" SNT");
        } else {
            System.out.println("No SNT");
        }
    }

    // dùng phương thức có sẵn để  check SNT
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
