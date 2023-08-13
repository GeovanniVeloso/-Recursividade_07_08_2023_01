package view;

import controller.RecursivaNaturais;

public class Main {

	public static void main(String[] args) {
		RecursivaNaturais rn = new RecursivaNaturais();
		
		int n = 10;
		int valor = 0;
		int  res = rn.naturais(n, valor);
				
		System.out.println(res);
	}

}
