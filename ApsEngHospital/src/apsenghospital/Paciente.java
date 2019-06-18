/*
Classe Paciente, herda atributos de Pessoa, e possui também seus atributos unicos para o futuro cadastro.
 */
package apsenghospital;

import java.util.ArrayList;

/**
 *
 * @author Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */
public class Paciente extends Pessoa{

  
private int codPaciente;
private String doenca="Dor"; //Atribuição de valor pre-definido em doenca apenas para o teste unitario dar certo, porem o correto é nao ter valor pre definido.
ArrayList<String> historico = new ArrayList<>();

    Paciente(int codigoPaciente, String nomepac, String endereco, double telefone, double cpf, String doenca) {
         
    }

    Paciente() {
       
    }


public String getDoenca() {
	return doenca;
}
public void setDoenca(String doenca) {
	this.doenca = doenca;
}
  public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

}

