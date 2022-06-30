import java.util.Scanner;
public class Ders {
    public static void main(String[] args) {
        int mat, fizik, turkce, tarih, kimya;
       Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        System.out.println("Lutfen Turkce Notunuzu Giriniz: ");
        turkce = input.nextInt();
        System.out.println("Lutfen Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        System.out.println("Lutfen Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();
        System.out.println("Lutfen Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        int toplam= ( mat + turkce+ kimya + tarih + kimya);
        double avarage= (toplam / 5.0);
        if ( mat > 100 || mat<0){
            System.out.println(" Yanlis giris yaptiniz.");
        } else if( turkce > 100 || turkce<0) {
            System.out.println(" Yanlis giris yaptiniz.");
        } else if ( fizik > 100 || fizik<0){
            System.out.println(" Yanlis giris yaptiniz.");
        } else if ( kimya > 100 || kimya<0){
            System.out.println(" Yanlis giris yaptiniz.");
        } else if ( tarih<0 || tarih>100) {
            System.out.println(" Yanlis giris yaptiniz.");
        } else{
        if (avarage > 55) {
            System.out.println( " Sinifi Gectiniz.");
        } else {
            System.out.println(" Sinifta Kaldiniz!!!");
        }
    }
        System.out.println("Ortalamaniz: "+ avarage);
}
}
