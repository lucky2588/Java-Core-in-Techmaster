import java.util.Scanner;
import java.util.regex.Pattern;
/**Viết chương trình nhập vào từ bàn phím email và số điện thoại, kiểm tra email và số điện thoại đó có hợp lệ không.
 Email phải đúng định dạng
 Số điện thoại có chứa 10 chữ số
 */
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=1;
     endPro:  while(n > 0){
           System.out.println("Import email");
           String email = sc.nextLine();
           Pattern checkEmail = Pattern.compile("^[a-zA-Z0-9@. ]{6,}$");
           if(checkEmail.matcher(email).find()){
               System.out.println("Email is valid !, Please import Telephone Numbers of you ");
               String numbers=sc.nextLine();
               Pattern checkNumbers= Pattern.compile("^[0-9]{10,12}$");
               if(checkNumbers.matcher(numbers).find()){
                   System.out.println("telephone of you is valid !");
                   System.out.printf("\n the information you just inport : \t \n Email : %s \n Telephone : %s ",email,numbers);
                   n=-2;
               }else{
                   System.out.println("reset numbers");
                  continue;
               }
            }else{
               System.out.println("Reset Input Email ");
           }
           n++;
       }
//        System.out.println("End Program ");
    }
}


