package com.mahacodes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.mahacodes.OrderManagement.Entity.Order;
import com.mahacodes.respository.OrderRepository;

@Service
@ComponentScan
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public Order saveOrder(Order order) {
	return orderRepository.save(order);}
	@Override
	public Order updateOrder(Order order) {
	Order getdata=getOrder(order.getOrderId());
	Order updateData=new Order();
	if(getdata!=null) {
	updateData.setOrderId(order.getOrderId());
	updateData.setAddress(getdata.getAddress());
	updateData.setOrderName(getdata.getOrderName());
	updateData.setPrice(order.getPrice());}
	return orderRepository.save(updateData);}
	@Override
	public Order getOrder(Long orderId) {
		return orderRepository.findById(orderId).orElseThrow(()->new RuntimeException("Id not found!!!"));}
	@Override
	public Boolean deleteOrder(Long orderId) {
	orderRepository.deleteById(orderId);
	return true;}

}
