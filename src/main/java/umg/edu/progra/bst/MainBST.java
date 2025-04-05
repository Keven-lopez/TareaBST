package umg.edu.progra.bst;
import java.util.Scanner;

public class MainBST {
	Empleado e1 = new Empleado (10, "Juan", null, null);
	Empleado e2 = new Empleado (20, "Maria", null, null);
	Empleado e3 = new Empleado (5, "Pedro", null, null);
	Empleado e4 = new Empleado (8, "Ana", null, null);
	Empleado e5 = new Empleado (15, "Carlos", null, null);
	Empleado e6 = new Empleado (25, "Sofia", null, null);
	
	
	public static void main(String[] args) {
		MainBST main = new MainBST();
    	main.buscarEmpleados();
    	main.contarNodos();
    	main.calcularAltura();
    	main.recorridosArbol();
	}
	
	public BST insertarEmpleados() {
		BST bst = new BST();
		bst.insertar(e1);
		bst.insertar(e2);
		bst.insertar(e3);
		bst.insertar(e4);
		bst.insertar(e5);
		bst.insertar(e6);
		return bst;
	}
	
	public void buscarEmpleados() {
		BST bst = insertarEmpleados();
		localizar(bst,8);
		localizar(bst,15);
		localizar(bst,30);	
	}
	
	public void recorridosArbol() {
		Scanner scanner = new Scanner(System.in);
		BST bst = insertarEmpleados();
		Empleado emp = new Empleado (0,null,null,null);
		
		int choice = 0;
		do{
			System.out.println("Menu:\n1.Preorden\n2.Inorden\n3.PostOrden\n4.Buscar Menor ID\n5.Buscar Mayor \n6.Eliminiar Empleado\n7.Salir");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				bst.preOrden();
				break;
			case 2:
				bst.inOrden();
				break;
			case 3:
				bst.postOrden();
				break;
			case 4:
				emp = bst.obtenerMinimo();
				System.out.println(emp);
				break;	
			case 5:
				emp = bst.obtenerMaximo();
				System.out.println(emp);
				break;
			case 6:
				System.out.println("Ingresar ID para eliminar");
				int id = scanner.nextInt();
				bst.eliminar(id);
				break;
			}
		} while (choice !=7);
	}
	
	public void contarNodos() {
		BST bst = insertarEmpleados();
		int numero = bst.contarNodos();
		System.out.println("Nodos: " + numero);
	}
	
	public void calcularAltura() {
		BST bst = insertarEmpleados();
		int numero = bst.altura();
		System.out.println("Altura: " + numero);
	}
	
	
	private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
        	System.out.println("Obtener" + id + ":" + bst.obtener(id));
        } else {
        	System.out.println("No encuentro el empleado: " + id);
        }
    }
	
	
}
