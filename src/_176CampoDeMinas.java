

import java.util.Scanner;

public class _176CampoDeMinas {
public static void main(String[] args) {
	Scanner tec = new Scanner (System.in);
	
	// tablero fabricado la primera fila y columna son los limites
	//no se tienen en cuenta, al calcular.
	String [][] tablero ={
			{"-","-","-","-","-","-","-"},
			{"|","*","*","-","*","*","|"},
			{"|","*","*","*","*","*","|"},
			{"|","*","-","-","*","*","|"},
			{"|","*","*","-","*","*","|"},
			{"|","-","*","*","*","*","|"},
			{"-","-","-","-","-","-","-"}
	};
	

	
	int fila , columna, cont = 0, contt = 0 ;
	
	do{
		columna = tec.nextInt()+1;
		fila = tec.nextInt()+1;
	
		//recorremos las posiones de tablero con la catidad de filas
		//y columnas que queramos, empezamos desde 1 tanto la fila 
		//como la columna.
		for (int i = 1; i < fila ; i++) {
			
			for (int j = 1; j < columna; j++) {
				System.out.print(tablero[i][j]);
			cont = 0;
				for (int x = i -1; x <= i +1; x++) {
					for (int y = j -1 ; y <= j +1 ; y++) {
						if( tablero [x][y].equals("*")  ){
							cont ++;
						}
					}
				}	
			}	
			
			if (cont >= 6){
				contt ++;}
			System.out.println();
		}
		
		System.out.println(contt);
	
	}while(fila != 0 && columna !=0 );
	
	
	
}

}
