package com.zcc.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcc.common.utils.PageUtils;
import com.zcc.grainmall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:40:53
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

