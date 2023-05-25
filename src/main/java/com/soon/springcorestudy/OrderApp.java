package com.soon.springcorestudy;

import com.soon.springcorestudy.member.Grade;
import com.soon.springcorestudy.member.Member;
import com.soon.springcorestudy.member.MemberService;
import com.soon.springcorestudy.member.MemberServiceImpl;
import com.soon.springcorestudy.order.Order;
import com.soon.springcorestudy.order.OrderService;
import com.soon.springcorestudy.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println(order.calculatePrice());
    }
}
