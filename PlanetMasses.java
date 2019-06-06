import java.awt.*;
public class PlanetMasses
{
public static void main(String[] args)
  {
   PieChartWriter c =  new PieChartWriter();
   c.setTitle("Masat e Paneteve"); 
   c.setSlice1(" Merkuri",2,Color.red); 
   c.setSlice2(" Venera",5,Color.blue);
   c.setSlice3(" Toka",15,Color.orange);
   c.setSlice4(" Marsi",10,Color.yellow);
   c.setSlice5(" Jupiteri",216,Color.blue);
   c.setSlice6(" Saturni",80,Color.green);
   
  }
}