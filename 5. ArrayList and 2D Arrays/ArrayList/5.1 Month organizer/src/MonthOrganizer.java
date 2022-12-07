import java.util.ArrayList;

public class MonthOrganizer
{
   public static void main(String[] args)
   {
      ArrayList<String> months = new ArrayList<>(12);
      months.add("January");
      months.add("February");
      months.add("May");
      months.add("June");
      months.add("July");
      months.add("October");
      months.add("November");
      months.add("December");

      System.out.println(months);
      months.add(5, "September");
      months.add(2, "April");
      months.add(6, "August");
      months.add(2, "March");
      System.out.println(months);
   }
}