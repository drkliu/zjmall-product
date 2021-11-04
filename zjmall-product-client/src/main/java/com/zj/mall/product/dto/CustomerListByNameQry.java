package com.zj.mall.product.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;

@Data
public class CustomerListByNameQry extends Query{
   private String name;
}
