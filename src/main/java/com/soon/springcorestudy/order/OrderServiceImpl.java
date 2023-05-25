package com.soon.springcorestudy.order;

import com.soon.springcorestudy.discount.DiscountPolicy;
import com.soon.springcorestudy.discount.FixDiscountPolicy;
import com.soon.springcorestudy.member.Member;
import com.soon.springcorestudy.member.MemberRepository;
import com.soon.springcorestudy.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
