package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.produto;
public class Main {

	public static void main(String[] args) {
	
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Data de entrada do produto: ");
			System.out.print("nome:	");
			String name = sc.nextLine();
			
			System.out.print("preço: ");
			double price = sc.nextDouble();
			
			produto product = new produto(name, price);
			
			System.out.println();
			System.out.println("data do produto: " + product);
			
			System.out.println();
			System.out.print("Entrada de produtos no stock: ");
			int quantity=sc.nextInt();
			product.addProducts(quantity);
			
			System.out.println();
			System.out.println("adição de produtos: "+product);
			
			System.out.println();
			System.out.println("Saida de produtos do stock: ");
			quantity = sc.nextInt(); 
			product.removeProducts(	quantity);
			
			System.out.println();
			System.out.println("saida de produtos: "+product);
			
			
			
			
			
			
			
			
			sc.close();
	}

}
