// pilha (stack) organiza a execução do código

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();        	
        } catch(Exception ex) {
        	// Exception significa q vai pegar todas as exceções
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	
        	// Forma mais específica de saber exatamente qual é o erro:
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
    
    // checked são verificados pelo compilador
    // unchecked não são verificados pelo compilador
    
}