package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class PredicateFuncional {

	public static boolean productPredicate(Product p) {
		return p.getPrice() >= 100;
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(PredicateFuncional::productPredicate);
		list.forEach(System.out::println);

		// EXPRESSÃO LAMBDA INLINE:
		// NÃO É NECESSÁRIO CRIAR UM MÉTODO BOOLEANO PARA UTILIZAR
		double min = 100.0; // define-se uma variável com o valor parametrizado
		list.removeIf(prod -> prod.getPrice() >= min); // cria-se a expressão lambda passando a variável como argumento

	}

}
