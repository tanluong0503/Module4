package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


public class ProductCPController {
    @GetMapping
    public ModelAndView showProductList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cp/product/list");

        return modelAndView;
    }
}
