import java.util.Scanner;
//Viết chương trình thực hiện:
//        Liệt kê 10 số nguyên tố đầu tiên
//        Liệt kê các số nguyên tố nhỏ hơn 10

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Import N :");
        int N = sc.nextInt();
        int Sum = 0;
        if (N < 2) {
            System.out.println("KO phai SNT");
        } else {
            System.out.println(" 10 numbers Prime of " + N + " the Frisrt is : ");
            for (int i = 2; i < N; i++) {
                if (isPrimeNumber1(i)) {
                    Sum += 1;
                   if(Sum <= 10){
                       System.out.println(i);
                   }
                }else{
                    continue;
                }
            }
        }
        //Lấy 10 STN :
        if (N < 2) {
            System.out.println("KO phai SNT");
        } else {
            System.out.println();
            System.out.println("prime numbers less than 10");
            for (int i = 2; i < N; i++) {
                if (isPrimeNumber1(i)) {
                    if (i < 10)
                        System.out.print("\t" + i);
                } else {
                    continue;
                }
            }
        }
    }

    //Phương Thức Check Số Nguyên Tố
    public static boolean isPrimeNumber1(int n) {
        if (n < 2) {
            return false;
        }
        int checkNumbers = (int) Math.sqrt(n);
        for (int i = 2; i <= checkNumbers; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
