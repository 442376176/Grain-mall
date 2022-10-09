package com.zcc.grainmall.member.fegin;

import com.zcc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: Grain-mall
 * @ClassName: com.zcc.grainmall.member.fegin
 * @author: zcc
 * @date: 2022/9/29 15:26
 * @version:
 * @Describe: 远程调用接口
 *          1. 引入open-fegin
 *          2.编写一个接口，告诉Springcloud这个接口需要远程服务
 *              1.声明接口的每一个方法都是调用哪个远程服务的哪个请求
 *          3. 开启远程调用功能
 */
@FeignClient("grainmall-coupon")
public interface CouponFeignService {

    @GetMapping("coupon/coupon/test1")
    public R memberCoupons();

}
