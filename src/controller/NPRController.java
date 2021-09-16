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
        for (int i=0; i<op.length(); i++) {
             c = op.charAt(i);
            if (Character.isDigit(c))
                p.push(Character.digit(c,10));
            else if(c=='+') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                p.push(arg1+arg2);
            }
            else if(c=='*') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                p.push(arg1*arg2);
            }
            else if(c=='-') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                if(arg1 > arg2) {
                    p.push(arg1-arg2);
                    }else {
                    	p.push(arg2-arg1);
                    }
            }
            else if(c=='/') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                if(arg1 > arg2) {
                p.push(arg1/arg2);
                }else {
                	p.push(arg2/arg1);
                }
            }
            else if(c=='^') {
                arg1 = p.top(); p.pop();
                arg2 = p.top(); p.pop();
                p.push((int) Math.pow(arg1,arg2));
            }
        }
        res = p.top();p.pop();
        return res;
	}
}