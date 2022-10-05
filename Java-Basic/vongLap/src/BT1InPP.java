import java.util.Scanner;
public class BT1InPP {
    //Bài 1 trong PP
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var sum=0;
        int n=0;
        int X=1;
        do{
            System.out.println("Import N");
            n = sc.nextInt();
            for (int i = 0; i <=n ;i++){
                sum+=i;
            }
            System.out.println("Do You Want to Continue <3 ");
            sc.nextLine();
            String choose= sc.nextLine();
            switch (choose){
                case "Y":
                    break;
                case "N":
                    X = -3;
                    break;
            }
            X++;
            }while (X>0);
        System.out.println("total of Value numbers you import "+sum);
        }
    }

