package com.mahacodes.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mahacodes.OrderManagement.Entity.Order;
@Service
public interface OrderRepository extends JpaRepository<Order,Long>{
	
}
