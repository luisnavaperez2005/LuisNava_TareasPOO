package org.uabc.luisnava;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        UtileriaNumeros utileriaNumeros = new UtileriaNumeros();
        UtileriaCadenas utileriaCadenas = new UtileriaCadenas();

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            numeros.add(i, i);
        }

        utileriaNumeros.multiplicar(numeros, 3);

    }
}
