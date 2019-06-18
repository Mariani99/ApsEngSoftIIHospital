/*
Programa Exemplo
 */
package apsenghospital;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 * Classe recepcionista, Principal classe em nosso projeto do sistema do hospital, pois nelas esta 
 * os principais metodos de cadastro (Medico,Paciente,Acompanhante e Marcação de consulta) e a ideia central do objetivo de nosso sistema.
 * 
 * @author Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */

public class Recepcionista extends Pessoa {




    private int idRecepcionista;
    private String setorecep;
    
        public int getIdRecepcionista() {
        return idRecepcionista;
    }

    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    public String getSetorecep() {
        return setorecep;
    }

    public void setSetorecep(String setorecep) {
        this.setorecep = setorecep;
    }
    
    static ArrayList<Medico> medicos = new ArrayList<>();
    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static ArrayList<Acompanhante> acompanhant = new ArrayList<>();
    static ArrayList<Consulta> consultass = new ArrayList<>();
    static ArrayList<String> pesquisa = new ArrayList<>();

    static Medico medico = new Medico();
    static Paciente paciente = new Paciente();
    static Acompanhante acomp = new Acompanhante();
    static Consulta consult = new Consulta();

    static int lista;
    static int acho;
 
    
    static int codigoMedic = medico.getIdMedico();
    static String nomemed = medico.getNome();
    static double crm = medico.getCrm();
    static String setor = medico.getSetor();
    static String especialidade = medico.getEspecialidade();
    
    static int codigoPaciente = paciente.getCodPaciente();
    static String nomepac = paciente.getNome();
    static String  enderecopac = paciente.getEndereco();
    static double telefonepac = paciente.getTelefone();
    static double cpfpac =paciente.getCpf();
    static String doencapac = paciente.getDoenca();
    
    
    static int codacomp = acomp.getCodacomp();
    static String nomeacomp = acomp.getNome();
    static String enderecoacomp = acomp.getEndereco();
    static double telefoneacomp = acomp.getTelefone();
    static double cpfacomp = acomp.getCpf();
    
    static int codigoConsulta = consult.getCodconsult();
    static String datconsulta = consult.getDatconsulta();
    static  double horaconsulta = consult.getHoraconsulta();
    static  int andar = consult.getAndar();
    static String setorconsult = consult.getSetor();
    static  int sala = consult.getSala();
    static  String finalidade = consult.getFinalidade();
    
    public static boolean matchesOnlyText(String text) {
    return text.matches("[^\\d]+"); 
    //Metodo para verificação dos campos String, para nao aceitarem Numeros!!
}
   
    
    
