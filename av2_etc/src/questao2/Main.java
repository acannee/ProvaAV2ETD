package questao2;

import java.util.Scanner;

class Main {
	  public static void main(String[] args) {
	    
	    Scanner ler = new Scanner(System.in);
	    
	    AVLTree arvore = new  AVLTree();
	    AVLTree t = new AVLTree();
	    AVLTree.Node root = null;

	    int[] vetor = {50, 13, 5, 17 , 9, 8, 10, 12, 55, 70};
	    int opcao=0;
	    
	    do{
	    System.out.println("******MENU******");
	    System.out.println("(1) Inserir Elemento");
	    System.out.println("(2) Excluir Elemento");
	    System.out.println("(3) Pré-ordem");
	    System.out.println("(4) Sair");
	   
	    opcao=ler.nextInt();
	    
	    switch (opcao) {
	      case 1:
	        for (int i = 0; i < vetor.length; i++) {
	        root = t.insert(root, vetor[i]);
	        t.print(root);
	        }
	      break;
	        
	      case 2:
	        System.out.println("Digite um número:");
	        int  num = ler.nextInt();
	        t.deleteNode(root, num);
	      break;
	        
	      case 3:
	        t.preOrder(root);
	      break;
	        
	      case 4:
	         System.out.println("Desconectando");
	      break;
	        
	      default:
	        System.out.println("Opcão inválida.");
	            }
	        }while(opcao!=4);
	  }
	}