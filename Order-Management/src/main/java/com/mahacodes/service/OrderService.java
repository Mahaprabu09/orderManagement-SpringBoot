package com.mahacodes.service;

import org.springframework.stereotype.Service;

import com.mahacodes.OrderManagement.Entity.Order;

@Service
public interface OrderService {
	Order saveOrder(Order order);
	Order updateOrder(Order order);
	Order getOrder(Long orderId);
	Boolean deleteOrder(Long Orderid);

}
