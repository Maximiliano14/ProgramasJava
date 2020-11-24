package tpAhorcado;

import java.util.Random;
import java.util.Scanner;

public class funciones {

	public void  ahorcado(){
		
		boolean juegoT = false; // iniciamos en false xq vamos a inciar con el juego y aun no se termino
		Scanner lector = new Scanner(System.in); //Pedimos una letra y leemos lo introducido
		int intento = 6; // el contador de intentos se disminuira por cada letra errada 
		String palabraSecreta = getpalabraSecreta();
		char[] palabraGuion = getGuion(palabraSecreta);
		int cont=0;
		
		
		do 
		{
			dibujar(intento);
			System.out.println("te quedan "+ intento + " intentos");//muestra la cantidad de intentos restantes
			System.out.println(palabraGuion);
			System.out.println("Ingrese una letra ");
			char letra = lector.next().charAt(0);//solo se va a leer la primera letra introducida, hay posibilidades que se ingrese más de una letra pero en este caso solo vamos a leer la primera
			boolean algunaLetraAcertada=false;
			for(int i= 0;i<palabraSecreta.length();i++) // se va a validar si la letra ingresa coincide con alguna de las letras del ahorcado
			{ 
				if(palabraSecreta.charAt(i) == letra) 
				{
					palabraGuion[i]= letra;
					algunaLetraAcertada= true;
					if(algunaLetraAcertada) // si acerto alguna letra nos muestra su cantidad por pantalla
					{
						cont++;
						System.out.println("Acertaste :"+cont+" letras");
						
					}
					
				}
			}
			
			if(!algunaLetraAcertada)
			{
				System.out.println("no se ha acertado ninguna letra");//mensaje de error si falla//
				intento--;
				if(intento==0)
				{
					 System.out.println("se han agotado los intentos");//se indica el fin de sus intento//
					 System.out.println("Perdiste");
			         
					
				}
			}
		
				
			boolean juegoGanado= !hayGuiones(palabraGuion); //comprueba si quedan guiones en la palabra para saber si gano
			if(juegoGanado)
			{
				System.out.println("has ganado el juego");
			    juegoT=true;//indica el fin del juego//
			}
			 
		
		}while(!juegoT); // el ciclo finaliza cuando la variable de tipo boolean sea verdadera
		
		lector.close(); 
	}
	
	static boolean hayGuiones(char[] array) { //esto recibe un array de char para descubir si quedan guiones
	for(char l:array) { //l de letra//
		if(l=='_')return true;
	}
	 return false;
	}
	static String getpalabraSecreta() { // selecciona una palabra aleatoria del vector de palabras
		
		String[] palabras= {"perro" ,"casa", "hogar" ,"gato" , "auto"};
		Random r = new Random();
		int n = r.nextInt(palabras.length);
		
		return palabras[n];
		
	}
	
	static char[] getGuion(String palabra) { //transforma letra por letra dependiendo el tamaño de la palabra, en guiones
		
		int letrasPalabra = palabra.length();
		
		char [] guion = new char[letrasPalabra];
		
		for(int i=0; i<guion.length;i++)
		{
			guion[i]= '_';
			
		}
		return guion;
		
	}
		
	 public static void dibujar(int i) { //mediante la recepcion de la cantidad de vidas, evalua segun el caso para mostrar el estado de la ilustracion
	        switch (i) {
	            case 6:
	                System.out.println(" ---------------------");
	                for (int j = 0; j <15; j++) {
	                    System.out.println(" |");
	 
	                }
	                System.out.println("__________");
	                break;
	 
	            case 5:
	                System.out.println(" ---------------------");
	                System.out.println(" |                     |");
	                System.out.println(" |                     |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                 | -  -  |");
	                System.out.println(" |                 |   o   |");
	                System.out.println(" |                  -------");
	                for (int j = 0; j <10; j++) {
	                    System.out.println(" |");
	 
	                }
	                System.out.println("__________");
	                break;
	 
	            case 4:
	                System.out.println(" ---------------------");
	                System.out.println(" |                     |");
	                System.out.println(" |                     |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                 | -  -  |");
	                System.out.println(" |                 |   o   |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                     |   ");
	                for (int j = 0; j < 5; j++) {
	                    System.out.println(" |");
	 
	                }
	                System.out.println("__________");
	                break;
	 
	            case 3:
	                System.out.println(" ---------------------");
	                System.out.println(" |                     |");
	                System.out.println(" |                     |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                 | -  -  |");
	                System.out.println(" |                 |   o   |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                   / |   ");
	                System.out.println(" |                 /   |   ");
	                System.out.println(" |                /    |   ");
	                System.out.println(" |                     |   ");
	                for (int j = 0; j < 5; j++) {
	                    System.out.println(" |");
	 
	                }
	                System.out.println("__________");
	                break;
	 
	            case 2:
	                System.out.println(" ---------------------");
	                System.out.println(" |                     |");
	                System.out.println(" |                     |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                 | -  -  |");
	                System.out.println(" |                 |   o   |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                   / | \\ ");
	                System.out.println(" |                  /  |   \\ ");
	                System.out.println(" |                 /   |     \\ ");
	                System.out.println(" |                     |   ");
	                for (int j = 0; j < 5; j++) {
	                    System.out.println(" |");
	 
	                }
	                System.out.println("__________");
	                break;
	 
	            case 1:
	                System.out.println(" ---------------------");
	                System.out.println(" |                     |");
	                System.out.println(" |                     |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                 | -  -  |");
	                System.out.println(" |                 |   o   |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                   / | \\ ");
	                System.out.println(" |                  /  |   \\ ");
	                System.out.println(" |                 /   |     \\ ");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                    /  ");
	                System.out.println(" |                   /      ");
	                System.out.println(" |                  /       ");
	                for (int j = 0; j < 2; j++) {
	                    System.out.println(" |");
	 
	                }
	                System.out.println("__________");
	                break;
	 
	            case 0:
	               System.out.println(" ---------------------");
	                System.out.println(" |                     |");
	                System.out.println(" |                     |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                 | X  X  |");
	                System.out.println(" |                 |   o   |");
	                System.out.println(" |                  -------");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                   / | \\ ");
	                System.out.println(" |                  /  |   \\ ");
	                System.out.println(" |                 /   |     \\ ");
	                System.out.println(" |                     |   ");
	                System.out.println(" |                    / \\");
	                System.out.println(" |                   /   \\  ");
	                System.out.println(" |                  /     \\ ");
	                for (int j = 0; j < 2; j++) {
	                    System.out.println(" |");
	 
	                }
	                System.out.println("__________");
	                System.out.println("GAME OVER");
	                break;
	        }
	    }
	
		
		
	
}
