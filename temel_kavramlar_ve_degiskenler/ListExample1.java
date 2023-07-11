import java.util.*;  
public class ListExample1{  
public static void main(String args[]){  
 //Creating a List  
 List<String> list=(List<String>) new ArrayList<String>();  
 
 list.add("Elma");  
 list.add("Armut");  
 list.add("Erik");  
 list.add("Kiraz");  
 
 for(String fruit:list)  
  System.out.println(fruit);  
  
}  
}
 