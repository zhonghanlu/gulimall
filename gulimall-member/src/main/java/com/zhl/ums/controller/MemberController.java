package com.zhl.ums.controller;

import java.util.Arrays;
import java.util.Map;

import com.zhl.ums.feign.CouponFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zhl.ums.entity.MemberEntity;
import com.zhl.ums.service.MemberService;
import com.zhl.common.utils.PageUtils;
import com.zhl.common.utils.R;

import javax.annotation.Resource;


/**
 * 会员
 *
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:42:44
 */
@RestController
@RequestMapping("ums/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @Resource
    private CouponFeignService couponFeignService;

    @GetMapping("memberCoupons")
    public R memberCoupons() {
        return R.ok().put("coupons", couponFeignService.couponsList().get("coupons"));
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
