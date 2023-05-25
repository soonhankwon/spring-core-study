package com.soon.springcorestudy.discount;

import com.soon.springcorestudy.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
