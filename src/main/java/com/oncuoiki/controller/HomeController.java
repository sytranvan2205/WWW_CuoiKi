package com.oncuoiki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oncuoiki.entities.Product;
import com.oncuoiki.service.ProductService;

@Controller
public class HomeController {
	
		@Autowired
		ProductService productService;
	
	   @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	   public ModelAndView homePage() {
	      ModelAndView mav = new ModelAndView("home");
	      mav.addObject("message", "Hello guys");
	      return mav;
	   }
	   
		@GetMapping("product")
		public String lodeEmployee(Model m)
		{
			m.addAttribute("products", productService.getAll());
			m.addAttribute("title", "Product Report");
			
			return "ProductList";
		}
		
		//lode add employee form
		@GetMapping("addProduct")
		public String  addEmp()
		{
			
			return "AddProduct";
			
		}
		
		//save employee form
		@PostMapping("/insertProduct")
		public String insertEmployee(@ModelAttribute("insertEmployee") Product product)
		{
			
			productService.addProduct(product);
			return "redirect:/product";
		}
		
		@GetMapping("/deleteProduct/{id}")
		public String deleteEmployee(@PathVariable Long id)
		{
			productService.deleteProduct(id);
			
			
			return "redirect:/product";
		}
		
//		@PostMapping("/editEmployee/updateEmployee")
//		public String updateEmp(@ModelAttribute("updateEmployee") Employee emp)
//		{
//			employeeServices.updateEmp(emp);
//			
//			return "redirect:/employeeReport";
//			
//		}
}
