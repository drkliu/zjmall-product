package com.zj.mall.product.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.zj.mall.product.dto.CustomerAddCmd;
import com.zj.mall.product.dto.CustomerListByNameQry;
import com.zj.mall.product.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
