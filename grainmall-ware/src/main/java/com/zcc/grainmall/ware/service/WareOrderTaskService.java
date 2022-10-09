package com.zcc.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcc.common.utils.PageUtils;
import com.zcc.grainmall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:40:53
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

