# LuisNava_TareasLambdas

En esta tarea creamos 2 clases que tienen unicamente métodos estáticos. Éstas deberán tener nombres apropiados que indiquen su función. Cada una tendrá los métodos que corresponden dependiendo de la categoría de datos que manipulan (números o cadenas).

Crea una clase Main o de pruebas que demuestre TODOS los métodos con ejemplos representativos. Muestra los resultados antes y después de cada operación cuando corresponde. Las pruebas deben cubrir casos normales, casos edge o extremos (listas vacías, valores nulos) y demostrar el correcto funcionamiento de cada método.

1. El Multiplicador (ArrayList)
Escribe un método estático que dado un ArrayList<Integer>, utiliza el método replaceAll() y una expresión lambda para multiplicar cada número de la lista por un factor que recibe. 
Metodo:

/*
    Metodo multiplicar que recibe como parametro un arraylist
    y el numero con el que se va a multiplicar todos los numeros del arraylist.
    Retorna el arraylist de numeros
     */
    public static ArrayList<Integer> multiplicar(ArrayList<Integer> numeros, int valorAMultiplicar){
        numeros.replaceAll(n -> n * valorAMultiplicar);
        return numeros;
    }
Prueba con:
resultadoMultiplicacion = utileriaNumeros.multiplicar(numeros, 3);
<img width="526" height="42" alt="image" src="https://github.com/user-attachments/assets/2105a300-3e3f-47e0-b0c1-7e75333c5f20" />


