public class CafeReceipt
{
   public static void main(String[] args)
   {

     String customerName = "Hisao";
     int cupsOfCoffee   = 1;
     double costOfCoffee = 99.9;
     boolean tip = true;


      System.out.println("Dear " + customerName + ", thank you for supporting our business!");
      System.out.println("Cups of coffee bought: " + cupsOfCoffee + ".");
      System.out.println("Cost of 1 cup of coffee: $" + costOfCoffee + ".");
      System.out.println("Your total is: $99.9.");
      System.out.print("Tip is included? " + tip + ".");
   }
}