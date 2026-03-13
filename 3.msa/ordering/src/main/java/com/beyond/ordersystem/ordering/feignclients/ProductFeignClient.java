package com.beyond.ordersystem.ordering.feignclients;

import com.beyond.ordersystem.ordering.dtos.OrderCreateDto;
import com.beyond.ordersystem.ordering.dtos.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

//name 부분은 eureka에 등록된 application name 을 의미
//url 부분은 k8s 서비스명
@FeignClient(name = "product-service", url="${product.service.url:}")
public interface ProductFeignClient {


    @GetMapping("/product/detail/{id}")
    ProductDto getProdutById(@PathVariable("id")Long id);


    @PutMapping("product/updatestock")
    void updateStockQuantity(OrderCreateDto dto);

}
