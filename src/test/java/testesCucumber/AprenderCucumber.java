package testesCucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class AprenderCucumber {

	@Dado("que criei o arquivo corretamente")
	public void que_criei_o_arquivo_corretamente() { 
	}

	@Quando("executá-lo")
	public void executá_lo() { 
	}

	@Então("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() { 
	}
	
	private int contador = 0;
	
	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(Integer int1) { 
		contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(Integer int1) { 
		contador += int1;
	}

	@Então("o valor do contador será {int}")
	public void o_valor_do_contador_será(Integer int1) { 
		System.out.println(int1==contador); 
	}
	
	
}
