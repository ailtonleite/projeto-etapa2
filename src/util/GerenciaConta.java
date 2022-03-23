package util;

import java.util.ArrayList;

import model.Conta;

public class GerenciaConta {
	
	private ArrayList<Conta> contas;
	
	public GerenciaConta() {
		contas = new ArrayList<>();
	}
	
	public void adicionar(Conta c) {
		contas.add(c);
	}
	
	public String exibir(int numero) {
		for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return contas.get(i).toString();
            }
        }
        return "Não encontrado";
	}
	
	public boolean reomver(int numero) {
		int p = posicao(numero);
		if(p >= 0) {
			if(contas.remove(p) != null) {
				return true;
			}
		}
		return false;
	}
	
	public boolean sacar(int numero, double valor) {
		for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return contas.get(i).sacar(valor);
            }
        }
		return false;
	}
	
	public boolean depositar(int numero, double valor) {
		for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                contas.get(i).depositar(valor);
                return true;
            }
        }
		return false;
	}
	
	private int posicao(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1; // retorna -1 se não achou
    }

}
