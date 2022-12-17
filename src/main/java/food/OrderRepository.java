package food;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
	//TacoOrder save(TacoOrder order);
	//List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
