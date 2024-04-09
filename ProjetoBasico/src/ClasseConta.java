import javax.print.attribute.standard.Destination;

public class ClasseConta {

	short atributoNumeroConta; //0
	float atributoSaldoConta;  //0.0
	String atributoTipoConta;  //null
	
	ClassePessoa atributoPessoa;
	
	void metodoDepositar(float parametroValorEnviado){
		// this , referencia o objeto.
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValorEnviado;
		//this.atributoSaldoConta =+ parametroValorEnviado;
	}
	 void metodoSacar(float parametroValorSaque){
		 this.atributoSaldoConta = this.atributoSaldoConta - parametroValorSaque;
		 
		 if (this.atributoSaldoConta < parametroValorSaque){
			 System.out.println("Limite insuficiente !");
		 }
		 else{
			 this.atributoSaldoConta = this.atributoSaldoConta - parametroValorSaque;
		 }
	 }
	 
	 void metodoTransferir(float parametroValorTranferido , ClasseConta origem, ClasseConta destino){
		 origem.atributoSaldoConta -= parametroValorTranferido;
		 destino.atributoSaldoConta += parametroValorTranferido;
	 }
	 
}
  
