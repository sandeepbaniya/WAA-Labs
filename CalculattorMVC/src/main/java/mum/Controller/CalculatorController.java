package mum.Controller;


import mum.domain.Calculator;
import mum.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller

public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value = "/docalc")
    public String calculatorHandler(Calculator calculator, HttpServletRequest request){

        calculatorService.add(calculator);
        calculatorService.multiply(calculator);

        return "/WEB-INF/jsp/result.jsp";
    }


}
