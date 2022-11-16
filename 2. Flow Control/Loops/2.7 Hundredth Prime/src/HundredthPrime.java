public class HundredthPrime
{
   public static void main(String[] args)
   {
      long start = System.nanoTime();
      int count = 0;
      int num = 1;
      int verif;
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
      while(count < 100){
         num++;
         verif = 0;
         for (int i = 1; i <= num; i++){
            if (num % i == 0){
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
      long end = System.nanoTime();
      System.out.println((end - start)/1e6);
      System.out.println(num);
   }
}