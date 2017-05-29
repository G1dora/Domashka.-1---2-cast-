
package javamyprogramm;

public class JavaDomashka2 {
  public static void main(String[] args){
      
      //Домашнее задание №2
      //часть 1
      
    int[] numberArray = new int[10]; 
for(int i = 0; i < 10; i++){     
    numberArray[i] = i;           
}
int maxIn = 0;
int minIn = 0; 
for(int i = 0; i < 10; i++){      
   if(numberArray[maxIn]<numberArray[i]){
    maxIn = i;
   
    
   }
   if(numberArray[minIn]>numberArray[i]){
    minIn = i;
   
    
   }
  
       }

numberArray[maxIn] = 99;
numberArray[minIn] = 0;

System.out.print("[");

for(int i = 0; i < 9; i++){
   
    System.out.print(numberArray[i]+",");
}
System.out.print(numberArray[9]);
 System.out.print("]");


}}








