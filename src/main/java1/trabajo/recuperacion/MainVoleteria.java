package trabajo.recuperacion;

import java.time.LocalDate;
import java.util.Scanner;

public class MainVoleteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean resultados = false;
		int i = 0;
		int opcionSalida;
		int opcion;
		LocalDate diaHoy = LocalDate.now();// Fecha actual
		Vuelos ListaVuelos[] = new Vuelos[10];
		Vuelos Vuelo1 = new Vuelos();
		Vuelos Vuelo2 = new Vuelos();
		Vuelos Vuelo3 = new Vuelos();
		Vuelos Vuelo4 = new Vuelos();
		Vuelos Vuelo5 = new Vuelos();
		Vuelos Vuelo6 = new Vuelos();
		Vuelos Vuelo7 = new Vuelos();
		Vuelos Vuelo8 = new Vuelos();
		Vuelos Vuelo9 = new Vuelos();
		Vuelos Vuelo10 = new Vuelos();

		ListaVuelos[0] = Vuelo1;
		ListaVuelos[1] = Vuelo2;
		ListaVuelos[2] = Vuelo3;
		ListaVuelos[3] = Vuelo4;
		ListaVuelos[4] = Vuelo5;
		ListaVuelos[5] = Vuelo6;
		ListaVuelos[6] = Vuelo7;
		ListaVuelos[7] = Vuelo8;
		ListaVuelos[8] = Vuelo9;
		ListaVuelos[9] = Vuelo10;
		do {

			Scanner lector = new Scanner(System.in);
			Scanner teclado = new Scanner(System.in);
			System.out.println(
					"***** Bienvenido a la Aerolina Cumbao *****\n" + "1.- Comprar Vuelo\n" + "2.- Consultar Vuelo");
			opcion = lector.nextInt();
			if (opcion == 1) {
				System.out
						.println("Que tipo de vuelo desea Comprar?\n" + "1.-Vuelo Comercial\n" + "2.-Vuelo Vacacional");
				int opcion2 = lector.nextInt();

				System.out.println("Cuantos vuelos desea ingresar?");
				int salida = lector.nextInt();
				for (i = 0; i < salida; i++) {
					Vuelos Vuelo = new Vuelos();

					System.out.println("Ingrese el Codigo de Vuelo ");
					String codigoVuelo = teclado.nextLine();
					System.out.println("Ingrese su Destino ");
					String destino = teclado.nextLine();
					System.out.println("Su Fecha de Viaje es: " + diaHoy);

					System.out.println("El precio del vuelo es");
					int precio = lector.nextInt();
					if (opcion2 == 1) {
						System.out.println("Ingrese el Codigo de su Trabajo");
						String codigoTrabajo = teclado.nextLine();
						Vuelo.setCodigoTrabajo(codigoTrabajo);
					} else if (opcion2 == 2) {
						System.out.println("Ingrese el Codigo de Descuento");
						String codigoDescuento = teclado.nextLine();
						Vuelo.setCodigoDescuento(codigoDescuento);
					}

					Vuelo.setCodigoVuelo(codigoVuelo);
					Vuelo.setDestino(destino);
					Vuelo.setPrecio(precio);
					ListaVuelos[i] = Vuelo;
				}

			}

			else if (opcion == 2) {

				System.out.println("Ingrese el codigo de Vuelo");
				String CodigoVuelo = teclado.nextLine();
				for (i = 0; i < ListaVuelos.length; i++) {
					Vuelos vuelosBuscar = ListaVuelos[i];
					resultados = CodigoVuelo.equals(vuelosBuscar.getCodigoVuelo());

					if (resultados == true) {
						System.out.println(vuelosBuscar);
						System.out.println("Fecha de viaje= " + diaHoy);
						if (vuelosBuscar.getCodigoTrabajo()!=null) {
							System.out.println("Codigo de Trabajo "+ vuelosBuscar.getCodigoTrabajo());	
						} else { 
								
							}
						if(vuelosBuscar.getCodigoDescuento()!=null ) {
							System.out.println("Codigo de Descuento "+ vuelosBuscar.getCodigoDescuento());
						}else {
							
						}
						}
					else {
						System.out.println("No existe el vuelo que busca");
					}

				}

			} else {
				System.out.println("No existe esa opcion");
			}

			System.out.println("Si desea Salir digite 0");

			opcionSalida = lector.nextInt();
		} while (opcionSalida != 0);

	}
}
