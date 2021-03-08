/*AUTOR: JOÃO NEIVA
 * NOME DO JOGO: MAGIVER:O RETORNO
 * Atividade realizada no módulo de Lógica de Programação da imersão Java Xpert */
import java.util.Scanner;
import java.util.Random;
public class livrojogo1 {
	
	static Random gerador = new Random();
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nomeJogador;
		int escolha;
		int meioTransporte;
		int malaDinheiro;
		int dinheiro;
		int senhaMala=777;
		int tentativaSenha;
		int kmRodar;
		int litros;
		int distancia=1000;
		int litroSaldo;
		int faseJogo;
		String novoNome;
		int kmRestante;
		int numeroEnvelope;
		String errobug;
		
		
		System.out.println("Bem vindo ao jogo Magiver: O Retorno!");
		System.out.println("Qual seu nome?");
		
		nomeJogador = leitor.next();
				
		System.out.println(nomeJogador + "! Você está pronto para começar?");
		
		System.out.println("Digite 1 para SIM ou Qualquer outro Número para NÃO");
		escolha=leitor.nextInt();
					
			
		while (escolha!=1)
		{
			
			System.out.println("Game Over!");
			System.out.println("Digite 1 Se quiser Jogar!");
			escolha=leitor.nextInt();
		}
			escolha=1;
			System.out.println("Parabéns! Vamos a sua Primeira Missão!");
			System.out.println("Vamos escolher seu meio de Transporte para cumprir sua missão:");
			System.out.println("Digite 1 para Fusca 77");
			System.out.println("Digite 2 para Gol Turbo 90");
			System.out.println("Digite 3 para Camaro V8 2021");
			
			meioTransporte = leitor.nextInt();
			
			switch(meioTransporte) {
			case 1:
				System.out.println("Você escolheu um carro econômico, mas muito lento!!!");
				break;
			case 2:
				System.out.println("Você escolheu um carro rápido, mas quebra muito!!!");
				break;	
			case 3:
				System.out.println("Você escolheu um carro rápido e confiável, mas bebe muito!!!");
				break;
			default:
				System.out.println("Opção Inválida");
									}
			System.out.println("Sua primeira missão é levar uma vacina para Vovozinha da Chapeuzinho Vermelho na cidade de Brasilia!");
			
			System.out.println("Vamos ver se hoje é seu dia de sorte: Escolha uma das malas de dinheiro ESCOLHA AS MALAS 1, 2 0U 3");
			malaDinheiro = leitor.nextInt();
			if (malaDinheiro==1) {
				System.out.println("Sua mala contém M$ 250 Merrecas ");
				dinheiro = 250;
			}
			else if (malaDinheiro==2){
				System.out.println("Sua mala contém M$ 125 Merrecas ");
				dinheiro = 125;
			}
			else {
				System.out.println("Você terá que acertar a combinação correta para abrir essa mala, Essa mala pertence ao Chapolin e ele sempre escolhe senhas com 3 numeros iguais");
				
				tentativaSenha=leitor.nextInt();
				while (tentativaSenha!= senhaMala)
				{
					System.out.println("Que pena! não foi dessa vez tente novamente!");
					tentativaSenha = leitor.nextInt();
				}
				
				tentativaSenha=senhaMala;
				System.out.println("Parabéns Você conseguiu abrir a Mala e ganhou M$ 1000 Merrecas");
				dinheiro=1000;
				
			}
			
			System.out.println(nomeJogador + " com essa grana vamos ver quanto você vai rodar com seu carro?");
			
			if (meioTransporte==1) {
				System.out.println("Seu carro faz 20 km/l ");
				litros=dinheiro/5;
				kmRodar=litros*20;
				System.out.println("Você abasteceu " + litros +  " Litros e vai rodar: " + kmRodar + "Km");
				
			}
			else if (meioTransporte==2){
				System.out.println("Seu carro faz 10 km/l ");
				litros=dinheiro/5;
				kmRodar=litros*10;
				System.out.println("Você abasteceu" + litros + "Litros e vai rodar:"+ kmRodar + "Km");
			}
			else {
				System.out.println("Seu carro faz 5 km/l ");
				litros=dinheiro/5;
				kmRodar=litros*5;
				
				System.out.println("Você abasteceu " + litros + "Litros e vai rodar:" + kmRodar  + "Km");
			}
			
