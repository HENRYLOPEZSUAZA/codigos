package codigos.parcialpilas;

import java.util.Scanner;
import java.util.Stack;

public class metodos {

    public void ejerciciodepilas() {

        System.out.println("EJERCICIO NUMERO 5 DE PILAS");
        System.out.println("REALIZADO POR HENRY LOPEZ SUAZA");

        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        System.out.println("Ingrese el valor del tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        vector = m.llenarVector(vector);
        System.out.println("El vector quedo de la siguiente manera");
        m.mostrarVector(vector);

        Stack<Integer> pila = new Stack<>();

        pila = m.llenarPilaConfactorial(pila,vector);
        m.mostrarPila(pila);



    }

    public int[] llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random() * 10 + 1);           
        }
        return vector;
    }

    public void mostrarVector(int[] vector){
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" "+vector[i]+" ");
        }
        System.out.print("]");
    }

    public Stack<Integer> llenarPilaConfactorial(Stack<Integer> pila, int[] vector){
        int n = vector.length;
        metodos m = new metodos();
        for (int i = 0; i < n; i++) {
            pila.push(m.factorial(vector[i]));
        }
        return pila;
    }

    public int factorial(int numero){
        if (numero < 0){
            System.out.println("No es posible asignar un factorial, por lo tanto se coloca el numero 1");
            return 0;
        }
        int factorial = 1;
        for (int i = 1; i <=numero; i++) {
            factorial *=i;
        }
        return factorial;
    }

    public void mostrarPila(Stack<Integer> pila){
        System.out.println("\nLa pila quedo de la siguiente manera: ");
        System.out.println(pila);
        
        System.out.println("\nDesapilamos la pila: ");

        int i = 1;
        while (!pila.isEmpty()) {
            System.out.print(i++ + " --> ");
            System.out.println(pila.pop());
        }
    }
}
