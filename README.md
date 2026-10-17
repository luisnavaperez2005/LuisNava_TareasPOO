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



2. El Filtro Selectivo (ArrayList)
Escribe un método estático que dado un ArrayList<String>, utiliza el método removeIf() para eliminar todas las cadenas que comiencen con una letra que recibe como parámetro o que tengan una longitud menor a N caracteres.
Metodo:
/*
     Metodo filtroSelectivo que recibe como parametro un ArrayList de tipo string,
     una letra que servira como filtro para eliminar una palabra del arraylist con esa letra.
     Tambien recibe como parametro un numero que servira como filtro que elimina aquellas
     palabras que tengan menos de N caracteres
     */
    public static ArrayList<String> filtroSelectivo(ArrayList<String> palabras, char letra, int longitudMenor) {
        palabras.removeIf(n -> (n.charAt(0) == letra) || (n.length() < longitudMenor));
        return palabras;
    }
   Prueba con:
   //Se puso a prueba el metodo de filtroSelectivo con las palabras que pusimos
        //en el arraylist, la letra P y que su longitud sea menor que 9.
        //No imprime nada, entonces si se cumplio la condicion
        utileriaCadenas.filtroSelectivo(palabrasFiltradas, 'P', 9);
        System.out.println("Palabras que no empiezan con la letra P y su longitud son mayores que 9: "+palabrasFiltradas);
<img width="614" height="22" alt="image" src="https://github.com/user-attachments/assets/f9e3a618-e49e-4791-915c-b4cb92c50a5a" />

 

3. Conversor de Mayúsculas (ArrayList)
Escribe un método estático que convierte una lista de palabras a mayúsculas usando Stream y map(), y luego recolecta los resultados en un nuevo ArrayList y lo regresa.
Metodo:
public static ArrayList<String> conversorAMayusculas(ArrayList<String> palabras){
        return palabras.stream().map(String::toUpperCase).distinct().collect(Collectors.toCollection(ArrayList::new));
    }

Prueba con:
 palabrasAMayusculas = utileriaCadenas.conversorAMayusculas(palabrasAMayusculas);
        System.out.println("Palabras en MAYUSCULA: "+palabrasAMayusculas);
        <img width="627" height="25" alt="image" src="https://github.com/user-attachments/assets/d9075621-2410-466b-80b1-b64ca4122188" />



4. Cuadrados Únicos (HashSet)
Escribe un método estático que dado un ArrayList<Integer> que contiene duplicados, crea un HashSet que contenga únicamente los cuadrados de los números pares únicos de la lista original.
Tip: Utiliza una combinación de filter(), map() y Collectors.toSet().
Metodo:
/*
    Metodo cuadradosUnicos que recibe un arraylist de numeros. Primero usamos el metodo de
    filter que filtra primero los numeros que son pares.
    Despues usamos el metodo map que multiplica el valor del numero del
    arraylist por si mismo y lo almacena en un HashSet para que los
    numeros que estaban repetidos en el arraylist no se vuelvan a repetir
     */

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){
        HashSet<Integer> resultado = numeros.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toCollection(HashSet::new));
        return resultado;
    }

   Prueba con:
   //Se pone a prueba el metodo cuadradosUnicos. Muestra correctamente el cuadrado de 6, 12, 18, 24.
        // Son de estos numeros porque escogimos el mismo arraylist de numeros que
        // usamos en utileriaNumeros.multiplicar.
        numerosCuadradosUnicos = utileriaNumeros.cuadradosUnicos(numeros);
        System.out.println("Cuadrados de los numeros que son pares y unicos: "+numerosCuadradosUnicos);

<img width="574" height="23" alt="image" src="https://github.com/user-attachments/assets/71763130-da87-44cb-ae80-82004f9d8652" />





