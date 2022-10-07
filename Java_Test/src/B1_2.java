import java.util.Scanner;

public class B1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Import N : ( N > 0)");
        int N = sc.nextInt();
        if(N > 0){
            for (int i = 1; i <= N  ; i++){
                for (int j = 1; j <=i ; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
