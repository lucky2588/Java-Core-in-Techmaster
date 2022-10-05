import java.util.Scanner;
public class Bt2InPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var x=1;
        do{
            System.out.println("Import your name");
            String name = sc.nextLine();
            System.out.println("Import your address");
            String address= sc.nextLine();
            System.out.println("Age of you :");
            int ageOfYou= sc.nextInt();
            System.out.printf("Information About You : \n -%s \n -%s \n %d \n",name,address,ageOfYou);
            System.out.println("Do you Want continue (Y/N)");
            sc.nextLine();
            String option = sc.nextLine();
            switch (option){
                case "Y":
                    break;
                case "N":
                    x=-3;
                    break;
            }
            x++;
        }while (x > 0);
    }
}
