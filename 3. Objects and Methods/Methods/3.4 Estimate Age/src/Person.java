public class Person
{
   private int yearBorn;
   private int yearDeceased;
   private String name;

   public Person(String named, int born, int died)
   {
      name = named;
      yearBorn = born;
      yearDeceased = died;
   }

   public void epitaph()
   {
      System.out.println(name + " lived to an age of " + (yearDeceased - yearBorn));
   }

   public static void main(String[] args)
   {
      Person grandma = new Person("Mary", 1932, 1999);
      grandma.epitaph();
   }
}