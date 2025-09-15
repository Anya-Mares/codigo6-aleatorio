/** 
 * El código imprime números aleatorios y 
 * te permite resaltar números según la opción 
 * 1.- multiplos de 5, 2.- Multiplos de 7 
 * coloque un mensaje para cuando la persona pudiera no entender que hacer y fuera mas facil
 * 
 * */
package ejercicios;

import java.util.Scanner;

public class Codigo6 {//estaba con c minúscula
	public static void main(String[] args) {   
	    int[] n = new int[20];

	    for (int i = 0; i < 20; i++) {//faltaba +
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//faltaba colocar out
	    }
	    Scanner sc = new Scanner(System.in);
	    int opcion;
	    do {
	    System.out.print("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //int opcion = Integer.parseInt(System.console().readLine());//Faltaba un )//lo quite porue no funcionaba 
	    opcion = sc.nextInt();
	 if(opcion !=1 && opcion !=2) {
	 System.out.println("Opcion inválida. Debe ser 1 o 2. Prueba de nuevo");
	 }
	}while (opcion !=1 && opcion !=2);

int multiplo = (opcion == 1) ?5 : 7;// operador ternario corregido estaban : y ? alreves

	    for (int e : n) {//solo for 
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {//faltaba la llave 
	        System.out.print(e + " ");//tenia un in 
	      }
	    }
	    sc.close();
	}
}
     
  
