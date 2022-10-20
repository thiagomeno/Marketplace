package br.com.menotti.appmercado.service;

import br.com.menotti.appmercado.model.ItemLista;

public interface ItemListaService {
    public ItemLista insertItem(ItemLista novo);
    public ItemLista alterarItem(ItemLista item);
    public void removerItem(Integer nunSeq);


}
