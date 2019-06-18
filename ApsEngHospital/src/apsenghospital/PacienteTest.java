/*
Teste Junit Classe Paciente
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
 * @author  Felipe Bieluczyk Barrozo, Felippe Jackson Chemello, Leonardo Holosback Mariani
 */
public class PacienteTest {
    
    public PacienteTest() {
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
     * Abaixo, Testes para os Metodos Getters and Setters das variaveis existentes na Classe Paciente.
     */
    
    //Para o teste de Doenca é necessario atribuir um nome para doenca na classe Paciente
    //Fazendo assim o teste ficar correto. 
    @Test
    public void testGetDoenca() {
        System.out.println("getDoenca");
        Paciente instance = new Paciente();
        String expResult = "Dor";
        String result = instance.getDoenca();
        assertEquals(expResult, result);
    }


    @Test
    public void testSetDoenca() {
        System.out.println("setDoenca");
        String doenca = "";
        Paciente instance = new Paciente();
        instance.setDoenca(doenca);
    }

  
    @Test
    public void testGetCodPaciente() {
        System.out.println("getCodPaciente");
        Paciente instance = new Paciente();
        int expResult = 0;
        int result = instance.getCodPaciente();
        assertEquals(expResult, result);
    }

 
    @Test
    public void testSetCodPaciente() {
        System.out.println("setCodPaciente");
        int codPaciente = 0;
        Paciente instance = new Paciente();
        instance.setCodPaciente(codPaciente);
    }
    
}
