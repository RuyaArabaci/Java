
public class intro {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Java101");
        System.out.print("kodluyoruz\n\npatika.dev\tjava101 java102");
    }
}

/**  

İlk defa projeye başlıyorsak "class" girmemiz gerekiyor. Ardından main diyerek devam ediyoruz. Ardından ana kodumuzu yazıyoruz. Burada 
System bize sistemi etkilemesini söylüyor.  Büyük harfe dikkat! out ise dışarı aktarmayı gösteriyor. print ise klasik yazdır deme oluyor.
Yani bizim burada yaptığımız şey sistemde dışarı "Hello World!" yazdır demek oluyor.
System.out.print("Hello World!"); bizim kodumuzdur.

İki tane kod satırı yazdığımızda ve ikisini de ekranda yazdırmak istediğimizde arada boşluk bırakmadan aynı satırda yazdırır. Fakat 
printin hemen arkasından ln komutunu getirirsek bu bize beni yazdırdıktan sonra alt satıra geç der.

İki satır kullanmak yerine escape karakterlerini kullanarak da alt satıra geçme işlemini yapabiliriz. "\n" karakteri bulunduğu yerden 
aşağı satıra yazdır anlamına gelir. Aynı ln komutundaki çıktı gibi.

Yan yana birden fazla escape karakteri kullanabiliriz. 

"\t" escape karakterini kullandığımızda ise bir tab boşluk bırakır. yan yana iki kere \t yazılabilir. böyle de iki tab boşluk bırakmış
oluruz. hadi tüm escape karakterlerini inceleyelim.

KAÇIŞ KARAKTERLERİ
"\t" ---> tab boşluk bırakır.
"\b" ---> backspace ekler. (bir önceki harf ya da boşluk için)
"\n" ---> bir satır aşağı atlar.
"\r" ---> metne bir satır başı ekler. ama bu  sırada metnin neresinde kullanılırsa ondan öncekileri de siler.
"\'" ---> tek tırnak eklemek için kullanılır.
"\"" ---> çift tırnak eklemek için kullanılır.
"\\" ---> ters eğik çizgi eklemek için kullanılır. 

*/
