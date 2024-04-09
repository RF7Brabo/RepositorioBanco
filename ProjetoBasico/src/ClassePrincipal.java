
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClasseConta objeto_conta_um; // Criou variavel.
		objeto_conta_um = new ClasseConta(); // Iunstanciou o objetivo.
		
		 ClasseConta objeto_conta_dois = new ClasseConta(); // Criou variavel & Instanciou o objeto (inline).
		 
		 System.out.println(objeto_conta_um.atributoNumeroConta);
		 System.out.println(objeto_conta_um.atributoSaldoConta);
		 System.out.println(objeto_conta_um.atributoTipoConta);
		 
		 
		 System.out.println(objeto_conta_dois.atributoNumeroConta);
		 System.out.println(objeto_conta_dois.atributoSaldoConta);
		 System.out.println(objeto_conta_dois.atributoTipoConta);
		
		 
		 //Adicionando dados das contas.
		 objeto_conta_um.atributoNumeroConta = 123;
		 objeto_conta_um.atributoSaldoConta = 2_600.00F;
		 objeto_conta_um.atributoTipoConta = "Conta Poupança";
		 
		 objeto_conta_dois.atributoNumeroConta = 789;
		 objeto_conta_dois.atributoSaldoConta = 4_000.00F;
		 objeto_conta_dois.atributoTipoConta = "Conta Corrente";
		  
		 System.out.println();
		 
		 System.out.println(objeto_conta_um.atributoNumeroConta);
		 System.out.println(objeto_conta_um.atributoSaldoConta);
		 System.out.println(objeto_conta_um.atributoTipoConta);
		 
		 
		 System.out.println(objeto_conta_dois.atributoNumeroConta);
		 System.out.println(objeto_conta_dois.atributoSaldoConta);
		 System.out.println(objeto_conta_dois.atributoTipoConta);
		 
		 objeto_conta_um.atributoPessoa = new ClassePessoa(); // Instanciou o objeto.
		 
		 objeto_conta_um.atributoPessoa.atributoNomePessoa = "Fuluno";
		 objeto_conta_um.atributoPessoa.atributoDocumentoPessoa = 333;
		 
		 objeto_conta_dois.atributoPessoa = new ClassePessoa(); // Instanciou o objeto.
		 
		 objeto_conta_dois.atributoPessoa.atributoNomePessoa =  "Ciclano";
		 objeto_conta_dois.atributoPessoa.atributoDocumentoPessoa = 553;
		 
		 objeto_conta_um.metodoDepositar(500.00F);
		 
		 // Agora vai imprimir na tela.
		 System.out.println(objeto_conta_um.atributoSaldoConta);
		 
		 objeto_conta_um.metodoSacar(4_000.00F);
		 System.out.println(objeto_conta_um.atributoSaldoConta);
		 
		 objeto_conta_um.metodoTransferir(500.00F, objeto_conta_um , objeto_conta_dois);
		 
		 System.out.println(objeto_conta_um.atributoSaldoConta);
		 System.out.println(objeto_conta_dois.atributoSaldoConta);
	}

}
