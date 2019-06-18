/*
 Classe Pessoa, responsavel pelos principais atributos que estarão contidos em todos personagens do nosso 
sistema, que farão o cadastro posteriormente (Medico,Paciente,Acompanhante).
 */
package apsenghospital;

/**
 * @author Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */
import java.util.Date;

public class Pessoa {

  

private int idPessoa;    
private String nome;
private String endereco;
private double telefone;
private double cpf;
private Date dtnasc;


public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public Date getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}
}
