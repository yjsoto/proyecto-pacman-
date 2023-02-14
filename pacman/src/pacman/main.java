package pacman;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner lectura = new Scanner (System.in);
		int tamaño;
		System.out.print("ingrese el tamaño del tablero: ");
		tamaño=lectura.nextInt();
		if(tamaño >= 2 && tamaño <= 100) {
		int [][] matriz = new int [tamaño][tamaño];
		for(int j=0;j<tamaño;j++) {
			for(int i=0;i<tamaño;i++) {
				Random random=new Random();
				int num = random.nextInt(3);
				if(j==0 && i==0) {
					num=0;
				}
				matriz[j][i] = num;
				switch(num) {
				case 0:
					System.out.print(".");
					break;
				case 1:
					System.out.print("o");
					break;
				case 2:
					System.out.print("A");
					break;
				}
			}
			System.out.println();
		}
		int maxComida =0;
		int contador=0;
		for(int j=0;j<tamaño;j++) {
			if(j%2==0) {
				for(int i=0;i<tamaño;i++) {
					switch(matriz[j][i]) {
						case 0:
							break;
						case 1:
							contador++;
							break;
						case 2:
							maxComida = (contador > maxComida) ? contador : maxComida;
							contador=0;
							break;
					}
				}	
			}else {
				for(int i=tamaño-1;i>=0;i--) {
					switch(matriz[j][i]) {
						case 0:
							break;
						case 1:
							contador++;
							break;
						case 2:
							maxComida = (contador > maxComida) ? contador : maxComida;
							contador=0;
							break;
					}					
				}
			}
		}
		System.out.println();
		System.out.print(maxComida);
		}
		
	}
}
