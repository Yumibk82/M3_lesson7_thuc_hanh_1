package lesson7thuchanh.service;

import lesson7thuchanh.model.Customer;
import lesson7thuchanh.model.Province;

public interface ICustomerService extends IGeneralService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
}