    public static void main(String[] args){
    lista = 0;

   menu();

while(true){
   switch(lista){
    case 1: cadastroMedico();
        break;
    case 2: cadastroPaciente();
    break;
    case 3: cadastroAcompanhante();
    break;
    case 4: cadastroConsulta();
    break;
    case 5: menu();
    break;   

    case 6: sair();
       break;   

    default : JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA!!!", "Aviso", 1); 
    

    }
  }
}


public static void menu() {
    lista = 0;
    lista = Integer.parseInt(JOptionPane.showInputDialog(null, "Recepcionista:\n\n1. Cadastrar o Médico\n2. Cadastrar o Paciente\n3. Cadastrar acompanhante" +
            "\n4 Cadastrar consulta"+"\n5 Voltar\n6 Sair\n\nDigite a opção:"));

    
}

public static void cadastroMedico(){


    
    int lista=1;

        do{
            acho=0;
            codigoMedic=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do médico"));
            if(medicos.size()>0)
                for(int i = 0;i<medicos.size();i++){
                    if(codigoMedic==medicos.get(i).getIdMedico())
                        acho=1;
                    }
                if(acho == 1)
                    JOptionPane.showMessageDialog(null, "Médico já cadastrado","Aviso",1);        
        }while(acho==1);
        
        nomemed = JOptionPane.showInputDialog(null, "Digite o nome do Médico: ");
       while(!matchesOnlyText(nomemed)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo nome.");
    nomemed = JOptionPane.showInputDialog(null, "Digite o nome do Médico: ");
       }

       crm = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o CRM do Médico: "));
       
        setor = JOptionPane.showInputDialog(null, "Digite o setor do Médico: ");
        while(!matchesOnlyText(setor)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo setor.");
    setor = JOptionPane.showInputDialog(null, "Digite o setor do Médico:");
}
        especialidade = JOptionPane.showInputDialog(null, "Digite a especialidade do Médico: ");
        while(!matchesOnlyText(especialidade)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo especialidade.");
    especialidade = JOptionPane.showInputDialog(null, "Digite a especialidade do Médico: ");
}
        medico.add(new Medico(nomemed,crm,setor,especialidade));

        lista=Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja efetuar outro cadastro de médico?\n1. Sim\n5. Não"));
        if(lista==1){
            cadastroMedico();
        }else if(lista==5){
            menu();
        }
}
public static void cadastroPaciente(){

    
    int lista = 2;

    do{
        acho=0;
        codigoPaciente=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do Paciente"));
        if(pacientes.size()>0)
            for(int i = 0;i<pacientes.size();i++){
                if(codigoPaciente==pacientes.get(i).getCodPaciente())
                    acho=1;
                }
            if(acho==1)
                JOptionPane.showMessageDialog(null, "Paciente já cadastrado","Aviso",1);        
    }while(acho==1);

    nomepac = JOptionPane.showInputDialog(null, "Digite o nome do paciente: ");
     while(!matchesOnlyText(nomepac)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo nome do paciente.");
    nomepac = JOptionPane.showInputDialog(null, "Digite o nome do paciente: ");
     }
     
    enderecopac = JOptionPane.showInputDialog(null, "Digite o endereco do paciente: ");
    while(!matchesOnlyText(enderecopac)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo endereco do paciente.");
    enderecopac = JOptionPane.showInputDialog(null, "Digite o endereco do paciente: ");
     }
    
    telefonepac = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o telefone do paciente: "));
    
    
    cpfpac =Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o cpf do paciente "));
    
    //dtnasc = JOptionPane.showInputDialog(null, "Digite o nome do paciente: ");
    
    doencapac = JOptionPane.showInputDialog(null, "Digite a enfermidade do Paciente: ");
    while(!matchesOnlyText(doencapac)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo enfermidade do paciente.");
    doencapac = JOptionPane.showInputDialog(null, "Digite a enfermidade do Paciente: ");
     }
    
    //Lista historico
    pacientes.add(new Paciente(codigoPaciente, nomepac,enderecopac,telefonepac,cpfpac,doencapac));

    lista=Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja efetuar outro cadastro de paciente?\n2. Sim\n5. Não"));
    if(lista==2){
        cadastroPaciente();
    }else if(lista==5){
        menu();
    }

}
public static void cadastroAcompanhante(){

    
    int lista = 3;

    do{
        acho=0;
        codacomp=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do acompanhante"));
        if(acompanhant.size()>0)
            for(int i = 0;i<acompanhant.size();i++){
                if(codacomp==acompanhant.get(i).getCodacomp());
                    acho=1;
                }
            if(acho==1)
                JOptionPane.showMessageDialog(null, "Acompanhante já cadastrado","Aviso",1);        
    }while(acho==1);

    nomeacomp = JOptionPane.showInputDialog(null, "Digite o nome do Acompanhante: ");
    while(!matchesOnlyText(nomeacomp)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo nome do Acompanhante.");
    nomeacomp = JOptionPane.showInputDialog(null, "Digite o nome do Acompanhante: ");
     }
    
    enderecoacomp = JOptionPane.showInputDialog(null, "Digite o endereco do Acompanhante: ");
     while(!matchesOnlyText(enderecoacomp)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo endereco do Acompanhante.");
    enderecoacomp = JOptionPane.showInputDialog(null, "Digite o endereco do Acompanhante: ");
     }
     
    telefoneacomp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o telefone do acompanhante: "));
    cpfacomp =Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o cpf do acompanhante "));
    acompanhant.add(new Acompanhante(codacomp, nomeacomp,enderecoacomp,telefoneacomp,cpfacomp));

    lista=Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja efetuar outro cadastro de acompanhante?\n3. Sim\n5. Não"));
    if(lista==2){
        cadastroPaciente();
    }else if(lista==5){
        menu();
    }

}
public static void cadastroConsulta(){
datconsulta = null;
    int lista = 4;

    do{
        acho=0;
        codigoConsulta=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da consulta"));
        if(consultass.size()>0)
            for(int i = 0;i<consultass.size();i++){
                if(codigoConsulta==consultass.get(i).getCodconsult())
                    acho=1;
                }
            if(acho==1)
                JOptionPane.showMessageDialog(null, "Consulta já cadastrado","Aviso",1);        
    }while(acho==1);

    codigoMedic=Integer.parseInt(JOptionPane.showInputDialog("Digite o código do médico"));
    codigoPaciente=Integer.parseInt(JOptionPane.showInputDialog("Digite o código do paciente"));
    datconsulta=JOptionPane.showInputDialog("Digite a data");
    horaconsulta=Double.parseDouble(JOptionPane.showInputDialog("Digite a hora da consulta"));
    andar=Integer.parseInt(JOptionPane.showInputDialog("Digite qual andar da consulta"));
    
    setorconsult=JOptionPane.showInputDialog("Digite o setor da consulta");
    while(!matchesOnlyText(setorconsult)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo Setor da consulta.");
    setorconsult = JOptionPane.showInputDialog(null, "Digite o setor da consulta ");
     }
    
    sala=Integer.parseInt(JOptionPane.showInputDialog("Digite a sala da consulta"));
    
    finalidade=JOptionPane.showInputDialog("Digite a finalidade da consulta");
    while(!matchesOnlyText(finalidade)) {
    JOptionPane.showMessageDialog(null, "Você não pode inserir números no campo Finalidade da consulta.");
    finalidade = JOptionPane.showInputDialog(null, "Digite a finalidade da consulta: ");
     }
    

    consultass.add(new Consulta(codigoConsulta,codigoMedic, codigoPaciente, datconsulta,horaconsulta,andar,setorconsult,sala,finalidade));

    lista=Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja efetuar outro cadastro de consulta?\n4. Sim\n5. Não"));
    if(lista==3){
        cadastroConsulta();
    }else if(lista==5){
        menu();
    }
 } 


public static void sair(){

    JOptionPane.showMessageDialog(null, "Obrigado");
    System.exit(0);
}
}



