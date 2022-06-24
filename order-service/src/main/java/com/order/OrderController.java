package com.order;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController extends BaseController {
	@Autowired
	OrderService orderService;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public void createOrder(@Valid @RequestBody OrderVO order) {
		orderService.insertOrder(order);
		System.out.println(order.getPrice());
	}
	
	@GetMapping("/item/{item}")
	 OrderVO getByItem(@PathVariable String item) {
		return orderService.getByItem(item);
	}
	
	@GetMapping("/id/{id}/username/{username}" )
	public OrderVO getOrder(Integer id) {
		
		return new OrderVO();
	}
	
	void deleteOrder() {
		// TODO Auto-generated method stub

	}
}
