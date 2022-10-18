import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Projeto POO manipulando arquivo txt
		
		Scanner teclado = new Scanner(System.in);
		
		java.io.File diretorio = new java.io.File("C:\\Users\\Joyce\\eclipse-workspace\\ProjetoPOO\\Projeto manipulação de arquivo.txt");
		 
		if (!diretorio.exists()) {
			diretorio.createNewFile();
		}
		
		System.out.println("Escolha uma das opções abaixo para manipular um arquivo TXT: ");
		System.out.println("1 - Inserir nome no arquivo;");
		System.out.println("2 - Exibir todos os nomes do aquivo;");
		System.out.println("3 - Apagar todo o arquivo;");
		
		int codigo = teclado.nextInt();
		
		switch (codigo) {
		
		case 1:
			Scanner teclado2 = new Scanner(System.in);
			FileWriter escrevearquivo = new FileWriter(diretorio);
			BufferedWriter bufferEsc = new BufferedWriter (escrevearquivo);
			System.out.println("Opção 1 escolhida, escreva um nome no arquivo: ");
			for (int i=0;i<4;i++) {
				String linha = teclado2.nextLine();
				bufferEsc.write(linha);
			}
			bufferEsc.close();
			
			break;
			
		case 2:
			FileReader lerdiretorio = new FileReader (diretorio);
			BufferedReader Bufferler = new BufferedReader(lerdiretorio);
			System.out.println("Opção 2 escolhida, Veja o arquivo: ");
			String exibir;
			while (Bufferler.ready()) {
				exibir = Bufferler.readLine();
				System.out.println(exibir);
			}
			Bufferler.close();
			
			break;
			
		case 3:
			diretorio.delete();
			System.out.println("opção 3 - o arquivo foi apagado");
			break;
			
			default:
				
				System.out.println("Opção Invalida");
		}
		
		
	}

}
