import java.util.Scanner;
/**
 * Bài 5 :
 * Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím. Thực hiện:
 * Nhập các phần tử mảng
 * In thông tin mảng ra màn hình
 * Liệt kê các phần tử nằm trên đường chéo chính
 * Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
 **/
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Import N and M ( N , M > 0 ) :");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ArrayOne[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Import a[" + i + "][" + j + "]");
                ArrayOne[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma Tran Cua Ban : ");
        for (int i = 0; i <N ; i++){
            for (int j = 0; j <N ; j++){
                System.out.print(ArrayOne[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Duong Cheo 9 cua Ma Tran La");
        for (int i = 0; i <N ; i++){
            for (int j = 0; j <M ; j++){
                if(i ==j)
                    System.out.print(ArrayOne[i][j]+"\t");
            }
            System.out.println();
        }
        sc.nextLine();
        // Gắn 2 giá trị cùng kiểu với N và M để nó đồng bộ số phần tử
        int A=N;
        int B=M;
        int ArrayTwo[][]=new int[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.println("Import a[" + i + "][" + j + "]");
                ArrayTwo[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma Tran Cua Ban : ");
        for (int i = 0; i < A ; i++){
            for (int j = 0; j < B ; j++){
                System.out.print(ArrayTwo[i][j]+"\t");
            }
            System.out.println();
        }
        // Khởi tạo ma Trận Tổng , cũng cho đồng bộ 2 biến
        int X=A;
        int Y=B;
        int ArrayTotal[][]= new int[X][Y];
        for (int i = 0; i <X ; i++){
            for (int j = 0; j <Y ; j++){
                ArrayTotal[i][j]=ArrayOne[i][j]+ArrayTwo[i][j];
            }
        }
        System.out.println("Total of Two Array is : ");
        // Dùng for reach để đọc mảng 
        for (int i = 0; i <X ; i++){
            for (int j = 0; j <Y ; j++){
                System.out.print(ArrayTotal[i][j]+"\t");
            }
            System.out.println();
        }
        }
    }

    

