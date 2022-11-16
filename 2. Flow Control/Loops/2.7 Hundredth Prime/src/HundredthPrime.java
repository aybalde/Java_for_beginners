public class HundredthPrime
{
   public static void main(String[] args)
   {
      long start = System.nanoTime(); // Start time execution
      int count = 1;
      int num = 1;
      int verif;
                        /****    First Method *************/
      /* execution time 0.9 ms to determine the hundredth prime number*/
     /* while (count < 100)
      {
         num++;

         for(int div = num - 1; div > 1; div--)
         {
            if (num % div == 0)
            {
               break;
            }
            else if (div == 2)
            {
               count++;
            }
         }
      }*/

                      /****   Second Method   *********/
      /* execution time 0.2 ms to determine the hundredth prime number*/
      while(count <= 1000){
         int i = 1;
         num++;
         verif = 0;
        /* if (num > 10000 ){
            i = num/2;
            verif++;
         }*/
         for (; i <= num; i++){

            if (num % i == 0 ){
               verif++;
               if (verif == 2 && i < num){
                  verif =0;
                  break;
               }
            }
         }
         if (verif == 2){
            count++;
         }
      }
      long end = System.nanoTime(); // end time execution
      double time = (end - start)/1e6;
      System.out.println(time + " ms"); //  time to execute the program
      System.out.println(num); // print the hundredth prime number
   }
}