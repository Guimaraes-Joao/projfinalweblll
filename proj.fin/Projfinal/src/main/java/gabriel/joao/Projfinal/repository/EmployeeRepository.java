package gabriel.joao.Projfinal.repository;

import gabriel.joao.Projfinal.model.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *@Author: Gabriel y João Pedro
 * @version: 0.4
 * @data: 2/5/2020.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
