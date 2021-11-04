package com.zj.mall.product.domain.customer.gateway;

import com.zj.mall.product.domain.customer.Customer;
import com.zj.mall.product.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