5. Mapa de Longitudes (HashMap)
Escribe un método estático que dado un ArrayList<String> de palabras, utiliza Collectors.toMap() para crear un HashMap<String, Integer> donde la clave sea la palabra y el valor sea su longitud.
Metodo:
/*
    Se crea el metodo longitudes que recibe como parametro un ArrayList de tipo String,
    el cual contiene una lista de palabras. Este metodo utiliza stream y Collectors.toMap
    para crear un HashMap donde cada palabra sera una clave y su valor sera la cantidad de
    caracteres que contiene. Ademas, si existen palabras repetidas, se conserva una sola de ellas con su longitud
     */
    public static HashMap<String, Integer> longitudes(ArrayList<String> palabras){
        HashMap<String, Integer> resultado;
        resultado = palabras.stream().collect(Collectors.toMap(palabra -> palabra, palabra -> palabra.length(), (anterior, nuevo) -> anterior, HashMap::new));
        return resultado;
    }

   Prueba con:
   //Se prueba el metodo de lontigudes y vemos que funciona correctamente,
        // porque muestra la longitud de las palabras
        longitudPalabras = utileriaCadenas.longitudes(palabras);
        System.out.println("Longitudes de las palabras: "+longitudPalabras);

   <img width="793" height="28" alt="image" src="https://github.com/user-attachments/assets/cd823109-d234-4245-9ad1-4b31f8fd9e3a" />




7. Modificador de Inventario (HashMap)
Escribe un método estático que dado un HashMap<String, Double> que representa nombres de productos y sus precios. Usa el método forEach() para imprimir un catálogo donde cada precio tenga un descuento del 10% en la impresión.
Enfoque: Iterar sobre entradas de un Mapa usando lambdas de tipo Bi-Consumer.
Metodo:
/*
     Metodo modificadorDeInventario que recibe como parametro HashMap
     de nombres y numeros que representan como los productos. Primero
     pusimos un system.out.println donde se muestra el arraylist
     */
    public static void modificadorDeInventario(HashMap<String, Double> productos){
        productos.forEach((nombre, precio) -> { System.out.println(nombre + ":" + (precio * 0.90));});
    }

   Prueba con:
        productos.put("Computadora", 14000.0);
        productos.put("Teclado", 2500.0);
        productos.put("Mouse", 500.0);
   //Se puso a prueba el metodo de de modificadorDeInventario y funciona correctamente.
        // Imprime los precios de los productos que declaramos con un 10% de descuento
        utileriaCadenas.modificadorDeInventario(productos);
   <img width="176" height="67" alt="image" src="https://github.com/user-attachments/assets/f339d282-a35c-4af6-b33a-bb7cad1a0fb7" />

   
   



9. Contador de Frecuencias (HashMap)
Escribe un método estático que toma un ArrayList<String> de palabras (con repeticiones). Usa merge() o compute() con una lambda para construir un mapa de frecuencias que muestre cuántas veces aparece cada palabra.
Metodo:
/*
    Se hizo el metodo contadorDeFrecuencias que recibe como parametro
    un arrayList de palabras. Este metodo utiliza forEach para recorrer
    cada palabra del ArrayList y el metodo merge para ponerlas en un HashMap,
    donde cada palabra será una clave y su valor será la cantidad de
    veces que aparece en la lista. Si una palabra ya existe en el HashMap,
    se incrementa su contador. Por ultimo, el metodo devuelve el HashMap con
    las palabras y sus frecuencias de aparicion.
     */
    public static HashMap<String, Integer> contadorDeFrecuencias(ArrayList<String> palabras){
        HashMap<String, Integer> frecuencias = new HashMap<>();
        palabras.forEach(palabra -> frecuencias.merge(palabra, 1,(anterior, nuevo) -> anterior + nuevo));
        return frecuencias;
    }

   Prueba con:
   frecuencias = utileriaCadenas.contadorDeFrecuencias(palabras);
        System.out.println("Numero de veces que se repiten las palabras: "+frecuencias);
<img width="894" height="24" alt="image" src="https://github.com/user-attachments/assets/2142cc45-650d-47dc-9eb2-3f73e40aa2b2" />




