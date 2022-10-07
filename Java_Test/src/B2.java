import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        String text = "You only live once , but if you do it right , once is enough";
        int checkNumbers=0;
        for (int i = 0; i <text.length();i++){
            if(text.charAt(i)=='o'){
                checkNumbers+=1;
            }
        }
        System.out.println("Char 'O' appear : "+checkNumbers);
    }
}
