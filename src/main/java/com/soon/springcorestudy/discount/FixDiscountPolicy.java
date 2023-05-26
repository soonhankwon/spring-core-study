package com.soon.springcorestudy.discount;

import com.soon.springcorestudy.member.Grade;
import com.soon.springcorestudy.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    private int dicountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return dicountFixAmount;
        else
            return 0;
    }
}
