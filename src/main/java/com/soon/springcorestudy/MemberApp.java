package com.soon.springcorestudy;

import com.soon.springcorestudy.config.AppConfig;
import com.soon.springcorestudy.member.Grade;
import com.soon.springcorestudy.member.Member;
import com.soon.springcorestudy.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("member = " + findMember.getName());
    }
}
