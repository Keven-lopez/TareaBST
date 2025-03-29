package umg.edu.progra.bst;
import umg.edu.progra.bst.MainBST;

/**
 *
 * @author Walter Cordova
 */
public class Ejemplo {

    public static void main(String[] args) {
		/*
		 * Empleado e1 = new Empleado(43, "Walter Cordova", "IT", "A-255"); Empleado e2
		 * = new Empleado(10, "Roxana Escobar", "RRHH", "A-255"); Empleado e3 = new
		 * Empleado(8, "Bryan Orellana", "Ventas", "A-255"); Empleado e4 = new
		 * Empleado(53, "Mario Ruano", "Logistica", "A-255"); Empleado e5 = new
		 * Empleado(15, "Salazar Bitsco", "IT", "A-255"); Empleado e6 = new Empleado(50,
		 * "Jonny Bravo", "RRHH", "A-255"); Empleado e7 = new Empleado(54,
		 * "Sergio Espinoza", "Marketing", "A-255"); Empleado e8 = new Empleado(25,
		 * "Belter Hernandez", "Contabilidad", "A-255");
		 * 
		 * BST bst = new BST(); System.out.println("Esta vacio: " + bst.esVacio() +
		 * " y es hoja " + bst.esHoja()); System.out.println("Esta vacio: " +
		 * bst.esVacio() + " y es hoja " + bst.esHoja()); bst.insertar(e1);
		 * System.out.println("Esta vacio: " + bst.esVacio() + " y es hoja " +
		 * bst.esHoja()); bst.insertar(e2); System.out.println("Esta vacio: " +
		 * bst.esVacio() + " y es hoja " + bst.esHoja()); bst.insertar(e3);
		 * System.out.println("Esta vacio: " + bst.esVacio() + " y es hoja " +
		 * bst.esHoja()); bst.insertar(e8); System.out.println("Esta vacio: " +
		 * bst.esVacio() + " y es hoja " + bst.esHoja());
		 * 
		 * localizar(bst,20); localizar(bst,45); localizar(bst,25); localizar(bst,19);
		 * 
		 * //Arrays.asList(e1, e2, e3, e4, e5, e6, e7).forEach(bst::insertar);
		 * bst.insertar(e2); bst.insertar(e3); bst.insertar(e4); bst.insertar(e5);
		 * bst.insertar(e6); bst.insertar(e7); bst.insertar(e8);
		 * 
		 * bst.inOrden();
		 * 
		 * //BST bst = new BST(); System.out.println("Esta vacio: " + bst.esVacio() +
		 * " y es hoja " + bst.esHoja()); bst.insertar(e1);
		 * System.out.println("Esta vacio: " + bst.esVacio() + " y es hoja " +
		 * bst.esHoja());
		 */
    	MainBST main = new MainBST();
    	main.insertarEmpleados();
    	main.recorridosArbol();
    	
    }

    private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
        	System.out.println("Obtener" + id + ":" + bst.obtener(id));
        } else {
        	System.out.println("No encuentro el empleado: " + id);
        }
    }
    
    /**
     * Ejercicios
     * Ejercicio 1: Insertar y Buscar Elementos
     * Implementa una clase MainBST que cree un BST e inserte los siguientes empleados con sus respectivos IDs:
		Empleado(10, "Juan")		
		Empleado(20, "Maria")		
		Empleado(5, "Pedro")		
		Empleado(8, "Ana")		
		Empleado(15, "Carlos")		
		Empleado(25, "Sofia")		
		Busca los empleados con los IDs 8, 15 y 30. Imprime si existen o no.
     */
    
    /**
     * Ejercicio 2: Recorridos del Árbol
		Crea un BST con los mismos empleados del ejercicio anterior.
		Implementa un menú para que el usuario pueda elegir entre:
		Mostrar el recorrido PreOrden.
		Mostrar el recorrido InOrden.
		Mostrar el recorrido PostOrden.
		Explica qué patrón sigue cada recorrido y para qué casos es útil.
     */
    
    /**
     * Ejercicio 3: Encontrar el Mínimo y Máximo
		Agrega empleados con diferentes IDs a un BST.
		Implementa una opción en el menú para que el usuario pueda ver el empleado con el menor ID y el empleado con el mayor ID.
		xplica cómo se usa la estructura del árbol para encontrar estos valores.
     */
    
    /**
     * Ejercicio 4: Contar Nodos y Calcular la Altura
		Implementa un método en MainBST que cuente cuántos empleados hay en el árbol.
		Implementa otro método que calcule la altura del árbol.
		Prueba estos métodos con diferentes conjuntos de datos.
     */
    
    /**
     * Ejercicio 5: Eliminación de un Nodo
		Implementa una opción en el menú para eliminar un empleado por su ID.
		Prueba eliminando:
		Un nodo hoja (sin hijos).
		Un nodo con un solo hijo.
		Un nodo con dos hijos.
		Explica qué ocurre en cada caso y cómo el árbol se reorganiza.
     */

}
