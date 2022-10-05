import java.util.Scanner;
// Bài 2 : Nhập số N và in ra bảng cửu chương của nó. rồi hiện thị câu lệnh Y/N nếu Y chạy tiếp Ctrinh còn N thì pause Program
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var x=1;
        endPro: do{
            System.out.println("Import N : (1 -> 9 ))");
            int n = sc.nextInt();
            if(0 < n && n <= 9){
                System.out.printf("Bang Cuu Chuong of %d : \n",n);
                for (int i = 1; i <=9 ; i++){
                    int X= n*i;
                    System.out.println(+n+ "x" +i+ "="+X);
                }
            }else{
                System.out.println("Reset input :D ");
            }
            sc.nextLine();
            System.out.println("\n Do you want to continue ? (Y/N) ");
            String Choose = sc.nextLine();
            switch(Choose){
                case "N":
                     break;
                case "Y":
                    x= -2;
                    break;
            }
            x++;
        }while(x<0);
        System.out.println("End Program");
    }
}
