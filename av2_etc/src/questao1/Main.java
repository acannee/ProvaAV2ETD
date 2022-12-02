package questao1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;

	public class Main {
	public static void main(String[] args) throws  FullStackException,FileNotFoundException {
	      	ArrayStack<String> pilha = new ArrayStack<>();
	        LinkedList<String> lista = new LinkedList<>();
	        Scanner scanner;
	        scanner = new Scanner(new File ("C:\\Users/Suporte/Downloads/nomes.txt"));

	        while(scanner.hasNextLine()){
	            pilha.push(scanner.nextLine());
	        }

	        while(pilha.size() != 0){
	            lista.add(pilha.pop());
	        }
	       
	        ListIterator<String> iterador = lista.listIterator(0);
	        System.out.println("--- Estrutura em Pilha ---");
	        while(iterador.hasNext()){
	            String nome = iterador.next();
	           
	            System.out.println(nome);
	     }

	 }
}