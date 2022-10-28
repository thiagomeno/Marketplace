package br.com.menotti.appmercado.service.produto;

import br.com.menotti.appmercado.model.Produto;

import java.util.List;
public interface IProdutoService {
    public Produto criarNovoProduto(Produto p);
    public List<Produto> buscarTodos();
    public List<Produto> buscarPorPalavraChave(String palavra);
    public Produto buscarPeloId(Integer id);
    public Produto alterarDadosProduto(Produto p);
}
