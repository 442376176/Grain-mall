package com.zcc.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcc.common.utils.PageUtils;
import com.zcc.grainmall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:40:53
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

