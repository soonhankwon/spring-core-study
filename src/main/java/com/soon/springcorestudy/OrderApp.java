package com.soon.springcorestudy;

import com.soon.springcorestudy.config.AppConfig;
import com.soon.springcorestudy.member.Grade;
import com.soon.springcorestudy.member.Member;
import com.soon.springcorestudy.member.MemberService;
import com.soon.springcorestudy.order.Order;
import com.soon.springcorestudy.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order);
        System.out.println("order price = " + order.calculatePrice());
    }
}
