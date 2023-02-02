package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.EntityClass;

@Repository
public interface StudentRepository extends JpaRepository<EntityClass, Integer> {

	Optional<EntityClass> findById(Integer id);
	
	Optional<EntityClass>  findByName(String name);
	
}
