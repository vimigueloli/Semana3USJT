import javax.swing.JOptionPane;
public class AreaCounter{

   public static void main(String [] args){
   
   double base= 0;
   double altura= 0;
   double area= 0;
   base= Double.parseDouble(JOptionPane.showInputDialog("digite a base do ret�ngulo!"));
   altura= Double.parseDouble(JOptionPane.showInputDialog("digite a altura do ret�ngulo!"));
   area= base*altura; 
   JOptionPane.showMessageDialog(null,"a area do retangulo �: " + area + " m^2" );
   
   }

}