/**
 * 
 */
package v1;

/**
 * 
 */
public class Jugador1 {
	
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
	public Jugador1(String nombre) {
		//inicializa el nombre del jugador
		this.nombre = nombre;
		//inicializa el array del punto con el número de rondas
		this.puntos = new int [PartidaBolos1.NUMERO_DE_RONDAS];
		//inicializa el array de los puntos textos
		this.puntostext = new String [PartidaBolos1.NUMERO_DE_RONDAS];
	}

	/**
	 * creamos un método public con jugarTurno en la que tenemos que introducir una posición arrays del punto 
	 * donde se genera un puntuaje de forma aleatorio despues se imprime
	 * primero se genera un puntuaje aleatorio con array entre 0 y 10, luego se asigna el puntuaje de puntos en 
	 * la posicion indicada y por último se imprime
	 */
	public void jugarTurno (int posicion) {
		int puntaje= (int)(Math.random()*11);
		puntos[posicion]=puntaje;
		System.out.println("El turno "+posicion+" el jugador "+ nombre +" ha tirado "+puntos[posicion]+" bolos");
		
		//System.out.print(puntos[posicion]);
	}
	
	/**
	 * creamos un método public int (números) con calcularPuntuacion donde sumamos los puntos totales,
	 * primero iniciamos el valor puntosTotal, luego utilizamos el método "for" que degsina un blucle,
	 * dentro de eso creamos un contador, el contador debe de ser menor que los puntos y 
	 * el contador va sumando uno por uno.
	 * los puntos totales es igual a puntos totales más un punto
	 * y por último devulve los puntos totales
	 */
	//creamos un método donde sumamos los puntos totales
	public int calcularPuntuacion() {
		int puntosTotal=0; 
		for (int i=0; i<puntos.length; i++) {
			puntosTotal=puntosTotal + puntos[i];
		}
		return puntosTotal;
		
	}
	
	/**
	 * creamos un método donde se muestra los puntos totales, primero creamos un bucle con "for"
	 * donde se imprime los puntos del partido  y luego creamos otro bucle con "for" que 
	 * imprime los puntos textos, dentro de eso necesitamos un condicional "if" donde si los puntos
	 * es igual a 10 se imprime una "X" y si los puntos es menor que 10 se imprime "-" 
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
				
				if (puntos[i] == 10) {
					puntostext[i] = ("X");
				} else if (puntos[i] < 10) {
					puntostext[i] = ("-");
				}
			
				System.out.print(" ");
				System.out.print(puntostext[i]);
			}
			 System.out.println("]"); 
	}
	

}
