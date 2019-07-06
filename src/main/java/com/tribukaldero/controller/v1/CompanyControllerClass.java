package com.tribukaldero.controller.v1;

import com.tribukaldero.model.company.Company;
import com.tribukaldero.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyControllerClass {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/getAllCompanies")
    public @ResponseBody List<Company> getAllCompanies() {
        return companyService.listAll();
    }
}
