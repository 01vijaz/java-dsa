public class MoveZeroes {
    
   public static void main(String[] args) {
    
     int[] a = {0,1,0,3,12};
     
     int c = 0;

     for(int i = 0; i < a.length; i++){
       if(a[i]!=0){
        int t = a[i];
        a[i] = a[c];
        a[c] = t; 
        c++; 
       } 
     } 
    
     for(int i = c; i < a.length; i++){
        a[i] = 0;
     }
     
       for(int x : a){
        System.out.println(x + " ");
       }

   } 
}
