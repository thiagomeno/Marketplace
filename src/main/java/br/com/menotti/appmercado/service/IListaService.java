package br.com.menotti.appmercado.service;

import br.com.menotti.appmercado.model.ItemLista;
import br.com.menotti.appmercado.model.Lista;

import java.util.List;

public interface IListaService {
    public Lista criarNovaLista(Lista nova);
    public void removerLista(Integer id);
    public Lista fecharLista(Integer id);
    public Lista buscarPeloId(Integer id);
    public List<Lista> buscarTodas();

}
