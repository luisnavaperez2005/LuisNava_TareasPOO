package org.uabc.luisnava;

import java.util.ArrayList;

public class Lambdas {

    public static void multiplicar(ArrayList<Integer> numeros, int valorAMultiplicar){
        numeros.replaceAll(n -> n * valorAMultiplicar);
    }

}
