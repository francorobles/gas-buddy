package com.tribukaldero.service;

import java.util.List;

import com.tribukaldero.model.company.Company;
import com.tribukaldero.repository.company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyService {

    @Autowired
    private CompanyRepository repo;

    public List<Company> listAll() {
        return repo.findAll();
    }

    public void save(Company product) {
        repo.save(product);
    }

    public Company get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
