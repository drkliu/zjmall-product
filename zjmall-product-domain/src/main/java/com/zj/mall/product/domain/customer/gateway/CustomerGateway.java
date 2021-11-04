package com.zj.mall.product.domain.customer.gateway;

import com.zj.mall.product.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
