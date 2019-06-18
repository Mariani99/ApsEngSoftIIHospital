/*
Teste Junit Classe Recepcionista
 */
package apsenghospital;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */
public class RecepcionistaTest {
    
    public RecepcionistaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     *Teste do metodo Main da classe Recepcionista.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Recepcionista.main(args);
        
        
    }

    /**
    Abaixo Testes do Menu e de seus respectivos Cadastros (Paciente,Medico,Acompanhante e Consulta) da classe Recepcionista.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        Recepcionista.menu();
        
    }

    @Test
    public void testCadastroMedico() {
        System.out.println("cadastroMedico");
        Recepcionista.cadastroMedico();
        
    }


    @Test
    public void testCadastroPaciente() {
        System.out.println("cadastroPaciente");
        Recepcionista.cadastroPaciente();
        
    }


    @Test
    public void testCadastroAcompanhante() {
        System.out.println("cadastroAcompanhante");
        Recepcionista.cadastroAcompanhante();
 
    }


    @Test
    public void testCadastroConsulta() {
        System.out.println("cadastroConsulta");
        Recepcionista.cadastroConsulta();
        
    }

    /**
     * Abaixo Teste do metodo de saida do Menu, da classe Recepcionista.
     */
    @Test
    public void testSair() {
        System.out.println("sair");
        Recepcionista.sair();
      
    }
    
}
