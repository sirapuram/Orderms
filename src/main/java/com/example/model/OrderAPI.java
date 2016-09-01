package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.OrderRepository;
import com.example.service.OrderService;

@RestController
public class OrderAPI {
	
	@Autowired
	private OrderService orderService;

 @RequestMapping(value="/api/order",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
 public ResponseEntity<List<Order>> findAll(){
	 
	 List<Order> list = new ArrayList<Order>();
	 list.add(new Order(1,"Local Order", new Date(),true));
	 
	 return new ResponseEntity<List<Order>>(orderService.findAll(),HttpStatus.OK);
 }
 
 
 
	

}
