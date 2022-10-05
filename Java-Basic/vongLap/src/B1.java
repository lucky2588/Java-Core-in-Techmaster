import java.util.Scanner;
public class B1{
    //Cho chuỗi Hello every one , Ycau : Ký tự e xuất hiện bao nhiên lần , có index là bao nhiêu
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text="Hello every one";
       var bienDem = 0;
        for (int i = 0; i <= text.length()-1;i++){
          if(text.charAt(i) =='e')
              bienDem++;
        }
        System.out.println("The number of occurrences is:"+bienDem);

    }
}
