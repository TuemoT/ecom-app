package com.ipsas.gi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipsas.gi.entities.ProductRepository;



@RestController
public class ProductController<Product>{
	@Autowired
	private ProductRepository productRepository;
	@GetMapping("/index")
	public String index(){
		
		return "index";
	}
	
	/*
	 * @GetMapping(path = "/products") public String products(Model model) {
	 * //addproductss(); model.addAttribute("products",
	 * productRepository.findAll()); return "products"; }
	 */
	@GetMapping("/products")
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
	
}