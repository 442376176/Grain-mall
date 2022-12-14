package com.zcc.grainmall.order.dao;

import com.zcc.grainmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:36:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
