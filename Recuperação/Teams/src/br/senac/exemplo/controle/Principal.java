import br.senac.exemplo.modelo.enumeracao.situacao.Situacao;
import br.senac.exemplo.modelo.entidade.tarefa.Tarefa;

public class Principal {
	
	public static void main(String[] args) {
		
		Situacao situacao = Situacao.values()[tarefa.getSituacao().ordinal()];
		System.out.println(situacao);
		
	}
}
