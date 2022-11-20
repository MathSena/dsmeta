package com.mathsena.dsmeta.service;

import com.mathsena.dsmeta.entities.Sale;
import com.mathsena.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
       return repository.findAll();
    }
}
