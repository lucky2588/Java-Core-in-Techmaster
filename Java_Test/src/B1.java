import java.util.Scanner;
// Bài 1 : in ra Hình Vuông
public class B1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Import Numbers of You : ");
        int N = sc.nextInt();
        if(N > 0){
            for (int i = 0; i < N ; i++){
                for (int j = 0; j < N ; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Reset Input");
        }
    }
}
