package principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import almacen1.Cliente;
import almacen1.Producto;
import almacen1.Factura;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		ArrayList<Cliente> listaClientes = new ArrayList<>();		
		ArrayList<Producto> listaProductos = new ArrayList<>();
		ArrayList<Factura> listaFactura = new ArrayList<>();
		
		boolean salir = false;
		while (!salir) {
			System.out.println("==========================");
			System.out.println("|        ALMACEN         |");
			System.out.println("==========================");
			System.out.println("==========================");
			System.out.println("1. Crear Cliente");
			System.out.println("2. Crear Producto");
			System.out.println("3. Seleccion de Cliente y Producto");
			System.out.println("4. Crear Factura");	
			System.out.println("5. Generar Factura");	
			System.out.println("6. eliminar Producto");
			System.out.println("7. Modificar Producto");			
			System.out.println("0. Salir");
			System.out.println("==========================");
			
			int option = Integer.parseInt(dato.nextLine());
			
			switch(option) {
			case 1:
				Cliente obj = new Cliente();
//				Producto obj1 = new Producto();
//			    Factura obj2 = new Factura();
				System.out.println("==========================");
				System.out.println("|      CREAR CLIENTE     | ");
				System.out.println("==========================");
				System.out.println("==========================");
				System.out.println("Ingrese numero de Cedula:");
				obj.setCedula(dato.nextLine());
				System.out.println("Ingrese direccion:");
				obj.setDireccion(dato.nextLine());
				System.out.println("==========================");
/*				System.out.println("Ingrese nombre de producto:");
				obj1.setNombre_producto(dato.nextLine());
				System.out.println("==========================");
				System.out.println("Ingrese valor del producto:");
				obj1.setValor(dato.nextLine());
				obj2.setFactura(Math.random()*10);
				System.out.println("==========================");
				System.out.println("Ingrese valor domicilio:");
				obj2.setValordomicilio(dato.nextLine());
				System.out.println("==========================");
				System.out.println("Ingrese tiempo de entrega:");
				obj2.setTiempo_de_entrega(dato.nextLine());
				System.out.println("==========================");
*/				listaClientes.add(obj);
//				listaProductos.add(obj1);		
//				listaFactura.add(obj2);
				System.out.println("==========================");
				System.out.println("|     CLIENTE CREADO     |");
				System.out.println("==========================");
				System.out.println("==========================");
				System.out.println("Cliente creado: ");
				System.out.println("Cedula: " +  obj.getCedula());
				System.out.println("Direccion: " +  obj.getDireccion());
/*				System.out.println("Producto: " +  obj1.getNombre_producto());
				System.out.println("Valor Producto: " +  obj1.getValor());
				System.out.println("Numero Factura: " +  obj2.getFactura());
				System.out.println("Valor Domicilio: " +  obj2.getValordomicilio());
				System.out.println("Tiempo de entrega: " +  obj2.getTiempo_de_entrega());
*/				System.out.println("==========================");
				break;
				
			case 2:
				Producto obj1 = new Producto();
				System.out.println("==========================");
				System.out.println("|     CREAR PRODUCTO     |");
				System.out.println("==========================");
				System.out.println("==========================");
				System.out.println("Ingrese nombre de producto:");
				obj1.setNombre_producto(dato.nextLine());
				System.out.println("==========================");
				System.out.println("Ingrese valor del producto:");
				obj1.setValor(dato.nextLine());		
				System.out.println("==========================");
				listaProductos.add(obj1);		
				System.out.println("==========================");
				System.out.println("|    PRODUCTO CREADO     |");
				System.out.println("==========================");
				System.out.println("==========================");
				System.out.println("Producto creado: ");
				System.out.println("Producto: " +  obj1.getNombre_producto());
				System.out.println("Valor Producto: " +  obj1.getValor());
/*				System.out.println("Numero Factura: " +  obj2.getFactura());
				System.out.println("Valor Domicilio: " +  obj2.getValordomicilio());
				System.out.println("Tiempo de entrega: " +  obj2.getTiempo_de_entrega());
*/				System.out.println("==========================");
				
				break;
				
			case 3:
				System.out.println("Seleccione Cedula de Cliente");
				String seleccion = dato.nextLine();
				for(int i=0; i < listaClientes.size(); i++) {
					Cliente cliente = listaClientes.get(i);					
					if(seleccion.equals(cliente.getCedula())) {
						System.out.println("==========================");
						System.out.println("|    DATOS DEL CLIENTE   |");
						System.out.println("==========================");
						System.out.println("==========================");
						System.out.println("Cedula: " + cliente.getCedula());
						System.out.println("Direccion: " + cliente.getDireccion());
						System.out.println("==========================");
						
					}
				
					

					}
				System.out.println("Seleccione Producto");
				String seleccionar = dato.nextLine();
				for(int i=0; i < listaProductos.size(); i++) {
					Producto producto = listaProductos.get(i);					
					if(seleccionar.equals(producto.getNombre_producto())) {
						System.out.println("==========================");
						System.out.println("|   DATOS DEL PRODUCTO   |");
						System.out.println("==========================");
						System.out.println("==========================");
						System.out.println("Nombre del Producto: " + producto.getNombre_producto());
						System.out.println("Valor del Producto: " + producto.getValor());
						System.out.println("==========================");
						
					}
				}

				break;
			
			case 4:
				Factura obj2 = new Factura();
				Random rnd = new Random();
				obj2.setFactura(Math.random()*10);
				System.out.println("==========================");
				System.out.println("Ingrese valor domicilio:");
				obj2.setValordomicilio(dato.nextLine());
				System.out.println("==========================");
				obj2.setTiempo_de_entrega(rnd.nextInt(9));
				listaFactura.add(obj2);
				System.out.println("Numero Factura: " +  obj2.getFactura());
				System.out.println("Valor Domicilio: " +  obj2.getValordomicilio());
				System.out.println("Tiempo de entrega: " +  obj2.getTiempo_de_entrega() + " horas");
//				for (int i=0; i < listaProductos.size(); i++) {
//					Producto producto = listaProductos.get(i);
					
//				}
				
				

				break;
				
				
			case 5:
				System.out.println("Ingrese nombre del Producto");
				String seleccionar1 = dato.nextLine();
				for(int i=0; i < listaProductos.size(); i++) {
//					System.out.println("Cliente: "+(i + 1));
					Producto producto = listaProductos.get(i);
					Factura factura = listaFactura.get(i);
					if(seleccionar1.equals(producto.getNombre_producto())) {
						System.out.println("==========================");
						System.out.println("|    FACTURA GENERADA    |");
						System.out.println("==========================");
						System.out.println("==========================");
						System.out.println("Numero de Factura: " + factura.getFactura());
						System.out.println("Nombre del Producto: " + producto.getNombre_producto());
						System.out.println("Valor del Producto: " + producto.getValor());					
						System.out.println("Valor con iva: " + factura.getIva());
						System.out.println("Tiempo estimado de entrega: " + factura.getTiempo_de_entrega() + " horas");
						System.out.println("Valor del domicilio: " + factura.getValordomicilio());
						System.out.println("==========================");
						
					}

				}
				
				break;
				
			case 6:
				System.out.println("Ingrese producto a eliminar");
				String product = dato.nextLine();
				for(int i=0; i < listaProductos.size(); i++) {
				Producto producto = listaProductos.get(i);
				if(product.equals(producto.getNombre_producto())) {
					listaClientes.remove(i);
					System.out.println("==========================");
					System.out.println("|   PRODUCTO ELIMINADO   |");
					System.out.println("==========================");
				}
				}
				break;
			
			case 7:
				System.out.println("Ingrese producto a modificar");
				product = dato.nextLine();
				for(int i=0; i < listaProductos.size(); i++) {
					Producto producto = listaProductos.get(i);
					if(product.equals(producto.getNombre_producto())) {
						System.out.println("Nombre del producto : " + producto.getNombre_producto());
						System.out.println("Valor del producto :" + producto.getValor());
						System.out.println("==========================");
						System.out.println("|  INGRESE NUEVOS DATOS  |");
						System.out.println("==========================");
						System.out.println("==========================");
						System.out.println("Ingrese nueva Cedula:");
						String nompr = dato.nextLine();
						System.out.println("Ingrese nueva Direccion:");
						String valpr = dato.nextLine();
						System.out.println("==========================");
						producto.setNombre_producto(nompr);
						producto.setValor(valpr);
					}
				}
				break;
				
			case 0:
				salir = true;
				System.out.println("Saliendo del programa");
				break;
				default:
				System.out.println("Opcion invalida!");
				
		}
	}

	}


}
