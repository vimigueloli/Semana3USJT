import javax.swing.JOptionPane;
public class StringCounter{

   public static void main(String [] args){
   
   String str1;
   String str2;
   String str3;
   int counter=0;
   str1= JOptionPane.showInputDialog("digite uma frase");
   str2= JOptionPane.showInputDialog("digite outra frase");
   str3= JOptionPane.showInputDialog("digite mais uma frase");
   counter= str1.length() + str2.length() + str3.length();
   JOptionPane.showMessageDialog(null,"a soma de caracteres das frases que você digitou é " + counter);
   
   }

}