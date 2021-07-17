package PhamTuanThao.service;

import PhamTuanThao.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ProductService implements IProductService {
    private static final HashMap<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Bim Bim", "Japan", "16-5-2021", "24-12-2021"));
        products.put(2, new Product(2, "Mi Tom", "ThaiLand", "19-6-2021", "1-12-2021"));
        products.put(3, new Product(3, "Cay Cay", "China", "12-4-2021", "12-9-2021"));
        products.put(4, new Product(4, "Kem", "Vietnammese","12-1-2021", "1-7-2021"));
        products.put(5, new Product(5, "Keo Bac Ha", "Itali","13-6-2021", "24-9-2021"));
        products.put(6, new Product(6, "Keo Oi", "America", "16-3-2021", "24-5-2021"));
    }


    @Override

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i).getName()).equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
