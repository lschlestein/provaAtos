package quest4;

public class Principal {

	public static void main(String[] args) {
		Product produto = new Product("Celular");
		produto.SetName("Computador");
		System.out.print(produto.GetName());
	}

}
