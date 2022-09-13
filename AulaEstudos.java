package estudos;
import java.util.Scanner;
public class AulaEstudos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1;
		double nota2;
		double medianotas;
		
		System.out.println("Digite a nota do primeiro bimestre do aluno pedro");
		nota1 = ler.nextDouble();
		System.out.println("Digite a nota do segundo bimestre do aluno pedro");
		nota2=ler.nextDouble();
		medianotas= nota1*2 + nota2*3/5;
		
		System.out.println("A nota media do aluno pedro e : "+medianotas);

	}

}
