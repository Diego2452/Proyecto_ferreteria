package com.ferreteria.controller;

import com.ferreteria.dao.ArticuloDao;
import com.ferreteria.model.Articulo;
import com.ferreteria.services.ArticuloService;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos",articulos);
        return "index";
    }
}
