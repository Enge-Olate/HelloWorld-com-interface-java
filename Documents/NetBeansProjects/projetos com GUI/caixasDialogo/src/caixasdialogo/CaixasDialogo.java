/*
 * Enge-Olate
 * Data:27/11/2022
 * Testes com GUI, usando o JOptionPane.showMessageDialog.
 */
package caixasdialogo;

/**
 *Pacotes incluídos para o trabalho. 
 * @author Márcio Olate
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
/*
*  Fim dos pacotes.
*/
public class CaixasDialogo {

    public static void main(String[] args) {
        //Variáveis
        String mensagen;
        //Fim variáveis
        //Para entrada de dados, digitados pelo usuário via terminal.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite aqui sua mensagem:     ");
        
        mensagen = entrada.nextLine();
        //Exibindo à mensagem do usuário
        JOptionPane.showMessageDialog(null, mensagen);
        
    }//Fim da classe main
    
}//Fim do programa
