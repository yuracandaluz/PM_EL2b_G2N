import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/** 
 * MIT License
 *
 * Copyright(c) 2026 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * 
 * @author João Caram @joaocaram (caram@pucminas.br)
 * Utilização do @Copilot para geração da documentação JavaDoc (revisada para a atividade)
 * 
*/

/**
 * Classe base para os tipos de ingresso do cinema.
 *
 * <p>Armazena os dados comuns a qualquer ingresso:
 * nome do filme, data/hora da sessão e lista de adicionais.
 * Também define o método do valor final do ingresso,
 * que deve ser implementado pelas subclasses.</p>
 */
public abstract class Ingresso {

	/**
	 * Valor base da entrada inteira do cinema.
	 */
	protected static final double VALOR_ENTRADA = 28;

	/**
	 * Nome do filme da sessão.
	 */
	private String filme;

	/**
	 * Data e hora da sessão do filme.
	 */
	private LocalDateTime sessao;

	/**
	 * Lista de adicionais vinculados ao ingresso.
	 */
	protected List<EAdicional> adicionais;

	/**
	 * Constrói um ingresso com filme e sessão.
	 *
	 * <p>Regras aplicadas:
	 * <ul>
	 *   <li>Se a sessão for nula, usa a data/hora atual.</li>
	 *   <li>Se o nome do filme for vazio, define "Filme sem nome".</li>
	 * </ul>
	 * </p>
	 *
	 * @param filme nome do filme
	 * @param sessao data/hora da sessão
	 */
	protected Ingresso(String filme, LocalDateTime sessao) {
		if(sessao == null)
			sessao = LocalDateTime.now();
		if(filme.length()==0)
			filme = "Filme sem nome";

		this.filme = filme;
		this.sessao = sessao;
		adicionais = new LinkedList<>();
	}

	/**
	 * Inclui um adicional no ingresso, caso não seja nulo.
	 *
	 * @param adicional adicional a ser incluído
	 * @return valor do adicional incluído, ou 0 quando adicional é nulo
	 */
	public double incluir(EAdicional adicional) {
		double resposta = 0;
		if(adicional != null){
			adicionais.add(adicional);
			resposta = adicional.valor();
		}
		return resposta;	

	}

	/**
	 * Calcula o valor total do ingresso, considerando as regras do tipo concreto
	 * (regular, meia-entrada ou clube) e as regras do problema.
	 *
	 * @return valor final do ingresso
	 */
	public abstract double valorIngresso();

	public double valorAdicionais() {
		double total = 0;
		for (EAdicional adicional : adicionais) {
			total += adicional.valor();
			
		} return total;
	}

	/**
	 * Gera a representação textual (cupom) do ingresso.
	 *
	 * <p>Deve apresentar os dados do filme, sessão, adicionais e valor final a pagar.</p>
	 *
	 * @return cupom descritivo do ingresso
	 */
	@Override 
	public String toString() {
		//TODO
		return "";
	}
}