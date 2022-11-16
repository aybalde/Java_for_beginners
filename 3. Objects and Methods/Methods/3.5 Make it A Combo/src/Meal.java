public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

    //Instance methods//
   public void makeItACombo(){
        cost += 3;
   }

   public String getBill(){
       //System.out.println(name + " with fries and soda $" + cost);
       return name + " with fries and soda, $" + cost;
   }
   public static void main(String[] args){
        Meal plate = new Meal("Burguer",6.99);
        plate.makeItACombo();
        System.out.println(plate.cost);
        String menu = plate.getBill();
        System.out.println(menu);

   }
}