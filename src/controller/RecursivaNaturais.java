package controller;

public class RecursivaNaturais {
	public RecursivaNaturais () {
		super ();
	}
	
	//Explicação: A função recebe o número digitado e segue dele até 0, somando a cada passo. Como qualquer número negativo é inferior a 0, a condição de parada é caso o número for igual ou menor que 0.
	// A soma é composta pelo valor anterior, inicializado com 0, mais o resultado da função anterior, com n - 1.
	public int naturais ( int n, int valor) {
		if (n<=0) {
			return 0; 
		}else {
			valor = n + naturais(n-1, valor);
			return valor;
		}
	}
	
}
