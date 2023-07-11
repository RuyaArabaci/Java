import java.util.Scanner;

public class kullanicidan_veri_alma {
    public static void main(String[] args) {
        
        int a ;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        System.out.println(a);

    }
}


 /**
Kullanıcıdan veri alma işlemi için scanner sınıfına ihtiyaç duyarız. Sınıfı tanımlamak için de en başa "import java.util.Scanner"
yazarız. Daha sonrasında herhangi bir değişkenin veri tipini yazarız. Ardından Scanner'a da bir değişken adı yazarız. Ben input yazdım. 
Siz başka bir şey de yazabilirsiniz. Devamında ise "new Scanner(System.in)" diyerek Scanner sınıfını bir değere atadık. Artık girdi almak 
için input değişkenini yazmam yeterli olacaktır.

Gelelim sonrasına. En başta herhangi bir değişken tanımlamıştık ya. İşte bu değişkene girdi oluşturmak için, yani kullanıcıdan veri almak
için, scanner sınıfındaki tanımladığımız değişkenimizi yazarız.("a = input.") Sonrasında değişkenimizin veri tipi neyse ona göre bir next
ifadesi yazarız.Benim değişkenim intager olduğu için ben "nextInt()" yazdım. Sonrasında ise sout diyerek çıktımızı yazdıran kod satırını 
ekleriz.

nextBoolean()   Kullanıcıdan boolean değişkenlere veri almak için kullanılır
nextByte()	Kullanıcıdan byte değişkenlere veri almak için kullanılır
nextDouble()	Kullanıcıdan doubledeğişkenlere veri almak için kullanılır
nextFloat()	Kullanıcıdan float değişkenlere veri almak için kullanılır
nextInt()	Kullanıcıdan int değişkenlere veri almak için kullanılır
nextLine()	Kullanıcıdan String değişkenlere veri almak için kullanılır
nextLong()	Kullanıcıdan long değişkenlere veri almak için kullanılır
nextShort()	Kullanıcıdan short değişkenlere veri almak için kullanılır

 */