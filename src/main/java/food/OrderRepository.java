package food;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, String>{
	//TacoOrder save(TacoOrder order);
	//List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
