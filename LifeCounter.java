import javax.swing.JOptionPane;
public class LifeCounter{

   public static void main(String [] args){
   
   int idade= 0;
   idade= Integer.parseInt(JOptionPane.showInputDialog("digite a sua idade!"));
   idade= idade*360; 
   JOptionPane.showMessageDialog(null,"voce viveu " + idade + " dias!");
   
   }

}