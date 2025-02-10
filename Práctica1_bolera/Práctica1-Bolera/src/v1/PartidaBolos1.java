/**
 * 
 */
package v1;

import java.util.Scanner;

/**
 * 
 */
public class PartidaBolos1 {
	public static final int NUMERO_DE_RONDAS = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//primero creamos un scanner para la entrada
		Scanner sc = new Scanner(System.in);
		//es una variable para que se repita el juego con do While
		boolean resultado = false;
		//abrimos bucle que se repite si el jugador quiere jugar otra vez
		do {
		//solicitamos el nombre del primer jugador
		System.out.println("¡Bienvenidos a la bolera! ¿Cómo te llamas?");
		String nombre1=sc.nextLine();
		//solicitamos el nombre del segundo jugador 
		System.out.println("¡Perfecto! ¿Y la persona que te acompaña?");
		String nombre2=sc.nextLine();
		//empieza el juego
		System.out.println("¡Empieza el juego!");
		System.out.println(" ");
		
		//creamos dos jugadores 
		Jugador1 jugador1 = new Jugador1 (nombre1);
		Jugador1 jugador2 = new Jugador1 (nombre2);

		//un bucle para el número de rondas
		for (int i = 0; i < NUMERO_DE_RONDAS; i++) {
			//cada jugador juega su turno 
			jugador1.jugarTurno(i);
			jugador2.jugarTurno(i);
			sc.nextLine();	
		}
		
		//aquí se muestra la puntuacion de los dos jugadores con mostrar puntuacion
		jugador1.mostrarPuntuacion();
		//imprime
		System.out.println(jugador1.getNombre() + " ha obtenido una puntuación de "+ jugador1.calcularPuntuacion());
		System.out.println(" ");
		jugador2.mostrarPuntuacion();
		//imprime
		System.out.println(jugador2.getNombre() + " ha obtenido una puntuación de "+ jugador2.calcularPuntuacion());
		System.out.println(" ");
		
		//fin del curso, se ternima la partida
		System.out.println("Fin del turno");
		System.out.println(" ");
				
		
		//creamos los variables para calcular las puntuaciones
		int puntaje1 = jugador1.calcularPuntuacion();
		int puntaje2 = jugador2.calcularPuntuacion();
		
		//comparamos las puntuaciones para determinar el ganador con if else
		if (puntaje1 > puntaje2) {
			//imprime
			System.out.println("Nuevo record!!! "+jugador1.getNombre() + " ha ganado con " + puntaje1 +" puntos ");
		} else if (puntaje1 < puntaje2) {
			//imprime
			System.out.println("Nuevo record!!! "+jugador2.getNombre() + " ha ganado con " + puntaje2 + " puntos ");
		} else {
			//imprime
			System.out.println("Empate!!!" + puntaje1 +  " puntos ");
		}
		System.out.println(" ");
		
		//le preguntamos a los jugadores si quieren jugar otra vez
		System.out.println("¿Quieres jugar otra vez? s/n");
		String respuesta = sc.nextLine();
		//cuando comparo letras o string pongo equals
		//sigue jugando
		if (respuesta.equals("s")) {
			resultado= false;
		//termina la jugada
		} else if (respuesta.equals("n")){
			resultado=true;
			System.out.println("!Graciasss por jugar¡");
			}
		
		//cerramos el while, si quieres seguir jugando sigue el bucle
		} while (resultado== false);
		
		
		
		
		
	}

}
