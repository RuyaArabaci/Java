/*import java.util.Scanner;

public class notifications {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Notification Name: ");
        String notificationName = input.nextLine();

    }
*/
import java.util.*;
import java.util.Scanner;
    public class predefinder_market {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int sec ;
            List list = new ArrayList() ;

            list.add(" ");
            list.add("1-day");
            list.add("2-week");
            list.add("3-month");

            
            System.out.println("List: " + list);
            System.out.print("Lütfen istediğiniz marketin sayı değerini giriniz: ");
            sec = input.nextInt();

            switch (sec) {
                case 1:
                    System.out.println("https://ozgur.astrotux.org/ast415/Ders_03/Ders03_Donguler_Listeler.html");
                    break;

                    case 2:
                    System.out.println("week");
                    break;

                    case 3:
                    System.out.println("month");
                    break;

                default: System.out.println("girdiğiniz değer geçerli değil.");
                    break;
            }
            
        }
        
    }
    
    /*Öncelikle listendeki elemanları oluşturman lazım. Daha sonra bu listede kullanıcıdan sayı değerlerini alacaksın. Ardından if ve 
swich-case kullanarak listede olup olmadığına bak. Ardından çıkan sonucu ekrana yazdır. Eğer yoksa işlemi iytal et. ya da işlem 
gerçekleştirilemedi de.
    */
    
    
    
    
    
    /*boolean contains(Object o)
Parametrede belirtilen nesne listede varsa true değerini alır.
System.out.println(a.isEmpty());
 System.out.println(a.contains("Altı"));

Object get(int index)
 İndeksi belirtilen öğeyi verir.
 System.out.println("3: " + list.get(3));
 
int indexOf(Object o)
Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir. 

*/