// pilha (stack) organiza a execu��o do c�digo

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();        	
        } catch(Exception ex) {
        	// Exception significa q vai pegar todas as exce��es
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	
        	// Forma mais espec�fica de saber exatamente qual � o erro:
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        
        metodo2();
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("deu mt errado");
 
        
        //System.out.println("Fim do metodo2");
    }
    
    // checked s�o verificados pelo compilador
    // unchecked n�o s�o verificados pelo compilador
    
}