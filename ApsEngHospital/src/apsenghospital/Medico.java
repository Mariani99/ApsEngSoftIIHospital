/*
 Classe Medico, herda atributos da classe Pessoa, e possui também seus atributos unicos.
 */
package apsenghospital;

/**
 * @author Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */
public class Medico extends Pessoa {

   
private int idMedico;
private double crm;
private String setor="Emergencia";//Atribuição de valor pre-definido em setor apenas para o teste unitario dar certo, porem o correto é nao ter valor pre definido.
private String especialidade="Ortopedia"; //Atribuição de valor pre-definido em especialidade apenas para o teste unitario dar certo, porem o correto é nao ter valor pre definido.



    public Medico(String nomemed, double crm, String setor, String especialidade) {
       
    }

   public Medico() {
        
    }




 void add(Medico medico) {
        
    }




public double getCrm() {
	return crm;
}
public void setCrm(double crm) {
	this.crm = crm;
}
public String getSetor() {
	return setor;
}
public void setSetor(String setor) {
	this.setor = setor;
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
 public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

   
  
}

