package org.uabc.luisnava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Lambdas {

    public static void multiplicar(ArrayList<Integer> numeros, int valorAMultiplicar){
        numeros.replaceAll(n -> n * valorAMultiplicar);
    }

    public static void filtroSelectivo(ArrayList<String> palabras, char letra, int longitudMenor) {
        palabras.removeIf(n -> (n.charAt(0) == letra) || (n.length() < longitudMenor));
    }

    public static ArrayList<String> conversorAMayusculas(ArrayList<String> palabras){
        palabras.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
        return palabras;
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){
        HashSet<Integer> resultado = numeros.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toCollection(HashSet::new));
        return resultado;
    }




}
