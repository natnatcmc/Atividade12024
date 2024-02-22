package atividades;
import java.util.Scanner;

public class Atividade12 {
	
    public static void main (String[]args) {
    	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o raio do círculo:");
	int raio= sc.nextInt();
	
	
	float pi = 3.14f;
	
	
	float resultado = pi * (raio * 2);
	System.out.println("A área do círculo é: " + resultado);
    }
}
