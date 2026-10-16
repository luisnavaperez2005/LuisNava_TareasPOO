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
        ArrayList<String> palabrasResultado = new ArrayList<>();


        for (int i = 0; i < 10; i++){
            numeros.add(i, i);
        }

        palabras.add(0,"Hola");
        palabras.add(1,"Programacion");
        palabras.add(2,"Laptop");
        palabras.add(3,"Papa");
        palabras.add(4,"Pantalla");
        palabras.add(5,"Internet");

        resultadoMultiplicacion = utileriaNumeros.multiplicar(numeros, 3);
        System.out.println("Numeros al Cuadrado "+ resultadoMultiplicacion);

        palabrasResultado = utileriaCadenas.filtroSelectivo(palabras, 'P', 9);
        System.out.println("Palabras que no empiezan con la letra P y su longitud son mayores que 9: "+palabrasResultado);


    }
}
