package tg.hrms.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AbstractRepository<K, V>
		extends PagingAndSortingRepository<K, V>, JpaRepository<K, V>, JpaSpecificationExecutor<K> {

}
