package com.javabuilders.customer.controller;

import com.javabuilders.customer.service.OrderService;
import com.javabuilders.customer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private OrderService customerService;
    private ProductService productService;

    @Autowired
    public CustomerController(OrderService customerService, ProductService productService) {
        this.customerService = customerService;
        this.productService = productService;
    }

    @GetMapping("/customer/order/{id}")
    public String getCustomerOrderDetails(@PathVariable String id) {
        //This service call will fail to Order Service will take 3 seconds.
        return customerService.getCustomerOrderDetails(id);
    }

    @GetMapping("/customer/product/recommendation/{id}")
    public String getCustomerProductRecommendation(@PathVariable String id) {
        //This service call wil get response back, as the productApiRestTemplateConfig has readTimeout of 5000ms which is more than 3000ms
        return productService.getCustomerProductRecommendation(id);
    }

}
