import java.awt.*;
public class MonthlyBudget
{
public static void main(String[] args)
  {
   PieChartWriter c =  new PieChartWriter();
   c.setTitle("Shpenzimet mujore"); 
   c.setSlice1(" Udhtim",10,Color.blue);
   c.setSlice2(" Ushqim",30,Color.red); 
   c.setSlice3(" Veshmbathje",45,Color.orange);
   c.setSlice4(" Libra", 25,Color.black);
   c.setSlice5(" Te tjera", 5,Color.green);

  }
}