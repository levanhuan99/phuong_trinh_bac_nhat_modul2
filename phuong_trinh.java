import java.util.Scanner;

public class phuong_trinh {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double a,b,c;
        System.out.println("a: ");
        a=scanner.nextDouble();

        System.out.println("b: ");
        b=scanner.nextDouble();

        System.out.println("c: ");
        c=scanner.nextDouble();
        if (a!=0){
            double answer=(c-b)/a;
            System.out.println("ket qua la: "+answer);
        }
        else {
            if (b==0){
                double answer=c/a;
                System.out.println("ket qua la: "+ answer);
            }else {
                System.out.println("phuong trinh vo nghiem!!");
            }
        }

    }
}
