/*
Criando um patter Singleton para o diretor do Hospital, pois só existe um Diretor assim ficando o Singleton responsavel por
instanciar e oferecer a única instancia dele mesmo,através de um construtor privado.
 */
package apsenghospital;

/**
 *
 * @author Pichau
 */
public class Diretor {
    //Singleton
    private Diretor() {
    }
    
    public static Diretor getInstance() {
        return DiretorHolder.INSTANCE;
    }
    
    private static class DiretorHolder {

        private static final Diretor INSTANCE = new Diretor();
    }
}
