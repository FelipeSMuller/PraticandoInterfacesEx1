package br.com.java.pacote;

import javax.swing.JOptionPane;

public class UtilizandoInterfaces {

	public static void main(String[] args) {

		// Instanciando um novo objeto do tipo Bomba de água
		ChamaBomba bomba1 = new ChamaBomba();

		// Variavel que recebe a entrada do usuário

		int opcao = 0;

		// Inicio do loop
		do {

			// Inicio try catch
			try {

				// Entrada do usuário
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "BOMBA DE ÁGUA  \n1-Ligar \n2-Desligar"));

				// Entrada switch-case
				switch (opcao) {

				// Se o usuário selecionar a primeira opção(ligar)
				case 1:
					// Definindo o atributo STATUS como true, enquanto estiver ligada

					bomba1.setStatus(true);

					// Método ligar bomba recebe dois parametros, um define o inicio, e o outro
					// define o fim
					bomba1.ligar(
							Integer.parseInt(JOptionPane.showInputDialog(null,
									"Insira a quantidade em segundos que deseja iniciar")),
							Integer.parseInt(JOptionPane.showInputDialog(null,
									"Digite a quantidade em segundos que deseja finalizar")));

					break;

				case 2:

					// Acessa o método público setter e define o valor do atributo booleano

					bomba1.setStatus(false);

					// Desliga a bomba, chamando o método

					bomba1.desligar();

				}

				// Dados que serão verificados: se o valor fornecido é um dado não numérico, e
				// se o prompt for fechado durante a execução do programa
			} catch (NumberFormatException | NullPointerException erro) {

				// Imprime no prompt uma mensagem de erro, com um ícone que facilita a
				// visualização do erro
				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi finalizado incorretamente!!", null,
						JOptionPane.ERROR_MESSAGE);
			}

			// Enquanto o valor fornecido pelo usuário for maior do que zero, o loop
			// continuará
		} while (opcao > 0);
	}

}
