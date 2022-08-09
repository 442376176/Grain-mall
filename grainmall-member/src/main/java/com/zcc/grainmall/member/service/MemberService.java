package com.zcc.grainmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcc.common.utils.PageUtils;
import com.zcc.grainmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:31:02
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

