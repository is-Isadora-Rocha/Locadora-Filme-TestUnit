/**
 * Nomeando o packageTest com o mesmo nome
 * do package princial, o Java interliga
 * como se fosse um único package, atribuindo
 * métodos Public e Protected.
 * **/
package br.isadora.servicos;

import br.isadora.entidades.Filme;
import br.isadora.entidades.Locacao;
import br.isadora.entidades.Usuario;
import br.isadora.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceTest {
    @Test
    public void teste() {
        //cenario
        LocacaoService service =  new LocacaoService();
        Usuario usuario = new Usuario("Usuário 1");
        Filme filme = new Filme("Filme 1", 1, 5.0);

        //acao
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificacao
        Assert.assertTrue(locacao.getValor() == 5.0);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
    }
}
