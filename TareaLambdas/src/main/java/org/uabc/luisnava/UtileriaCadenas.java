package org.uabc.luisnava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UtileriaCadenas {
    public static ArrayList<String> filtroSelectivo(ArrayList<String> palabras, char letra, int longitudMenor) {
        palabras.removeIf(n -> (n.charAt(0) == letra) || (n.length() < longitudMenor));
        return palabras;
    }

    public static ArrayList<String> conversorAMayusculas(ArrayList<String> palabras){
        return palabras.stream().map(String::toUpperCase).distinct().collect(Collectors.toCollection(ArrayList::new));
    }


    public static HashMap<String, Integer> longitudes(ArrayList<String> palabras){
        HashMap<String, Integer> resultado;
        resultado = palabras.stream().collect(Collectors.toMap(palabra -> palabra, palabra -> palabra.length(), (anterior, nuevo) -> anterior, HashMap::new));
        return resultado;
    }

    public static void modificadorDeInventario(HashMap<String, Double> productos){
        productos.forEach((nombre, precio) -> { System.out.println(nombre + ":" + (precio * 0.90));});
    }

    public static HashMap<String, Integer> contadorDeFrecuencias(ArrayList<String> palabras){
        HashMap<String, Integer> frecuencias = new HashMap<>();
        palabras.forEach(palabra -> frecuencias.merge(palabra, 1,(anterior, nuevo) -> anterior + nuevo));
        return frecuencias;
    }

    public static ArrayList<String> clasificadorDePalabras(HashMap<String, Integer> frecuencias, int valorDeLimite){
        ArrayList<String> resultado;
        resultado = frecuencias.entrySet().stream().filter(n -> n.getValue() < valorDeLimite).map(n -> n.getKey()).collect(Collectors.toCollection(ArrayList::new));
        return resultado;
    }

    public static HashSet<String> deduplicacionDePalabaras(String frase, int valorDeLimite){
        String[] palabras = frase.split("\\s+");
        HashSet<String> resultado;
        resultado = Arrays.stream(palabras).filter(n -> n.length() >= valorDeLimite).map(String::toLowerCase).collect(Collectors.toCollection(HashSet::new));
        return resultado;
    }

    public static void elTopeDeFrecuencias(HashMap<String, Integer> frecuencia, int valorDeLimite){
        frecuencia.replaceAll((palabra, cantidad) -> cantidad > valorDeLimite ? valorDeLimite : cantidad);
    }


}
