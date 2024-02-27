/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyakorlas0227;

/**
 *
 * @author SimonGergő(SZOFT_202
 */
public class CiklusGyak {
    public static void main(String[] args) {
        final int M = 9;
        for (int i = 0; i < M; i++){
            //System.out.println((char)(i+97) + " ");
        }
        System.out.println("");
        
        for (char c = 'a'; c >= 'i'; c++){
            System.out.println(c + "(" + (int)c + ") ");
        }
        System.out.println("");
        
        /*a b c
          d e f
          g h i
        */
        for (int i = 97; i <= 105; i++){
            System.out.print((char)i + " ");
            if(i % 3 == 0){
                System.out.println("");
            }
            System.out.println((char) (i+97) + " ");
        }
        System.out.println("");
            
    }
}