			if (meioTransporte==1 && kmRodar>=distancia) {
				System.out.println("Parabéns você cumpriu sua primeira missão, Entregou a Vacina para Vovó em Brasilia!!!");
				System.out.println("Vamos para sua segunda Missão");
				faseJogo=2;
				
			}
			else if (meioTransporte==1 && kmRodar<distancia){
				
				System.out.println("Seu combustível Acabou! Você Não cumpriu sua primeira missão!!!");
				
			}
			else if (meioTransporte==2 && kmRodar<distancia){
				
				System.out.println("Seu carro quebrou! Você Não cumpriu sua primeira missão!!!");
				
			}
			else if (meioTransporte==2 && kmRodar>=distancia){
					System.out.println("Seu carro quebrou! Você Não cumpriu sua primeira missão!!!");
					litroSaldo=litros/2;
					System.out.println("Você ainda Tem " + litroSaldo +  " Litros de Combustível restante Ainda tem uma chance!");
					System.out.println("Deseja tentar a sorte para continuar? Digite 1 para tentar ou qualquer outro número para desistir");
					escolha=leitor.nextInt();
			if (escolha==1) {
					System.out.println("Para continuar a missão deve escolher outro nome pois sua identidade ja foi descoberta!");
					System.out.println("Digite Seu novo Nome:");
					novoNome = leitor.next();
										
						
					System.out.println(novoNome +  " Se o número sorteado no dado for par você continua no Jogo, se for impar o jogo acabou de uma vez para você.");
					
					switch(gerador.nextInt(6)) {
					case 1:
						System.out.println("numero sorteado ="+ gerador);
						System.out.println("Game Over!");
						
						break;
					case 2:
						System.out.println("numero sorteado ="+ gerador);
						System.out.println("Parabéns Vamos continuar!");
						faseJogo=2;
						break;
					case 3:
						System.out.println("numero sorteado ="+ gerador);
						System.out.println("Game Over!");
						break;
					case 4:
						System.out.println("numero sorteado ="+ gerador);
						System.out.println("Parabéns Vamos continuar!");
						faseJogo=2;
						break;
					case 5:
						System.out.println("numero sorteado ="+ gerador);
						System.out.println("Game Over!");
						break;
											
					case 0:
						System.out.println("numero sorteado ="+ gerador);
						System.out.println("Parabéns Vamos continuar!");
						faseJogo=2;
					}
					
					
				
			}
			else {
				System.out.println("Game Over!");
				}
			}
			
			else if (meioTransporte==3 && kmRodar<distancia){
				System.out.println("Sua Gasolina Acabou! Você Não cumpriu sua primeira missão!!!");	
				
			}
			else {
				System.out.println("Parabéns você cumpriu sua primeira missão, Entregou a Vacina para Vovó em Brasilia!!!");
				System.out.println("Vamos para sua segunda Missão");
				faseJogo=2;
			}
			
		
		System.out.println("Para manter sua identidade em sigilo você deve escolher um novo nome!");
		System.out.println("Qual seu Novo nome?");
		
		novoNome = leitor.next();
		
		while (novoNome.equals(nomeJogador))
		{
			
			System.out.println("Escolha outro nome Zé Ruela esse nós ja sabemos!");
			System.out.println("Qual seu Novo nome?");
			novoNome = leitor.next();
		}
			novoNome.equals(novoNome);
			
		    System.out.println("Muito bom" + novoNome + "!  Vamos iniciar sua Segunda Missão!");
			
			System.out.println("Seu nome agora é:" + novoNome);
			System.out.println("Seu carro  é:" + meioTransporte);
			kmRestante = kmRodar-distancia;
			System.out.println("Voce rodou " + distancia + " Km");
			System.out.println("Você ainda pode rodar " + kmRestante  + " Km");
			
		faseJogo=2;
		distancia=50;
		
		System.out.println("Na sua Segunda missão você poderá escolher entre os envelopes 1, 2 ou 3:");
		
		
		
		numeroEnvelope = leitor.nextInt();
		
		switch(numeroEnvelope) {
		case 1:
			System.out.println("Você escolheu o envelope número 1");
			System.out.println("Sua missão é desarmar uma bomba instalada na Catedral de Brasília!");
			break;
		case 2:
			System.out.println("Sua missão será encontrar a Taça do Mundial do Palmeiras!");
			System.out.println("Fatal Error! Missão impossível, pois o Palmeiras não tem Mundial!");
			System.out.println("aperte qualquer tecla para continuar");
			errobug = leitor.next();
			System.out.println("Game Over!");
			 
			break;	
		case 3:
			System.out.println("Sua Missão é encontrar a Fórmula secreta para cura do Corona Virus que está no Congresso Nacional!");
			break;
		default:
			System.out.println("Opção Inválida");
								}
		
		
		if (kmRestante>distancia) {
			
			System.out.println(novoNome + " Voce pode usar seu carro!");
		}
		else {
			System.out.println(novoNome + " Voce agora vai a pé gasolina está muito cara!");
			}
			
			
		
			
			
			
			

		
		
		
		
		
		
		
		
		
		
	}

}
