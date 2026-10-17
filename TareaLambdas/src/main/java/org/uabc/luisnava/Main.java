package org.uabc.luisnava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        UtileriaNumeros utileriaNumeros = new UtileriaNumeros();
        UtileriaCadenas utileriaCadenas = new UtileriaCadenas();

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> resultadoMultiplicacion;
        ArrayList<String> palabras = new ArrayList<>();
        HashMap<String, Double> productos = new HashMap<>();


        for (int i = 0; i < 10; i++){
            numeros.add(i, i);
        }

        palabras.add(0,"Hola");
        palabras.add(1,"Programacion");
        palabras.add(2,"Laptop");
        palabras.add(3,"Papa");
        palabras.add(4,"Pantalla");
        palabras.add(5,"Internet");
        palabras.add(6, "Pantalla");
        palabras.add(7, "Hola");

        productos.put("Computadora", 14000.0);
        productos.put("Teclado", 2500.0);
        productos.put("Mouse", 500.0);


        ArrayList<String> palabrasFiltradas = new ArrayList<>(palabras);
        ArrayList<String> palabrasAMayusculas = new ArrayList<>(palabras);
        HashSet<Integer> numerosCuadradosUnicos = new HashSet<>(numeros);
        HashMap<String, Integer> longitudPalabras = new HashMap<>();
        HashMap<String, Integer> frecuencias = new HashMap<>();
        ArrayList<String> clasificaciones = new ArrayList<>();
        HashSet<String> noSeRepite = new HashSet<>();


        resultadoMultiplicacion = utileriaNumeros.multiplicar(numeros, 3);
        System.out.println("Numeros multiplicados por 3 "+ resultadoMultiplicacion);

        utileriaCadenas.filtroSelectivo(palabrasFiltradas, 'P', 9);
        System.out.println("Palabras que no empiezan con la letra P y su longitud son mayores que 9: "+palabrasFiltradas);

        palabrasAMayusculas = utileriaCadenas.conversorAMayusculas(palabrasAMayusculas);
        System.out.println("Palabras en MAYUSCULA: "+palabrasAMayusculas);

        numerosCuadradosUnicos = utileriaNumeros.cuadradosUnicos(numeros);
        System.out.println("Cuadrados de los numeros que son pares y unicos: "+numerosCuadradosUnicos);

        longitudPalabras = utileriaCadenas.longitudes(palabras);
        System.out.println("Longitudes de las palabras: "+longitudPalabras);

        utileriaCadenas.modificadorDeInventario(productos);

        frecuencias = utileriaCadenas.contadorDeFrecuencias(palabras);
        System.out.println("Numero de veces que se repiten las palabras: "+frecuencias);

        clasificaciones = utileriaCadenas.clasificadorDePalabras(frecuencias, 2);
        System.out.println("Palabras que se repiten menos de 2 veces: "+clasificaciones);

        String frase = "Hola mundo este es una frase normal hola mundo frase";
        noSeRepite = utileriaCadenas.deduplicacionDePalabaras(frase, 5);
        System.out.println("Palabras que no se repiten y son mayores al limite de 5: "+noSeRepite);


        utileriaCadenas.elTopeDeFrecuencias(frecuencias, 1);
        System.out.println("Frecuencia de palabras limitada a 1: " + frecuencias);

    }
}
