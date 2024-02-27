
package gyakorlas0227;


public class Gyakorlas0227 {

    
    public static void main(String[] args) {
        for(int i = 3; i > -4; i--){
            System.out.println(Math.abs(i));
        }
        
        final int M = 10;
        int[] kivalasztas = new int[M];
        for (int i = 0; i < M; i++){
            //kivalasztas[i] = (int)(Math.random()*(99-10+1)+10);
            kivalasztas[i] = (int)(Math.random()*45)*2+11;
        }
        
        kivalasztas[M/2]++;
        
        for (int i = 0; i < M; i++){
            System.out.println(kivalasztas[i] + " ");
        }
        
        System.out.println("");
        
        int i = 0;
        while(!(kivalasztas[i] % 2 == 0)){
            i++;
        }
        System.out.println(kivalasztas[i]);
    }
    
}
