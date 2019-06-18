/*
Teste Junit Classe Medico
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
public class MedicoTest {
    
    public MedicoTest() {
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
     * Teste do metodo add, da classe Recepcionista para classe Medico.
     */
    @Test
    public void testAdd() {
        System.out.println("Teste add");
        Medico medico = null;
        Medico instance = new Medico();
        instance.add(medico);
       
    }

    /**
     * Abaixo, Testes para os Metodos Getters and Setters das variaveis existentes na Classe Medico.
     */
    @Test
    public void testGetCrm() {
        System.out.println("Teste getCrm");
        Medico instance = new Medico();
        double expResult = 0.0;
        double result = instance.getCrm();
        assertEquals(expResult, result, 0.0);
        
    }

    
    @Test
    public void testSetCrm() {
        System.out.println("Teste setCrm");
        double crm = 0.0;
        Medico instance = new Medico();
        instance.setCrm(crm);
        
    }

    //Para o teste de Setor é necessario atribuir um nome para setor na classe Medico
    //Fazendo assim o teste ficar correto.
    @Test
    public void testGetSetor() {
        System.out.println("Teste getSetor");
        Medico instance = new Medico();
        String expResult = "Emergencia";
        String result = instance.getSetor();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testSetSetor() {
        System.out.println("Teste setSetor");
        String setor = "";
        Medico instance = new Medico();
        instance.setSetor(setor);
        
    }

    //Para o teste de Especialidade é necessario atribuir um nome para especialidade na classe Medico
    //Fazendo assim o teste ficar correto.
    @Test
    public void testGetEspecialidade() {
        System.out.println("Teste getEspecialidade");
        Medico instance = new Medico();
        String expResult = "Ortopedia";
        String result = instance.getEspecialidade();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testSetEspecialidade() {
        System.out.println("Teste setEspecialidade");
        String especialidade = "";
        Medico instance = new Medico();
        instance.setEspecialidade(especialidade);
        
    }

    
    @Test
    public void testGetIdMedico() {
        System.out.println("Teste getIdMedico");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.getIdMedico();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testSetIdMedico() {
        System.out.println("Teste setIdMedico");
        int idMedico = 0;
        Medico instance = new Medico();
        instance.setIdMedico(idMedico);
        
    }
    
}
