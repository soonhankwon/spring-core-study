package com.soon.springcorestudy.config;

import com.soon.springcorestudy.discount.DiscountPolicy;
import com.soon.springcorestudy.discount.FixDiscountPolicy;
import com.soon.springcorestudy.discount.RateDiscountPolicy;
import com.soon.springcorestudy.member.MemberService;
import com.soon.springcorestudy.member.MemberServiceImpl;
import com.soon.springcorestudy.member.MemoryMemberRepository;
import com.soon.springcorestudy.order.OrderService;
import com.soon.springcorestudy.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
