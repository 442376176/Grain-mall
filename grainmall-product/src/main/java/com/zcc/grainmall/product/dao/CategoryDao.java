package com.zcc.grainmall.product.dao;

import com.zcc.grainmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zcc
 * @email ${email}
 * @date 2022-08-05 14:51:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
