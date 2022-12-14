package br.isadora.servicos;

import br.isadora.entidades.Filme;
import br.isadora.entidades.Locacao;
import br.isadora.entidades.Usuario;

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

    public static void main(String[] args) {

    }
}
