/*AUTOR: JO�O NEIVA
 * NOME DO JOGO: MAGIVER:O RETORNO
 * Atividade realizada no m�dulo de L�gica de Programa��o da imers�o Java Xpert */
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
		int ferramenta;
		int anoNascimento;
		int senhaPremio;
		int aleatorio;
		
		
		System.out.println("Bem vindo ao jogo Magiver: O Retorno!");
		System.out.println("Como o Magiver est� cumprindo quarentena essa miss�o � para voc�");
		System.out.println("Qual seu nome?");
		nomeJogador = leitor.next();
		System.out.println("Qual o ano do seu nascimento?");
		anoNascimento = leitor.nextInt();
				
		System.out.println(nomeJogador + "! Voc� est� pronto para come�ar?");
		
		System.out.println("Digite 1 para SIM ou Qualquer outro N�mero para N�O");
		escolha=leitor.nextInt();
					
			
		while (escolha!=1)
		{
			
			System.out.println("Game Over!");
			System.out.println("Digite 1 Se quiser Jogar!");
			escolha=leitor.nextInt();
		}
			escolha=1;
			System.out.println("Parab�ns! Vamos a sua Primeira Miss�o!");
			System.out.println("Vamos escolher seu meio de Transporte para cumprir sua miss�o:");
			System.out.println("Digite 1 para Fusca 77");
			System.out.println("Digite 2 para Gol Turbo 90");
			System.out.println("Digite 3 para Camaro V8 2021");
			
			meioTransporte = leitor.nextInt();
			
			switch(meioTransporte) {
			case 1:
				System.out.println("Voc� escolheu um carro econ�mico, mas muito lento!!!");
				break;
			case 2:
				System.out.println("Voc� escolheu um carro r�pido, mas quebra muito!!!");
				break;	
			case 3:
				System.out.println("Voc� escolheu um carro r�pido e confi�vel, mas bebe muito!!!");
				break;
			default:
				System.out.println("Op��o Inv�lida");
									}
			System.out.println("Sua primeira miss�o � levar uma vacina para Vovozinha da Chapeuzinho Vermelho na cidade de Brasilia!");
			
			System.out.println("Vamos ver se hoje � seu dia de sorte: Escolha uma das malas de dinheiro ESCOLHA AS MALAS 1, 2 0U 3");
			malaDinheiro = leitor.nextInt();
			if (malaDinheiro==1) {
				System.out.println("Sua mala cont�m M$ 250 Merrecas ");
				dinheiro = 250;
			}
			else if (malaDinheiro==2){
				System.out.println("Sua mala cont�m M$ 125 Merrecas ");
				dinheiro = 125;
			}
			else {
				System.out.println("Voc� ter� que acertar a combina��o correta para abrir essa mala");
				System.out.println("Essa mala pertence ao Chapolin e ele sempre escolhe senhas com 3 numeros iguais");
				tentativaSenha=leitor.nextInt();
				while (tentativaSenha!= senhaMala)
				{
					System.out.println("Que pena! n�o foi dessa vez tente novamente!");
					tentativaSenha = leitor.nextInt();
				}
				
				tentativaSenha=senhaMala;
				System.out.println("Parab�ns Voc� conseguiu abrir a Mala e ganhou M$ 1000 Merrecas");
				dinheiro=1000;
				
			}
			
			System.out.println(nomeJogador + " com essa grana vamos ver quanto voc� vai rodar com seu carro?");
			
			if (meioTransporte==1) {
				System.out.println("Seu carro faz 20 km/l ");
				litros=dinheiro/5;
				kmRodar=litros*20;
				System.out.println("Voc� abasteceu " + litros +  " Litros e vai rodar: " + kmRodar + "Km");
				
			}
			else if (meioTransporte==2){
				System.out.println("Seu carro faz 10 km/l ");
				litros=dinheiro/5;
				kmRodar=litros*10;
				System.out.println("Voc� abasteceu" + litros + "Litros e vai rodar:"+ kmRodar + "Km");
			}
			else {
				System.out.println("Seu carro faz 5 km/l ");
				litros=dinheiro/5;
				kmRodar=litros*5;
				
				System.out.println("Voc� abasteceu " + litros + "Litros e vai rodar:" + kmRodar  + "Km");
			}
			
			if (meioTransporte==1 && kmRodar>=distancia) {
				System.out.println("Parab�ns voc� cumpriu sua primeira miss�o, Entregou a Vacina para Vov� em Brasilia!!!");
				System.out.println("Vamos para sua segunda Miss�o");
				faseJogo=2;
				
			}
			else if (meioTransporte==1 && kmRodar<distancia){
				
				System.out.println("Seu combust�vel Acabou! Voc� N�o cumpriu sua primeira miss�o!!!");
				
			}
			else if (meioTransporte==2 && kmRodar<distancia){
				
				System.out.println("Seu carro quebrou! Voc� N�o cumpriu sua primeira miss�o!!!");
				
			}
			else if (meioTransporte==2 && kmRodar>=distancia){
					System.out.println("Seu carro quebrou! Voc� N�o cumpriu sua primeira miss�o!!!");
					litroSaldo=litros/2;
					System.out.println("Voc� ainda Tem " + litroSaldo +  " Litros de Combust�vel restante Ainda tem uma chance!");
					System.out.println("Deseja tentar a sorte para continuar? Digite 1 para tentar ou qualquer outro n�mero para desistir");
					escolha=leitor.nextInt();
			if (escolha==1) {
					System.out.println("Para continuar a miss�o deve escolher outro nome pois sua identidade ja foi descoberta!");
					System.out.println("Digite Seu novo Nome:");
					novoNome = leitor.next();
										
						
					System.out.println(novoNome +  " Se o n�mero sorteado no dado for par voc� continua no Jogo, se for impar o jogo acabou de uma vez para voc�.");
					aleatorio=gerador.nextInt(6);
					switch(aleatorio) {
					case 1:
						System.out.println("numero sorteado ="+ aleatorio);
						System.out.println("Game Over!");
						
						break;
					case 2:
						System.out.println("numero sorteado ="+ aleatorio);
						System.out.println("Parab�ns Vamos continuar!");
						faseJogo=2;
						break;
					case 3:
						System.out.println("numero sorteado ="+ aleatorio);
						System.out.println("Game Over!");
						break;
					case 4:
						System.out.println("numero sorteado ="+ aleatorio);
						System.out.println("Parab�ns Vamos continuar!");
						faseJogo=2;
						break;
					case 5:
						System.out.println("numero sorteado ="+ aleatorio);
						System.out.println("Game Over!");
						break;
											
					case 0:
						System.out.println("numero sorteado ="+ aleatorio);
						System.out.println("Parab�ns Vamos continuar!");
						faseJogo=2;
					}
					
					
				
			}
			else {
				System.out.println("Game Over!");
				}
			}
			
			else if (meioTransporte==3 && kmRodar<distancia){
				System.out.println("Sua Gasolina Acabou! Voc� N�o cumpriu sua primeira miss�o!!!");	
				
			}
			else {
				System.out.println("Parab�ns voc� cumpriu sua primeira miss�o, Entregou a Vacina para Vov� em Brasilia!!!");
				System.out.println("Vamos para sua segunda Miss�o");
				faseJogo=2;
			}
			
		
		System.out.println("Para manter sua identidade em sigilo voc� deve escolher um novo nome!");
		System.out.println("Qual seu Novo nome?");
		
		novoNome = leitor.next();
		
		while (novoNome.equals(nomeJogador))
		{
			
			System.out.println("Escolha outro nome Z� Ruela esse n�s ja sabemos!");
			System.out.println("Qual seu Novo nome?");
			novoNome = leitor.next();
		}
			novoNome.equals(novoNome);
			
		    System.out.println("Muito bom  " +  novoNome  +  " !  Vamos iniciar sua Segunda Miss�o!");
			
			System.out.println("Seu nome agora �:" + novoNome);
			System.out.println("Seu carro  �:" + meioTransporte);
			kmRestante = kmRodar-distancia;
			System.out.println("Voce rodou " + distancia + " Km");
			System.out.println("Voc� ainda pode rodar " + kmRestante  + " Km");
			
		faseJogo=2;
		distancia=50;
		
		System.out.println("Na sua Segunda miss�o voc� poder� escolher entre os envelopes 1, 2 ou 3:");
		
		
		
		numeroEnvelope = leitor.nextInt();
		
		switch(numeroEnvelope) {
		case 1:
			System.out.println("Voc� escolheu o envelope n�mero 1");
			System.out.println("Sua miss�o � desarmar uma bomba instalada na Catedral de Bras�lia!");
			break;
		case 2:
			System.out.println("Sua miss�o ser� encontrar a Ta�a do Mundial do Palmeiras!");
			System.out.println("Fatal Error! Miss�o imposs�vel, pois o Palmeiras n�o tem Mundial!");
			System.out.println("aperte qualquer tecla para continuar");
			errobug = leitor.next();
			System.out.println("Game Over!");
			 
			break;	
		case 3:
			System.out.println("Sua Miss�o � encontrar a F�rmula secreta para cura do Corona Virus que est� no Congresso Nacional!");
			break;
		default:
			System.out.println("Op��o Inv�lida");
								}
		
		
		if (kmRestante>distancia) {
			
			System.out.println(novoNome  +  "  Voc� pode usar seu carro!");
		}
		else {
			System.out.println(novoNome  +  "  Voc� agora vai a p� gasolina est� muito cara!");
			}
			
		System.out.println("Escolha sua ferramenta!");
		System.out.println("digite 1 , 2 ou 3 ");
		ferramenta = leitor.nextInt();
		// escolha da ferramenta para segunda miss�o//
		
		switch(ferramenta) {
		case 1:
			System.out.println("Voc� escolheu a ferramenta n�mero 1");
			System.out.println("Cascas de banana! como voc� n�o � o Magiver n�o vai conseguir fazer muita coisa");
			System.out.println("Voc� PE"
					+ "Perdeu Game Over!");
			break;
		case 2:
			System.out.println("Voc� escolheu a ferramenta n�mero 2");
			System.out.println("Maleta completa do Patolino");
			System.out.println("Eu sei que n�o � da sua �poca, mas vai por mim ela funciona!");
			System.out.println("aperte qualquer tecla para continuar");
			errobug = leitor.next();
			System.out.println("Parab�ns! miss�o cumprida!");
			
			
			// se o ano de Nascimento estiver correto o jogo sorteia um pr�mio caso negativo apenas encerra o jogo// 
			System.out.println("Revele o ano do seu nascimento para pegar seu Pr�mio:");
			System.out.println("Qual o ano do seu nascimento?");
			senhaPremio = leitor.nextInt();
			
			if(anoNascimento==senhaPremio) {
			
			switch(gerador.nextInt(3)) {
			case 0:
				
				System.out.println("Voc� Ganhou um Curso novo de Java!");
				System.out.println("Parab�ns Miss�o Cumprida!");
				
				break;
			case 1:
				
				System.out.println("Voc� Ganhou um computador novo 486 com monitor monocrom�tico de 14 polegadas!");
				System.out.println("Parab�ns Miss�o Cumprida!");
				break;
			case 2:
				System.out.println("Voce Ganhou um Macbook Pro");
				System.out.println("Parab�ns Miss�o Cumprida!");
				break;
						
			default:
				System.out.println("Op��o Inv�lida");
								}
		
			
			}else {
				System.out.println("N�o � voc�! Sai daqui impostor");
				System.out.println("Voc� cumpriu sua miss�o mas n�o vai ganhar nada!");
				
			}
			
		}
		
	}

}
