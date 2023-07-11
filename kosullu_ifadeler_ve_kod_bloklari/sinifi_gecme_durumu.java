package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;
public class sinifi_gecme_durumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, sonuc ;
        boolean a, b, c, d, e;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        
        sonuc = mat + fizik + kimya + turkce + muzik;
        
        a = (mat<=100 && mat >= 0);
        b = (fizik<=100 && fizik >= 0);
        c = (turkce<=100 && turkce >= 0);
        d = (kimya<=100 && kimya >= 0);
        e = (muzik<=100 && muzik >= 0);

        switch () {
            case true:
                sonuc = mat;
                break;
        
            default: 
                break;
        }
    }
}

/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

a = (mat<=100 && mat >= 0);
        b = (fizik<=100 && fizik >= 0);
        c = (turkce<=100 && turkce >= 0);
        d = (kimya<=100 && kimya >= 0);
        e = (muzik<=100 && muzik >= 0);
 */