import java.util.Scanner;
class PrintPrime{
   public static boolean isPrime(int num){
       if(num == 1 || num == 2)
          return true;
       if(num == 0)
          return false;

       for(int i=2; i<=num/2; i++){
           if(num%i == 0)
              return false;
        }
        return true;
   }

   public static void main(String arg[]){
       int[] arr = new int[5];
       Scanner scan = new Scanner(System.in);
       for(int i=0; i<5; i++){
          arr[i] = scan.nextInt();
       }
       
       for(int i=0; i<5; i++){
          if(isPrime(arr[i])){
            System.out.println(arr[i]);
          }
       }
   }
}