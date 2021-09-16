package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.rafaelgaldino.Pilha;
import controller.NPRController;

public class Main {

	public static void main(String[] args) throws Exception {
		Pilha p = new Pilha();
		NPRController nC = new NPRController();
		int res;
		
	    String s = JOptionPane.showInputDialog("Calculadora notação pos-fixa\n"
	          		+ "Exemplo de uso:\n   5 9 + 2 * 6 5 ** \n"
	          		+ "Informe sua expressao:\n");
	    
	    res = nC.npr(p,s);
	    
	    System.out.println(res);

	      }  
	}
