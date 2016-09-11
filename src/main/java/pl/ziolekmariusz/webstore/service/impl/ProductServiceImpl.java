package pl.ziolekmariusz.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ziolekmariusz.webstore.domain.Product;
import pl.ziolekmariusz.webstore.domain.repository.ProductRepository;
import pl.ziolekmariusz.webstore.service.ProductService;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ziolson on 05.09.2016.
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    public List<Product> getProductByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
