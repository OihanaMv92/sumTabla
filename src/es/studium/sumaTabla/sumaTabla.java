package es.studium.sumaTabla;

import java.util.Scanner;

public class sumaTabla
{

	public static void main(String[] args)
	{
		//Creamos TRES tablas de tipo entero y valor 3x3
				int[][]tabla1 = new int[3][3]; 
				int[][]tabla2 = new int[3][3]; 
				int[][]tabla3 = new int[3][3];

				//Usamos la herramienta para el teclado
				 Scanner teclado = new Scanner(System.in);

				//Recorremos toda la tabla 1 para rellenar los valores
				//Como es bidimensional, tenemos dor for uno dentro de otro
				//Para los dos iteradores o contadores:(i, j)
				for (int i = 0; i <= 2; i++)
				{ 
					for (int j = 0; j <= 2; j++)
					{
						//Solicitamos al usuario los datos para rellenar la tabla 
						//y los leemos por teclado
						System.out.println("Escriba el número para la posición (" + i + "),(" + j + ") de la Tabla PRIMERA: ");
						tabla1[i][j] = teclado.nextInt();
					} 
				} 

				//Para hacer un salto de línea y no se nos quede pegado a la anterior
				System.out.println(""); 
				System.out.println("----------------------------------------------------------------------\n");

				//Recorremos toda la tabla 2 para rellenar los valores
				//Como es bidimensional, tenemos dor for uno dentro de otro
				//Para los dos iteradores o contadores:(i, j)
				for (int i = 0; i <= 2; i++)
				{ 
					for (int j = 0; j <= 2; j++)
					{
						//Solicitamos al usuario los datos para rellenar la tabla 
						//y los leemos por teclado
						System.out.println("Escriba el número para la posición (" + i + "),(" + j + ") de la Tabla SEGUNDA: ");
						tabla2[i][j] = teclado.nextInt();
					} 
				} 

				//Para hacer algo más vistosa la presentación por pantalla
				//Para hacer un salto de línea y no se nos quede pegado a la anterior
				System.out.println(""); 
				System.out.println("----------------------------------------------------------------------\n");
				System.out.println("Después de ingresar los datos, la Tabla 1 queda del siguiente modo: \n"); 

				//Para mostrar por pantalla la tabla 1 generada por el usuario
				for (int i = 0; i <= 2; i++)
				{ 
					for (int j = 0 ; j <= 2; j++)
					{ 
						//Mostramos la tabla generada usando el tabulador (\t) 
						//y dejando un espacio entre datos
						System.out.print("\t" + " " + tabla1[i][j]); 

					} 
					//Para que no nos aparezca por pantalla una sola fila
					System.out.println(""); 
				} 

				//Para hacer algo más vistosa la presentación por pantalla
				//Para hacer un salto de línea y no se nos quede pegado a la anterior
				System.out.println(""); 
				System.out.println("----------------------------------------------------------------------\n");
				System.out.println("Después de ingresar los datos, la Tabla 2 queda del siguiente modo: \n"); 

				//Para mostrar por pantalla la tabla 2 generada por el usuario
				for (int i = 0; i <=2; i++)
				{ 
					for (int j=0;j<=2; j++)
					{ 
						//Mostramos la tabla generada usando el tabulador (\t) 
						//y dejando un espacio entre datos
						System.out.print("\t" + " " + tabla2[i][j]); 

					} 
					//Para que no nos aparezca por pantalla una sola fila
					System.out.println(""); 
				} 

				//Para hacer algo más vistosa la presentación por pantalla
				//Para hacer un salto de línea y no se nos quede pegado a la anterior
				System.out.println(""); 
				System.out.println("----------------------------------------------------------------------\n");

				//Para realizar la suma
				for (int i = 0; i <= 2; i++) 
				{ 
					for (int j = 0; j <=2 ; j++) 
					{ 
						//realizamos la suma de las dos tablas y "la metemos" en la tercera
						tabla3[i][j] = (tabla1[i][j] + tabla2[i][j]); 
					} 
				} 

				//Para hacer algo más vistosa la presentación por pantalla
				System.out.println("La Tabla que se FORMA por la SUMA de las aneriores generadas es: \n"); 

				//Para mostrar por pantalla la tabla después de realizar la suma
				for (int i = 0; i <= 2; i++)
				{ 
					for (int j = 0; j <= 2; j++)
					{ 
						//Usamos la secuencia de escape (\t), tabulador 
						//para separarlo un poco del margen izquierdo
						System.out.print("\t" + " " + tabla3[i][j]);
					} 
					//Para que no se nos muestre en una sóla línea
					System.out.println("");
				}
				
				//Cerramos el teclado
				teclado.close();
			}
		}