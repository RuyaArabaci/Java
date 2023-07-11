public class veriTipleri_1 {
    public static void main(String[] args) {
        byte vByte = 100 ;
        short vShort = 1000 ;
        int vInt = 10000 ;
        long vLong = 100000 ;

        System.out.println(vByte);
        System.out.println(vShort);
        System.out.println(vInt);
        System.out.println(vLong);
    }
}

/**
 * byte, short, intager ve long olmak üzere dört tane veri tipi vardır. Bunlardan byte 8 bite eşittir. yani -128 ile 127 arasında bir değer
 * alabilir. Daha büyük ya da daha küçük bir sayı alamaz.
 * Short veri tipi ise 16 bitlik alan kaplayabilir. yani -32768 ile 32767 arası tam sayı değeri alabilir.
 * Intager ise genelde en sık kullanılanıdır. yeterli uzunluğa sahiptir. 32 bitlik uzunluğa sahiptir. 
 * Long ise 64 bit uzunluğundadır. Fakat genel olarak çok yer kapladığından dolayı long yerine intager kullanılır.
 */
