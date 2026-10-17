package org.uabc.luisnava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void main() {
        //Se crean los objetos utileriaNumeros y utileriaCadenas
        UtileriaNumeros utileriaNumeros = new UtileriaNumeros();
        UtileriaCadenas utileriaCadenas = new UtileriaCadenas();

        //Se crean los arraylist y los HashMap para usarlos en los metodos
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> resultadoMultiplicacion;
        ArrayList<String> palabras = new ArrayList<>();
        HashMap<String, Double> productos = new HashMap<>();


        //Ciclo for que almacena los numeros del 0 a 9 al ArrayList numeros
        for (int i = 0; i < 10; i++){
            numeros.add(i, i);
        }

        //Palabras que se almacenan y se usaran en todas las pruebas de los metodos
        palabras.add(0,"Hola");
        palabras.add(1,"Programacion");
        palabras.add(2,"Laptop");
        palabras.add(3,"Papa");
        palabras.add(4,"Pantalla");
        palabras.add(5,"Internet");
        palabras.add(6, "Pantalla");
        palabras.add(7, "Hola");

        //HashMap que se usara para el metodo modificadorDeInventario
        productos.put("Computadora", 14000.0);
        productos.put("Teclado", 2500.0);
        productos.put("Mouse", 500.0);


        //ArrayList que se crean con las palabras que se declararon anteriormente
        ArrayList<String> palabrasFiltradas = new ArrayList<>(palabras);
        ArrayList<String> palabrasAMayusculas = new ArrayList<>(palabras);
        HashSet<Integer> numerosCuadradosUnicos = new HashSet<>(numeros);
        HashMap<String, Integer> longitudPalabras = new HashMap<>();
        HashMap<String, Integer> frecuencias = new HashMap<>();
        ArrayList<String> clasificaciones = new ArrayList<>();
        HashSet<String> noSeRepite = new HashSet<>();


        //Se pone a prueba el metodo de multiplicacion. Funciona correctamente
        resultadoMultiplicacion = utileriaNumeros.multiplicar(numeros, 3);
        System.out.println("Numeros multiplicados por 3 "+ resultadoMultiplicacion);

        //Se puso a prueba el metodo de filtroSelectivo con las palabras que pusimos
        //en el arraylist, la letra P y que su longitud sea menor que 9.
        //No imprime nada, entonces si se cumplio la condicion
        utileriaCadenas.filtroSelectivo(palabrasFiltradas, 'P', 9);
        System.out.println("Palabras que no empiezan con la letra P y su longitud son mayores que 9: "+palabrasFiltradas);


        palabrasAMayusculas = utileriaCadenas.conversorAMayusculas(palabrasAMayusculas);
        System.out.println("Palabras en MAYUSCULA: "+palabrasAMayusculas);



        //Se pone a prueba el metodo cuadradosUnicos. Muestra correctamente el cuadrado de 6, 12, 18, 24.
        // Son de estos numeros porque escogimos el mismo arraylist de numeros que
        // usamos en utileriaNumeros.multiplicar.
        numerosCuadradosUnicos = utileriaNumeros.cuadradosUnicos(numeros);
        System.out.println("Cuadrados de los numeros que son pares y unicos: "+numerosCuadradosUnicos);



        //Se prueba el metodo de lontigudes y vemos que funciona correctamente,
        // porque muestra la longitud de las palabras
        longitudPalabras = utileriaCadenas.longitudes(palabras);
        System.out.println("Longitudes de las palabras: "+longitudPalabras);


        //Se puso a prueba el metodo de de modificadorDeInventario y funciona correctamente.
        // Imprime los precios de los productos que declaramos con un 10% de descuento
        utileriaCadenas.modificadorDeInventario(productos);




        frecuencias = utileriaCadenas.contadorDeFrecuencias(palabras);
        System.out.println("Numero de veces que se repiten las palabras: "+frecuencias);



        //Se puso a prueba el metodo de clasificadorDePalabras y funciona correctamente.
        // Imprime las palabras que se repiten menos de 2 veces.
        // Y se imprimen las palabras que solo se repite una vez
        clasificaciones = utileriaCadenas.clasificadorDePalabras(frecuencias, 2);
        System.out.println("Palabras que se repiten menos de 2 veces: "+clasificaciones);



        //Se puso a prueba el metodo de deduplicador y funciona correctamente.
        // Se imprimio las palabras que no se repetian y que su longitud sea mayor que 5
        String frase = "Hola mundo este es una frase normal hola mundo frase";
        noSeRepite = utileriaCadenas.deduplicacionDePalabaras(frase, 5);
        System.out.println("Palabras que no se repiten y son mayores al limite de 5: "+noSeRepite);


        //Se puso a prueba el metodo de elTopeDeFrecuencias y si funciona ya que se
        // imprimio las palabras con frecuencia de 1, que fue el limite que se puso
        utileriaCadenas.elTopeDeFrecuencias(frecuencias, 1);
        System.out.println("Frecuencia de palabras limitada a 1: " + frecuencias);

    }
}
