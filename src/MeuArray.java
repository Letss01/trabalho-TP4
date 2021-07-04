
public class MeuArray {
	private int[] arrayA = new int[] { 1, 2, 3, 655, 78, 81, 62, 35, 98, 41 };
	private int[] arrayB = new int[] { 12, 13, 65, 95, 10, 78, 2, 1, 15, 69 };

	public int[] getArrayA() {
		return this.arrayA;
	}

	public int[] getArrayB() {
		return this.arrayB;
	}

	public void setArrayA(int[] novoArray) {
		this.arrayA = novoArray;
	}

	public void setArrayB(int[] novoArray) {
		this.arrayB = novoArray;
	}

	public void setArrayANaPosicao(int valor, int posicao) {
		try {
			this.arrayA[posicao] = valor;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("a posição não pode ser maior que " + this.arrayA.length);
		}

	}

	public void setArrayBNaPosicao(int valor, int posicao) {
		try {
			this.arrayB[posicao] = valor;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("a posição não pode ser maior que " + this.arrayB.length);
		}
	}

	public void calcula(int a, int b) {
		try {
			int divisao = a/b;
			
			if (divisao == 0) {
				throw new ExcecaoDivisaoResultadoZero("divisão igual 0 ");
			}
			
			System.out.println(" valor da divisão: " + divisao);
			}
		catch(ArithmeticException ex) {
			System.out.println("Não é possivel dividir por 0 " );
		}
		catch(ExcecaoDivisaoResultadoZero ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("valor a: " + a +", valor b: " + b);
		}
	}
	
	public void calculaDivisaoArrays() {
		for (int i = 0; i < 10; i++) {
			this.calcula(this.arrayA[i], this.arrayB[i]);
		}
	}
	
}
