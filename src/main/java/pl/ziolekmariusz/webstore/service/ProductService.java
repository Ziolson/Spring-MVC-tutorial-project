package pl.ziolekmariusz.webstore.service;

import pl.ziolekmariusz.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ziolson on 05.09.2016.
 */
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String productId);
    List<Product> getProductByCategory(String category);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    void addProduct(Product product);
}
