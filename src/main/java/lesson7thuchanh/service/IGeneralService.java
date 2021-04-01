package lesson7thuchanh.service;

import lesson7thuchanh.model.Customer;
import lesson7thuchanh.model.Province;

import java.util.List;

public interface IGeneralService <T>{
    List<T> findAll();
    T findById(Long id);
    void save(T t);
    void remove(Long id);

}
