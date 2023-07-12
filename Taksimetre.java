import java.util.Scanner;
public class Taksimetre {


    public static void main(String[] args) {

        double km, kmUcreti=2.20 , minTutar=20 ,acilisUcreti=10, tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Mesafeyi Km Cinsinden Yazın: ");
        km= input.nextDouble();

        tutar=acilisUcreti+(km*kmUcreti);

        boolean sonuc= tutar > 20 ;
        String str = sonuc ? "Ödeyeceğiniz Tutar:"+tutar : "Ödeyeceğiniz Tutar:"+minTutar;
        System.out.print(str);



    }
}





