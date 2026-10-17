package org.uabc.luisnava;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        UtileriaNumeros utileriaNumeros = new UtileriaNumeros();
        UtileriaCadenas utileriaCadenas = new UtileriaCadenas();

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> resultadoMultiplicacion;
        ArrayList<String> palabras = new ArrayList<>();


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


        ArrayList<String> palabrasFiltradas = new ArrayList<>(palabras);
        ArrayList<String> palabrasAMayusculas = new ArrayList<>(palabras);

        resultadoMultiplicacion = utileriaNumeros.multiplicar(numeros, 3);
        System.out.println("Numeros multiplicados por 3 "+ resultadoMultiplicacion);

        utileriaCadenas.filtroSelectivo(palabrasFiltradas, 'P', 9);
        System.out.println("Palabras que no empiezan con la letra P y su longitud son mayores que 9: "+palabrasFiltradas);

        palabrasAMayusculas = utileriaCadenas.conversorAMayusculas(palabrasAMayusculas);
        System.out.println("Palabras en MAYUSCULA: "+palabrasAMayusculas);


    }
}
