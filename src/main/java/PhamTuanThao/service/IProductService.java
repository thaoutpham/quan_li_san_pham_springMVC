package PhamTuanThao.service;

import PhamTuanThao.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

    int findByName(String name);

}
