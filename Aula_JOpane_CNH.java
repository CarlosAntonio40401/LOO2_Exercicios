
import javax.swing.JOptionPane;


//Carlos Antonio CPD 40401

public class Aula_JOpane_CNH {
   


    public static void main(String[] args) {

      
        String nome = null;

        nome=JOptionPane.showInputDialog(null, "Informe o nome do usuario:","Digite o nome do usuario");
       
        String idade=null;
        idade = JOptionPane.showInputDialog(null, "Informe a idade:");
        int idad=Integer.parseInt(idade);
        
        if(idad>=18){
        JOptionPane.showMessageDialog(null,"Voce já podetira a CNH");
        }
        else{
        String Menssangem = String.format("%s Voce ainda não pode tira a CNH \n voce tem apenas %d anos",nome,idad);
        JOptionPane.showMessageDialog(null,Menssangem);
        
        }
  
    }

}

    
