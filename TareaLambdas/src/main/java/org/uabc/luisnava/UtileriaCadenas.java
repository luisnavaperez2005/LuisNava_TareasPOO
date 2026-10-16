package org.uabc.luisnava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UtileriaCadenas {
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

    public static HashMap<String, Integer> longitudes(ArrayList<String> palabras){
        HashMap<String, Integer> resultado;
        resultado = palabras.stream().collect(Collectors.toMap(palabra -> palabra, palabra -> palabra.length(), (anterior, nuevo) -> anterior, HashMap::new));
        return resultado;
    }

    public static void modificadorDeInventario(HashMap<String, Double> productos){
        productos.forEach((nombre, precio) -> { System.out.println(nombre + ":" + precio);});
    }




}
