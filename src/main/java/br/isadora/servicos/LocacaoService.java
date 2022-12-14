package br.isadora.servicos;

import br.isadora.entidades.Filme;
import br.isadora.entidades.Locacao;
import br.isadora.entidades.Usuario;
import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static br.isadora.utils.DataUtils.adicionarDias;

public class LocacaoService {
    public Locacao alugarFilme(Usuario usuario, Filme filme){
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //ENTREGA NO DIA SEGUINTE
        Date dataEntrega = new Date();
        dataEntrega = adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locacao...
        //TODO adicionar método para salvar

        return locacao;
    }
    @Test
    public void teste() {
        //cenario
        LocacaoService service =  new LocacaoService();
        Usuario usuario = new Usuario("Usuário 1");
        Filme filme = new Filme("Filme 1", 1, 5.0);

        //acao
        service.alugarFilme(usuario, filme);

        //verificacao
    }
}
