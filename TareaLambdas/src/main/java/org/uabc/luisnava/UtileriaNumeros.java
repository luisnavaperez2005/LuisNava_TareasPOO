package org.uabc.luisnava;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UtileriaNumeros {

    public UtileriaNumeros(){
        ArrayList<Integer> numeros = new ArrayList<>();
    }

    public static ArrayList<Integer> multiplicar(ArrayList<Integer> numeros, int valorAMultiplicar){
        ArrayList<Integer> resultado;
        numeros.replaceAll(n -> n * valorAMultiplicar);
        return numeros;
    }
}
