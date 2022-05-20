package newtouch.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/order/queryById")
    public List echo(@RequestParam String id){
        List<OrderInfoVo> list = new ArrayList<>();
        OrderInfoVo v1 = new OrderInfoVo();
        v1.setId("1");
        v1.setProductName("xxx");
        list.add(v1);

        OrderInfoVo v2 = new OrderInfoVo();
        v2.setId("1");
        v2.setProductName("xxx");
        list.add(v2);
        return list;
    }
}