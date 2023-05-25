package com.soon.springcorestudy.config;

import com.soon.springcorestudy.discount.FixDiscountPolicy;
import com.soon.springcorestudy.member.MemberService;
import com.soon.springcorestudy.member.MemberServiceImpl;
import com.soon.springcorestudy.member.MemoryMemberRepository;
import com.soon.springcorestudy.order.OrderService;
import com.soon.springcorestudy.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
