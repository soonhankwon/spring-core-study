package com.soon.springcorestudy.discount;

import com.soon.springcorestudy.member.Grade;
import com.soon.springcorestudy.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int dicountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return price * dicountPercent / 100;
        else
            return 0;
    }
}
