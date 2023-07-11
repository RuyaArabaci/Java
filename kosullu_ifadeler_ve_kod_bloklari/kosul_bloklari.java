package kosullu_ifadeler_ve_kod_bloklari;

public class kosul_bloklari {
    public static void main(String[] args) {
        int a = 7 , b = 4 , c = 11;
        if ( (a=6)<b && a<c){
            System.out.println("a en küçük sayıdır!");
        }else if (b<a && b<c) { 
            System.out.println("b en küçük sayıdır!");
        }else{
            System.out.println("c en küçük sayıdır!");
        }
        System.out.println(a);
    }
 }
