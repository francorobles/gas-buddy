package com.tribukaldero.controller.v1;

import com.tribukaldero.model.company.Company;
import com.tribukaldero.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyControllerClass {

    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/companies")
    public @ResponseBody List<Company> companies() {
        return companyService.listAll();
    }

    @PostMapping("/companies")
    public Company companies(@RequestBody Company company) {
        companyService.save(company);
        return company;
    }
}
