public class kosul_operatoru {
    public static void main(String[] args) {
        int a = 4, b = 7, c = 4 ;
        boolean day = a>=c;
        boolean week = b>=c;
        boolean month = day && week ;
        String year = month ? "doğru" : "yanlış" ;

        System.out.println(year);
    }
    
}

/*
Koşul operatörü bize if kullanmadan basit bir doğru yanlış koşulu sunuyor. String veri tipini kulllanıyoruz ve örnekte de olduğu gibi
araya soru işareti koyarak doğru mu değil mi sorusu sorarız. Doğruysa iki noktanın solundaki değeri yazdırır. Yanlış ise sağdakini yazdırır.

&& ---> ve
|| ---> veya
!  ---> değil (!a,!b)

*/

