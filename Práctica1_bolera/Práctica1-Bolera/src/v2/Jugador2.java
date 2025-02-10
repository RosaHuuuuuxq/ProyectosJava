/**
 * 
 */
package v2;

import v1.PartidaBolos1;

/**
 * 
 */
public class Jugador2 {
	
	//creamos los atributos
	private String nombre;
	private int [] puntos;
	private String [] puntostext;
	
	//métodos
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * creamos los constructores de la clase Jugadaor1 para inicializar el nombre del jugador,
		 * los arrays del punto con el número de rondas y el array de los puntos textos
		 */
		//constructor
		public Jugador2(String nombre) {
			//inicializa el nombre del jugador
			this.nombre = nombre;
			//incializa el array del punto con el número de rondas
			this.puntos = new int [PartidaBolos1.NUMERO_DE_RONDAS];
			//inicializa el array de los puntos textos
			this.puntostext = new String [PartidaBolos1.NUMERO_DE_RONDAS];
		}

		/**
		 * en esta versión del programa incorporaremos dos tiradas por cada turno, donde el jugador tirará dos veces los bolos 
		 * y la suma de las dos tiradas será lo que se guarde en el array de resultados numéricos
		 * creamos un método public con jugarTurno en la que tenemos que introducir una posición arrays del punto 
	     * donde se genera un puntuaje de forma aleatorio despues se imprime
	     * primero se genera un puntuaje aleatorio con array entre 0 y 10, luego se asigna el puntuaje de puntos en 
	     * la posicion indicada 
	     * el juego consta de que si tiras la primera partida tiras 10 puntos no hay una segunda ronda y si no es mayor que diez 
	     * se suma los puntos de los dos partidos
	     * para los puntos textos utilizamos los condicionales "if" y "else", si en la primera ronda tiras 10 puntos no hay 
	     * hay una segunda partida y se para el programa y mostrar una "X", segundo caso, si en la primera ronda tiras un número menor que 10, 
	     * va a haber una segunda partida y se suman los puntos de los dos partidos y si la suma es igual a 10 mostrará "/" y si es menor mostrará "-"
		 */
		//creamos un método jugar partida
		public void jugarTurno (int posicion) {
			//número aleatorio
			int puntaje = (int) (Math.random()*11);
			puntos[posicion]=puntaje;
			//imprime
			System.out.println("Primer turno "+ posicion+" el jugador "+ nombre+ " ha tirado "+puntaje + " bolos");
			
			if (puntaje == 10) {
				puntos[posicion]=puntaje; 
				puntostext[posicion] = "X";
			}
			else if (puntaje < 10) {
				//número aleatorio
					int puntaje2 = (int) (Math.random()*(11-puntaje));
					puntos [posicion] = puntaje + puntaje2;
				
				 if ((puntaje + puntaje2) == 10) {
					puntostext[posicion] = "/";
				} else if ((puntaje + puntaje2) < 10) {
					puntostext[posicion] = "-";
				}
				//imprime
				System.out.println("Segundo turno "+ posicion+" el jugador "+ nombre+ " ha tirado "+puntaje2 + " bolos");
				}
		}
		
		/**
		 * en este programa la puntuación se calcula de esta manera -> primero se suman todos los valores numéricos, por cada pleno 
		 * el jugador tiene 10 puntos extras y por cada semipleno el jugador tiene 5 puntos extras
		 * creamos un método int (números) en la que calculamos las puntuaciones, primero iniciamos el variable puntosTotal
		 * luego utilizamos el método "for" es un bucle que nos permite ejecutarlo varias veces donde los puntos totales es igual 
		 * a puntos totales más un punto
		 * usamos el condicional "if", si los puntostextos es "X" se le suma 10 puntos y si es "/" se le suma 5 puntos
		 * y por último el programa devulve los puntos totales
		 */
		//creamos un método donde sumamos los puntos totales
			public int calcularPuntuacion() {
				int puntosTotal=0; 
				for (int i=0; i<puntos.length; i++) {
					puntosTotal=puntosTotal + puntos[i];
					if (puntostext[i] == "X") {
						puntosTotal = puntosTotal + 10;
					} else if (puntostext[i] == "/") {
						puntosTotal = puntosTotal + 5;
					}
			}
				return puntosTotal;
			
		}	
			
			
			/**
			 * creamos un método donde se muestra los puntos totales y los puntos textos con "for", 
			 * un bucle que nos permite ejecutarlo varias veces y po último se imprime
			 */
			//creamos un método donde se muestra los puntos totales 
			public void mostrarPuntuacion() {
				System.out.print ("puntos = [");
				//aquí imprimimos los puntos
				for (int i=0; i<puntos.length; i++) {
					System.out.print(" ");
					System.out.print(puntos[i]);
				}
				 System.out.println("]");
				 
				 System.out.print ("textos = [");
				    //aquí imprimimos los puntostextos
					for (int i=0; i<puntostext.length; i++) {
						
						System.out.print(" ");
						System.out.print(puntostext[i]);
					}
					 System.out.println("]"); 
			}
			
}
		
		
		
		
