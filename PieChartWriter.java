import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class PieChartWriter extends JPanel
{
  private int width=400; 
  private int height=300; 
  private int x = width/13;
  private int y = height/10; 
  private int diameter =height-height/3; 
  private String label1 ="",label2 ="",label3 ="",label4 ="",label5 ="",label6 ="";
  private Color color1,color2,color3,color4,color5,color6;
  private double amount1,amount2,amount3,amount4,amount5,amount6;
  private double totalStartAngle=0;
  private JFrame myFrame = new JFrame();
  public PieChartWriter()
  {
  myFrame.getContentPane().add(this);
  myFrame.setSize(width,height);
  myFrame.setVisible(true);
  }
  
  public void setTitle(String title)
  {
   myFrame.setTitle(title);
  }
  
   public void paintComponent(Graphics g)
  {
  g.setColor(Color.white);
  g.fillRect(0,0,width,height);
  draw(color1,label1,0,calculateArcAngle(amount1),1,g);
  draw(color2,label2,calculatestartAngle(amount1),calculateArcAngle(amount2),2,g);
  draw(color3,label3,calculatestartAngle(amount2),calculateArcAngle(amount3),3,g);
  draw(color4,label4,calculatestartAngle(amount3),calculateArcAngle(amount4),4,g);
  draw(color5,label5,calculatestartAngle(amount4),calculateArcAngle(amount5),5,g);
  draw(color6,label6,calculatestartAngle(amount5),calculateArcAngle(amount6),6,g);
  }
  private void draw(Color color,String label,double startAngle,double arcAngle,int m,Graphics g){
  Graphics2D g2 = (Graphics2D) g; 
  g2.setPaint(color);
  g2.fill(new Arc2D.Double(x,y,diameter,diameter,startAngle,arcAngle, Arc2D.PIE));
  g.drawString(label,250,40+20*m);
  }
  private double total(){
  double totali=amount1+amount2+amount3+amount4+amount5+amount6;
  return totali;
  }
  
  private double calculateArcAngle(double amount){
  return (amount*360)/total();
  }
  
  private double calculatestartAngle(double amount){
   totalStartAngle = totalStartAngle + calculateArcAngle(amount); 
   return totalStartAngle;
  }

   public void setSlice1(String label,double amount,Color C){
  label1 =label;
  amount1 = amount;
  color1=C;
  this.repaint();
  }
  public void setSlice2(String label,double amount,Color C){
  label2 =label;
  amount2=amount;
  color2=C;
  this.repaint();
  }
  public void setSlice3(String label,double amount,Color C){
  label3 =label;
  amount3=amount;
  color3=C;
  this.repaint();
  }
   public void setSlice4(String label,double amount,Color C){
  label4 =label;
  amount4=amount;
  color4=C;
  this.repaint();
  } 
  public void setSlice5(String label,double amount,Color C){
  label5 =label;
  amount5=amount;
  color5=C;
  this.repaint();
  }
  public void setSlice6(String label,double amount,Color C){
  label6 =label;
  amount6=amount;
  color6=C;
  this.repaint();
  }
}