package view;
import controller.sapinho;
public class main {
	private static int caminho =  100;
	private static int sapos = 5;
	
	public static void main(String[]args) {
	sapinho corrida;
	
	for (int i=1; i<= sapos; i++) {
		corrida = new sapinho("sapo" + i, caminho);
		corrida.start();
	}
}

}
