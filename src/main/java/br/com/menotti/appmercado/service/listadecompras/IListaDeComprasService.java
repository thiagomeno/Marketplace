package br.com.menotti.appmercado.service.listadecompras;

import br.com.menotti.appmercado.model.ListaDeCompras;

import java.util.List;

public interface IListaDeComprasService {
    public ListaDeCompras criarNovaLista(ListaDeCompras lista);
    public ListaDeCompras buscarPeloId(Integer id);
    public List<ListaDeCompras> listarTodas();
}
