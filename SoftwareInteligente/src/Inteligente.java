import  java.util.Scanner;
import java.util.Random;

public class Inteligente {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);	
	Random num = new Random();
	int aleatorio;
	String pergunta;
	 	
		while (true)
			{
			System.out.println("Faça uma pergunta...");
			pergunta = leia.nextLine();
			aleatorio = num.nextInt(5);
			
			if (pergunta == "sair")
			{
				break;
			}
			
			if (pergunta.length() == 0){
				System.out.println("Digite uma pergunta, seu idiota!");
				continue;
			}
			if (pergunta.contains("Thiago") || pergunta.contains("thiago") || pergunta.contains("tiago")){
				System.out.println("O Thiago é uma lenda viva!");
				continue;
			}
			if ((pergunta.contains("Deus") || pergunta.contains("deus")) 
					&& 
					(pergunta.contains("qual") || pergunta.contains("Qual")||pergunta.contains("quem")|| pergunta.contains("Quem"))){
				System.out.println("O meu Deus se chama Thiago");
				continue;
			
			}
			
			if (pergunta.contains("Deus") || pergunta.contains("deus")){
				System.out.println("Eu acredito em Deus.");
				continue;
			}
			
						
			if (pergunta.contains("vida") && pergunta.contains("sentido ")){
				System.out.println("	A ciência propõe duas explicações para essa dúvida metafísica.\n"
						+ "A primeira, mais tradicional, é: o sentido (objetivo) da vida é se \n"
						+ "reproduzir, ou seja, ter filhos. Ponto. Isso vale tanto para nós como \n"
						+ "para o sabiá, o cordeiro patagônico ou o bicho-da-seda.");
				continue;
			}
			if ((pergunta.contains("vc") || pergunta.contains("Você") || pergunta.contains("Você") || 
					pergunta.contains("Vai") || pergunta.contains("vai")) 
					&& 
					(pergunta.contains("bosta") || pergunta.contains("merda") || pergunta.contains("fuder"))){
				System.out.println("Você é muito grosso!");
				continue;
			}
			
			switch (aleatorio) 
				{
					case 0:
					{
						System.out.println("Não.");	
						break;
					}
					case 1:
					{
						System.out.println("Sim.");	
						break;
					}
					case 2:
					{
						System.out.println("Talvez.");	
						break;
					}
					case 3:
					{
						System.out.println("Quem sabe?!");	
						break;
					}
					case 4:
					{
						System.out.println("Eu não sei.");	
						break;
					}
					case 5:
					{
						System.out.println("Nem a pau, mermaum!");	
						break;
					}
			
				}
	
		}

	}
}
