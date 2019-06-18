/*
Classe acompanhante, que herda os atributos de Pessoa, e possui somente seu código como atributo único.
 */
package apsenghospital;

/**
 *
 * @author Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */
public class Acompanhante extends Pessoa {
   
   
    Acompanhante(int codacomp, String nomeacomp, String enderecoacomp, double telefoneacomp, double cpfacomp) {
       
    }

    Acompanhante() {
   
    }

    private int Codacomp;
    
    Paciente paciente = new Paciente();
    int CodPaciente = paciente.getCodPaciente();
   
     public int getCodacomp() {
        return Codacomp;
    }

    public void setCodacomp(int Codacomp) {
        this.Codacomp = Codacomp;
    }
}
