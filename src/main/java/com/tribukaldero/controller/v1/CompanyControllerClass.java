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

    @RequestMapping(value = "/companies", method = RequestMethod.GET)
    public @ResponseBody List<Company> companies() {
        return companyService.listAll();
    }
}
