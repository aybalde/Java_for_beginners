public class Arrays2D
{
   public static void main(String[] args)
   {
      String[][] letters = new String[3][4];
      letters[0] = new String[]{"a", "b", "c", "d", "e"};
      letters[1] = new String[]{"f", "g", "h", "i", "j"};
      letters[2] = new String[]{"k", "l", "m", "n", "o"};

      for (String[] row: letters)
      {
         for (String letter: row)
         {
            System.out.print(letter);
         }
         System.out.println();
      }

      int[][] numbers = {{1,2}, {3,4}, {5,6}, {7,8}};
      for (int y=0; y < numbers.length; y++)
      {
         for (int x = 0; x < numbers[0].length; x++)
         {
            System.out.print(numbers[y][x]);
         }
         System.out.println();
      }
   }
}