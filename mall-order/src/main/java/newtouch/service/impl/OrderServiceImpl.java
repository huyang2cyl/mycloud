package newtouch.service.impl;

import newtouch.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    /**
     * 创建订单
     */
    @Override
    //@GlobalTransactional(name = "example-create-order",rollbackFor = Exception.class)
    public void create() {

    }
}
