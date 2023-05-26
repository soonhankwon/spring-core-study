package com.soon.springcorestudy.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient  {

    private String url;

    public NetworkClient() {
        System.out.println("call constructor, url = " + url);
        connect();
        call("init connect message");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //call at service start
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " message = " + message);
    }

    //call at service end
    public void disconnect() {
        System.out.println("close " + url);
    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect(); //call back
        call("init connect message");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.destroy");
        disconnect(); //call back
    }
}
