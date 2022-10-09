package com.zcc.grainmall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.zcc.grainmall.member.fegin.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.zcc.grainmall.member.entity.MemberEntity;
import com.zcc.grainmall.member.service.MemberService;
import com.zcc.common.utils.PageUtils;
import com.zcc.common.utils.R;


/**
 * 会员
 *
 * @author zcc
 * @email ${email}
 * @date 2022-08-09 11:31:02
 */
@RefreshScope
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private CouponFeignService couponFeignService;


    @Value("${age}")
    private String age;
    @Value("${name}")
    private String name;

    @GetMapping("/test")
    public R test() {
        return couponFeignService.memberCoupons().put("name",name).put("age",age);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
