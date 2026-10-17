package org.uabc.luisnava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UtileriaNumeros {

    public UtileriaNumeros(){
        ArrayList<Integer> numeros = new ArrayList<>();
    }

    public static ArrayList<Integer> multiplicar(ArrayList<Integer> numeros, int valorAMultiplicar){
        ArrayList<Integer> resultado;
        numeros.replaceAll(n -> n * valorAMultiplicar);
        return numeros;
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){
        HashSet<Integer> resultado = numeros.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toCollection(HashSet::new));
        return resultado;
    }

}
