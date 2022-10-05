import java.util.Scanner;
public class BTVN_B2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Menu \t");
        System.out.println("1.Giai PT Bac 1 ");
        System.out.println("2.Giai PT Bac 2 ");
        System.out.println("3.Tinh Tien Dien");
        System.out.println("4.End Program ");
        System.out.println("Option of You :D ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Giai Pt Bac 1 Ax + B = 0");
                double a, b, x;
                System.out.println("Import Two Numbers A , B");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("==>" + a + "X +" + b + "=0");
                x = -b / a;
                System.out.println("X=" + x);
                break;
            case 2:
                System.out.println("Giai PT bac 2 : ");
                double A, B, C, delta;
                System.out.println("import A , B ,C ");
                A = sc.nextDouble();
                B = sc.nextDouble();
                C = sc.nextDouble();
                System.out.printf("\n %fX^2 + %fX +%f = 0", A, B, C);
                delta = (B * B) - 4 * A * C;
                if (A != 0) {
                    if (delta < 0) {
                        System.out.println("Ptrinh Vo Nghiem");
                    } else if (delta == 0) {
                        double Y = -B / (2 * A);
                        System.out.println("=>>" + Y);
                    } else {
                        double no1 = (-B - Math.sqrt(delta)) / 2 * A;
                        double no2 = (-B + Math.sqrt(delta)) / 2 * A;
                        System.out.printf("=>> X1=%f, X2=%f", no1, no2);
                    }
                }else{
                    double X = -C / B;
                    System.out.println("X = " + X);
                }
                break;
            case 3:
                System.out.println("Value Electric in Month");
                System.out.println("Import Value Electric");
                int numbersElec= sc.nextInt();
                if(numbersElec > 0 && numbersElec < 50){
                    int princeValue = numbersElec*1000;
                    System.out.println("=>>"+princeValue);
                }else{
                    int overValue = numbersElec - 50;
                    int priceValue =numbersElec*1000 + overValue*1200;
                    System.out.println("=>>"+priceValue);
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Import Numbers ( 1 -> 4) ");
        }
        System.out.println("end Program");
     }
    }




