package com.soon.springcorestudy.config;

import com.soon.springcorestudy.member.MemberRepository;
import com.soon.springcorestudy.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "com.soon.springcorestudy",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
