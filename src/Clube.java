import java.time.LocalDateTime;

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
 * Representa um ingresso para participante de clube do cinema.
 *
 * <p>Este tipo de ingresso aplica descontos variáveis conforme a categoria
 * do clube ({@link EClube}), tanto no valor da entrada quanto nos adicionais.</p>
 */
public class Clube extends Ingresso {

	/**
	 * Categoria/plano do clube associada ao ingresso.
	 */
	private EClube categoria;

	/**
	 * Cria um ingresso de clube para o filme e sessão informados.
	 *
	 * @param filme nome do filme
	 * @param sessao data e hora da sessão
	 * @param clube categoria do clube utilizada para definir os descontos
	 */
	public Clube(String filme, LocalDateTime sessao, EClube clube) {
		super(filme, sessao);
	}

	/**
	 * Calcula o valor total do ingresso para cliente do clube.
	 * @return valor final do ingresso com descontos do clube
	 */
	@Override 
	public double valorIngresso() {
		double valorEntrada = VALOR_ENTRADA;
		double totalAdicionais = 0;
		valorEntrada*= categoria.descontoEntrada();
		if (adicionais.size() > 0) {
			totalAdicionais += valorAdicionais();
			totalAdicionais *= categoria.descontoAdicionais();
		} return valorEntrada + totalAdicionais;
		
	}
}