package com.soon.springcorestudy.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //class level
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
