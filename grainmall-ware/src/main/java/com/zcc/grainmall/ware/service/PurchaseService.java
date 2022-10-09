package com.zcc.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcc.common.utils.PageUtils;
import com.zcc.grainmall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:40:53
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

