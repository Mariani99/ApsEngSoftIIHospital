/*
 Classe Consulta e seus atributos, utilizada para marcação de uma consulta para um paciente atraves do Recepcionista!
 */
package apsenghospital;

/**
 *
 * @author Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */
public class Consulta {
    
   private int codconsult; 
   
   Paciente paciente = new Paciente();
   int CodPaciente = paciente.getCodPaciente();

   Medico medico = new Medico();
   int IdMedico = medico.getIdMedico();
   
   
   private String datconsulta;
   private double horaconsulta;
   private int andar;
   private String setor ;
   private int sala;
   private String finalidade;

    Consulta(int codigoConsulta, int codigoMedic, int codigoPaciente, String datconsulta, double horaconsulta, int andar, String setorconsult, int sala, String finalidade) {
       
    }

    Consulta() {
        
    }
   
   public int getCodconsult() {
        return codconsult;
    }

    public void setCodconsult(int codconsult) {
        this.codconsult = codconsult;
    }
    public String getDatconsulta() {
        return datconsulta;
    }

    public void setDatconsulta(String datconsulta) {
        this.datconsulta = datconsulta;
    }
    

    public double getHoraconsulta() {
        return horaconsulta;
    }

    public void setHoraconsulta(double horaconsulta) {
        this.horaconsulta = horaconsulta;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }
   
}
