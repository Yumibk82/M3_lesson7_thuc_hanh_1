package lesson7thuchanh.repository;

import lesson7thuchanh.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProvinceRepository extends PagingAndSortingRepository<Province,Long> {
}
