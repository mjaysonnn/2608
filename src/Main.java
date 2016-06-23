import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
 
    private void run() {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String[] A = new String[2];
        for (int i = 0; i < 2; i++) {
            A[i] = sc.next();
        }
         
        //int count = 0;
        for (int i = 0; i < 2; i++) {
          sum+= isSimilarWord(A[i]);
                //count++;
            
        }
       System.out.println(sum);
    }
 
    private int isSimilarWord(String word1) {
        int number=0;
        char[] char_array=word1.toCharArray();
 
        for (int i = 0; i < word1.length(); i++) {
           if(char_array[i]=='M') 
               number+=1000;
           else if(char_array[i]=='D')
               number+=500;
           else if(char_array[i]=='C')
           {
               if(char_array[i]=='M')
                   number+=900;
               else if(char_array[i]=='D')
                   number+=400;
               else number+=100;
           }
               number+=100;
        
         
        
        
    }
        return number;
}}