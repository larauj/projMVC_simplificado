package br.com.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.sample.model.Compra;
import br.com.sample.repository.CompraRepository;

@Service
@Transactional
public class CompraServiceImpl implements CompraService  {
    
	@Autowired
    private CompraRepository CompraRepository;
    
	@Override
    public List<Compra> getAll() {
        return (List<Compra>) CompraRepository.findAll();
    }

    @Override
    public Compra get(long id) {
        return CompraRepository.findOne(id);
    }
    
    @Override
    public void add(Compra produto) {
    		CompraRepository.save(produto);
    }
    
    @Override
    public Compra edit(Compra produto) {
        return CompraRepository.save(produto);
    }
    
    @Override
    public void delete(Compra produto) {
    		CompraRepository.delete(produto);
    }
    
    @Override
    public long count() {
        return CompraRepository.count();
    }

}
