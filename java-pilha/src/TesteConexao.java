
public class TesteConexao {
	
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("deu erro na conexão");		
		}
		
		
		
		
		
		
		
// Antigamente, era assim:		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();		
//		} catch (IllegalStateException ex) {
//			System.out.println("deu erro na conexão");
//		} finally {
			// sempre vai acontecer
//			System.out.println("finally");
//			if (con != null ) {
//				con.close();
//			}
//		}
//		
	}

}
