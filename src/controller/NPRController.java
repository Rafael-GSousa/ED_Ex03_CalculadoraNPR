package controller;

import br.edu.fateczl.rafaelgaldino.Pilha;

public class NPRController {

	public NPRController() {
		super();
	}
	
	Pilha p = new Pilha();
	
	public void insereValor(Pilha p, int valor) {
				p.push(valor);

	}
	
	public int npr(Pilha p, String op) throws Exception {
		char c ;
		int arg1,arg2,res;
		
		if(op.length() < 3) {
			System.err.println("Não há elementos suficientes para fazer a operação!");
		}
		else {
        for (int i=0; i<op.length(); i++) {
             c = op.charAt(i);
            if (Character.isDigit(c))
                insereValor(p,Character.digit(c,10));
            else if(c=='+') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                insereValor(p,arg1+arg2);
            }
            else if(c=='*') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                insereValor(p,arg1*arg2);
            }
            else if(c=='-') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                if(arg1 > arg2) {
                	insereValor(p,arg1-arg2);
                  }
                else {
                   	insereValor(p,arg2-arg1);
                  }
            }
            else if(c=='/') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                if(arg1 > arg2) {
                	insereValor(p,arg1/arg2);
                }
                else {
                	insereValor(p,arg2/arg1);
                }
            }
            else if(c=='^') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                insereValor(p,(int) Math.pow(arg1,arg2));
            }
        }
		}
        res = p.top();
        res = p.pop();
        insereValor(p,res);
        return res;
	}
}