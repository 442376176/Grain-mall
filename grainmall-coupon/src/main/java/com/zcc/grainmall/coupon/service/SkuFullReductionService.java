package com.zcc.grainmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcc.common.utils.PageUtils;
import com.zcc.grainmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:25:38
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

