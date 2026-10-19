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
 * Representa um ingresso regular (sem descontos).
 *
 * <p>Neste tipo de ingresso, tanto a entrada quanto os adicionais
 * são cobrados com valor integral.</p>
 */
public class Regular extends Ingresso {

	/**
	 * Cria um ingresso regular para o filme e sessão informados.
	 *
	 * @param filme nome do filme
	 * @param sessao data e hora da sessão
	 */
	public Regular(String filme, LocalDateTime sessao) {
		super(filme, sessao);
	}

	/**
	 * Calcula o valor total de um ingresso regular.
	 * @return valor final do ingresso regular
	 */
	public double valorIngresso() {
		double valor = VALOR_ENTRADA;
		valor += valorAdicionais();
		return  valor;
	}
}