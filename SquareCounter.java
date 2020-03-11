import javax.swing.JOptionPane;
public class SquareCounter{

   public static void main(String [] args){
   
   double numero= 0;
   numero= Double.parseDouble(JOptionPane.showInputDialog("digite um numero para elevar ao quadrado"));
   numero= Math.pow(numero,2); 
   JOptionPane.showMessageDialog(null,"o numero que você digitou ao quadrado é: " + numero);
   
   }

}