11. Clasificador de Palabras (HashMap)
Escribe un método estático que dado un HashMap<String, Integer> de palabras y sus frecuencias, usa entrySet().stream() para filtrar a las palabras con frecuencia inferior a un valor dado y guarda solo las palabras que cumplen con el criterio en un ArrayList.
Metodo:
/*
    Se crea el metodo clasificadorDePalabras que recibe como parametros un HashMap
    de String e Integer, donde almacenan sus frecuencias,
    y un numero que nos servira como limite. El metodo usa entrySet.stream para
    recorrer las entradas del HashMap y filter para tomar aquellas palabras que su
    frecuencia sea menor al limite que se recibio. Despues se usa map para obtener
    unicamente las palabras seleccionadas y finalmente las almacena en un ArrayList que despues se devuelve.
     */
    public static ArrayList<String> clasificadorDePalabras(HashMap<String, Integer> frecuencias, int valorDeLimite){
        ArrayList<String> resultado;
        resultado = frecuencias.entrySet().stream().filter(n -> n.getValue() < valorDeLimite).map(n -> n.getKey()).collect(Collectors.toCollection(ArrayList::new));
        return resultado;
    }

    Prueba con:
    //Se puso a prueba el metodo de clasificadorDePalabras y funciona correctamente.
        // Imprime las palabras que se repiten menos de 2 veces.
        // Y se imprimen las palabras que solo se repite una vez
        clasificaciones = utileriaCadenas.clasificadorDePalabras(frecuencias, 2);
        System.out.println("Palabras que se repiten menos de 2 veces: "+clasificaciones);
    <img width="656" height="25" alt="image" src="https://github.com/user-attachments/assets/2f4242f0-1f9a-4476-bc46-f17f96bfef0b" />



13. Deduplicación de Palabras (HashSet)
Escribe un método estático que toma una frase larga, dividela en un array de palabras y usa un stream con lambdas para filtrar las palabras de menos de N letras, convertirlas a minúsculas y guardarlas en un HashSet para asegurar que no haya repetidas.
Metodo:
/*
    Se hizo el metodo deduplicacionDePalabras que recibe como parametros una
    palabra y un numero entero que servira como límite de caracteres. En el metodo
    se usa split para separar la frase en un arreglo de palabras y despues arrays.stream
    para recorrerlas. Luego se utiliza filter para eliminar las palabras que tengan
    menos de el numero de caracteres y map para convertir las palabras a minusculas.
    Utiliza collect para almacenar las palabras en un HashSet para que no existan palabras repetidas
     */
    public static HashSet<String> deduplicacionDePalabaras(String frase, int valorDeLimite){
        String[] palabras = frase.split("\\s+");
        HashSet<String> resultado;
        resultado = Arrays.stream(palabras).filter(n -> n.length() >= valorDeLimite).map(String::toLowerCase).collect(Collectors.toCollection(HashSet::new));
        return resultado;
    }

    Prueba con:
    //Se puso a prueba el metodo de deduplicador y funciona correctamente.
        // Se imprimio las palabras que no se repetian y que su longitud sea mayor que 5
        String frase = "Hola mundo este es una frase normal hola mundo frase";
        noSeRepite = utileriaCadenas.deduplicacionDePalabaras(frase, 5);
        System.out.println("Palabras que no se repiten y son mayores al limite de 5: "+noSeRepite);
<img width="650" height="23" alt="image" src="https://github.com/user-attachments/assets/c7ca06a7-bd01-4354-a63b-8e0acd2c6ac5" />



15. El Tope de Frecuencias (HashMap)
Escribe un método estático que dado un HashMap<String, Integer> de palabras y frecuencias, usa replaceAll() para limitar todas las frecuencias a un máximo de N. Si una frecuencia es mayor a N, debe fijarse exactamente en N mediante una lambda.
Metodo:
/*
    El metodo topeDeFrecuencias que recibe como parametro un HashMap
    String e Integer donde se almacenan sus frecuencias, y un número usaremos
    como limite. El metodo utiliza replaceAll con una lambda para recorrer las
    entradas del HashMap y modificar las frecuencias que sean mayores al valor de limite,
    reemplazandolas por el valor. Las frecuencias menores o iguales al limite se quedan sin cambios.
     */
    public static void elTopeDeFrecuencias(HashMap<String, Integer> frecuencia, int valorDeLimite){
        frecuencia.replaceAll((palabra, cantidad) -> cantidad > valorDeLimite ? valorDeLimite : cantidad);
    }

    Prueba con:
    //Se puso a prueba el metodo de elTopeDeFrecuencias y si funciona ya que se
        // imprimio las palabras con frecuencia de 1, que fue el limite que se puso
        utileriaCadenas.elTopeDeFrecuencias(frecuencias, 1);
        System.out.println("Frecuencia de palabras limitada a 1: " + frecuencias);
<img width="893" height="35" alt="image" src="https://github.com/user-attachments/assets/0e9368f4-4e3f-4f57-96da-884158dbd94d" />



