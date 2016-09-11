package pl.ziolekmariusz.webstore.service;

/**
 * Created by ziolson on 05.09.2016.
 */
public interface OrderService {
    void processOrder(String productId, int count);
}
