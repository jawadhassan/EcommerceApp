package repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {

}
