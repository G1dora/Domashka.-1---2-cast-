
package javamyprogramm;

import java.util.Arrays;


public class NewMain1 {

    public static void main(String[] args) {
        System.out.println("Задайте длину массива:");
        
        int[] array = new int[]{4,5,6,2,4,8,5,1,2,6};
       
        System.out.println("Массив:" + Arrays.toString(array));
        
        for (int i = 0, j = array.length - 1; i < array.length / 2 && j / 2 >= 0; i++, j--) 
        {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
         
        }
        
        System.out.println("Инвентированный массив:" + Arrays.toString(array));
    }
    
}
