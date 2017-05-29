
package javamyprogramm;


public class NewMain {

   
    public static void main(String[] args) {
        // Домашнее задание №2
      // часть 2
      // в целом разобрался, но возникли вопросы с float`ом
      
    int[] arr = new int[] {9, 0, 8, 0, 1, 2, 4, 4, 5};
        int[] counter = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        
        for (int i = 0; i < counter.length; i++) {
            if (counter[i]>1){
                
            
            System.out.println("[" + i + "]" + "-" + " повторений " + counter[i]);
        }}

    }
    
}
