
package gyakorlas0227;


public class TombGyak {
    public static void main(String[] args) {
        final int M = 9;
        //String szo = "abc";
        //String[] betuk = {"a", "b", "c"};
        char[] betuk = {'a', '\n', ' '}; //Üres nem lehet
        
        betuk = new char[M];
        betuk[0] = 'x';
        betuk[1] = 'x';
        betuk[2] = 'x';
        betuk[3] = 'x';
        betuk[4] = 'x';
        betuk[5] = 'x';
        
        for (int i = 0; i < betuk.length; i++){
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < M; i++){
           betuk[i] = (char)(i+97);
        }
        
        int[] sorrend = {2,4,6,8,3,5,0,1};
        for(int i = 0; i < M; i++){
            int t = (int)(Math.random()*M);
            int temp = sorrend[i];
            sorrend[i] = sorrend[t];
            sorrend[t] = temp;
        }
        
        //megjelenítés
        for (int i = 0; i < M; i++){
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            int index = sorrend[i];
            char betu = betuk[index];
            System.out.print((char)(i+97) + " ");
        }
        System.out.println("");
    }
}
