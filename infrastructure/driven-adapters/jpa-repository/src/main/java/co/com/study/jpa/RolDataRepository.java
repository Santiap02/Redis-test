package co.com.study.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface RolDataRepository extends CrudRepository<RolData, Long>, QueryByExampleExecutor<RolData> {
}
