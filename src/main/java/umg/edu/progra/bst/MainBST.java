package umg.edu.progra.bst;
import java.util.Scanner;

public class MainBST {
	Empleado e1 = new Empleado (10, "Juan", null, null);
	Empleado e2 = new Empleado (20, "Maria", null, null);
	Empleado e3 = new Empleado (5, "Pedro", null, null);
	Empleado e4 = new Empleado (8, "Ana", null, null);
	Empleado e5 = new Empleado (15, "Carlos", null, null);
	Empleado e6 = new Empleado (25, "Sofia", null, null);
	
	
	public void insertarEmpleados() {
		BST bst = new BST();
		bst.insertar(e1);
		bst.insertar(e2);
		bst.insertar(e3);
		bst.insertar(e4);
		bst.insertar(e5);
		bst.insertar(e6);
		localizar(bst,8);
		localizar(bst,15);
		localizar(bst,30);	
	}
	
	public void recorridosArbol() {
		Scanner scanner = new Scanner(System.in);
		BST bst = new BST();
		bst.insertar(e1);
		bst.insertar(e2);
		bst.insertar(e3);
		bst.insertar(e4);
		bst.insertar(e5);
		bst.insertar(e6);
		
		System.out.println("Menu:\n1.Preorden\n2.Inorden\n3.PostOrden\n4.Salir");
		int choice = 0;
		do{
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
				break;		
			}
		} while (choice !=4);
	}

	
	private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
        	System.out.println("Obtener" + id + ":" + bst.obtener(id));
        } else {
        	System.out.println("No encuentro el empleado: " + id);
        }
    }
	
	
}
