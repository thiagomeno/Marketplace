package br.com.menotti.appmercado.service;

import br.com.menotti.appmercado.model.ItemLista;
import br.com.menotti.appmercado.repository.ItemListaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemListaServiceImpl implements ItemListaService{
    @Autowired
    private ItemListaRepo repo;
    @Override
    public ItemLista insertItem(ItemLista novo) {
        return repo.save(novo);
    }

    @Override
    public ItemLista alterarItem(ItemLista item) {
        return repo.save(item);
    }

    @Override
    public void removerItem(Integer nunSeq) {
        repo.deleteById(nunSeq);

    }
}
