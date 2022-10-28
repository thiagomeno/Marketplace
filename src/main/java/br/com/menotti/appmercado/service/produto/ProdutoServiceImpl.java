package br.com.menotti.appmercado.service.produto;

import br.com.menotti.appmercado.dao.ProdutoDAO;
import br.com.menotti.appmercado.model.Produto;
import br.com.menotti.appmercado.repository.ProdutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProdutoServiceImpl implements IProdutoService{

    @Autowired
    private ProdutoDAO pDao;

    @Override
    public Produto criarNovoProduto(Produto p) {
        // TODO Auto-generated method stub
        return pDao.save(p);
    }

    @Override
    public List<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return (List<Produto>)pDao.findAll();
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String palavra) {
        // TODO Auto-generated method stub
        return pDao.findByNomeContaining(palavra);
    }

    @Override
    public Produto buscarPeloId(Integer id) {
        // TODO Auto-generated method stub
        return pDao.findById(id).orElse(null);
    }

    @Override
    public Produto alterarDadosProduto(Produto p) {
        // TODO Auto-generated method stub
        return pDao.save(p);
    }

}
