package com.online.taxi.order.dao;

import com.online.taxi.common.entity.OrderLock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderLockMapper {
	
    int deleteByPrimaryKey(Integer orderId);

    int insertSelective(OrderLock record);
}