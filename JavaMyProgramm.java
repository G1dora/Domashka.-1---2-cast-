
package javamyprogramm;


public class JavaMyProgramm {
    //Первая домашка
    //первое задание                                       
    
    public static void main(String[] args) {
        String s = "программирование";
    int len = s.length();
    int count = len;
        System.out.println("Количество букв =" + " " + len);
        String x1 = s.substring(0, 8);
        String x2 = s.substring(8, s.length() );       
    System.out.println(x1 + x2);
        
    //второе задание
    
      int num = 694567;
        if (num % 10 == 7) {
            System.out.println("является");
        }else{
            System.out.println("не является");
        }
    
    // третье задание
    
    int a = 3;
    int b = 3;
    int r = 4;
    
    if(r >=  Math.sqrt((a*a + b*b)/2)) {
        System.out.println("Закрывает");
                
    }else {
        System.out.println("Не закрывает");
                             
                 }
 
   // четвертое задание
   
        int money = 11;
int x = money % 100;
int y = money % 10;
if (money != 11 && x == 1){
System.out.println(money + " рубль");}
if (money != 11 && y == 1){
System.out.println(money + " рубль");}
if (5 > x && x > 1 || y > 1 && y < 5){
System.out.println(money + " рубля");}
if (20 > x && x > 10 || y > 5 && y < 10){
System.out.println(money + " рублей");}
 

   // пятое задание
   
  String str = "#?asda^YFesdg?#";
String newStr = str.replace("?", "Hello");
String newString = newStr.replace("#", "");
System.out.println(newString);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }}
    
