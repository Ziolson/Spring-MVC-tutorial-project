package pl.ziolekmariusz.webstore.service.impl;

/**
 * Created by ziolson on 05.09.2016.
 */

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import pl.ziolekmariusz.webstore.domain.Product;
import pl.ziolekmariusz.webstore.domain.repository.ProductRepository;
import pl.ziolekmariusz.webstore.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private ProductRepository productRepository;

    public void processOrder(String productId, int count) {
        Product productById = productRepository.getProductById(productId);

        if (productById.getUnitsInStock() < count) {
            throw new IllegalArgumentException("Out of Stock. Available Units In stock" + productById.getUnitsInStock());
        }

        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}
