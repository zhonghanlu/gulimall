package com.zhl.ums.feign;

import com.zhl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/sms/coupon/memberlist")
    public R couponsList();
}
