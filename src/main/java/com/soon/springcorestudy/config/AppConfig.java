package com.soon.springcorestudy.config;

import com.soon.springcorestudy.discount.DiscountPolicy;
import com.soon.springcorestudy.discount.FixDiscountPolicy;
import com.soon.springcorestudy.member.MemberService;
import com.soon.springcorestudy.member.MemberServiceImpl;
import com.soon.springcorestudy.member.MemoryMemberRepository;
import com.soon.springcorestudy.order.OrderService;
import com.soon.springcorestudy.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
