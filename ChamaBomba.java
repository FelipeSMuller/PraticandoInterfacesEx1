package br.com.java.pacote;

import javax.swing.JOptionPane;

import br.com.poo.metodos.*;

//Nesse momento um "contrato" foi feito entre ambas as classes.
public class ChamaBomba implements Bomba {

	private Boolean status;

	@Override
	public void ligar(int inicio, int fim) {

		// Imprime no prompt uma mensagem informando que a bomba está ligada
		JOptionPane.showMessageDialog(null, "Bomba ligada, status da bomba: " + getStatus());

		// Inicio do laço de repetição, basicamente ele irá incrementar até o momento em
		// que a variavel I seja igual ou menor do que fim.
		for (int i = inicio; i <= fim; i++) {

			System.out.print("Inicio da contagem: " + i + "s  Tempo restante: " + (fim - i) + "s ");

			// Entrada da estrutura try catch
			try {

				// Definindo o delay
				Thread.sleep(300);

			} catch (InterruptedException e) {

				// Imprime no prompt uma mensagem de erro , com um ícone intuitivo
				JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, tente novamente!!", null,
						JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}

		}

		// Ao sair do loop, o atributo recebe o valor de false
		this.status = false;

		// Imprime no prompt a mensagem informando o estado da bomba.

		JOptionPane.showMessageDialog(null, "Bomba desligada, status da bomba: " + getStatus());

	}

	@Override
	public void desligar() {

		// Imprime no prompt uma mensagem informando estado atual da bomba
		JOptionPane.showMessageDialog(null, "A bomba foi desligada, status atual:  " + getStatus());

	}

	// Getters e setters para acessar os atributos encapsulados.
	public Boolean getStatus() {

		return status;
	}

	public void setStatus(Boolean status) {

		// Tratamento de valores booleanos com um método
		TratarDados.tratarBoolean(status);

		this.status = status;
	}

}
