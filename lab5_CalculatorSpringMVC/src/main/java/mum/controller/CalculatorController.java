package mum.controller;

import mum.domain.Calculator;
import mum.service.CalculatorService;
import mum.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class CalculatorController {

   @Autowired
   private CalculatorService calculatorService;

   @Autowired
   private Validator validator;

   @RequestMapping(value ={"/Calculator"}, method = RequestMethod.GET)
    public String getCalculator(){
        return "calculator";
    }


    @RequestMapping(value={"/Calculator"}, method = RequestMethod.POST )
    public String handleCalculator(Calculator calculator, Model model, RedirectAttributes redirectAttributes,HttpServletRequest request){
        List<String> errors = validator.validate(calculator);
        if(!errors.isEmpty()){
            request.setAttribute("error", errors);
            return "calculator";
        }
        else{
            if(calculator.getAdd1()!=null && calculator.getAdd2() !=null )
                calculatorService.add(calculator);

        }
            if (calculator.getMult1() != null && calculator.getMult2() != null) {
				calculatorService.mult(calculator);
			}

            redirectAttributes.addFlashAttribute("calculator",calculator);
            redirectAttributes.addAttribute("message", "Welcome");

        return  "redirect:results" ;

    }

    @RequestMapping(value="/results", method = RequestMethod.GET)
    public String calculatorResults(Model model) throws IOException {
       Calculator calculator = (Calculator) (((ModelMap) model).get("calculator"));
       if (calculator == null)
  		throw new IOException("The calculation is Obsolete, Try Again!");
       return "result";
    }


}
