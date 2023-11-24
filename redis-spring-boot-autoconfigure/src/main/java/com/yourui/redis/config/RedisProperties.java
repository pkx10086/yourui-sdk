package com.yourui.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 配置文件中以redis开头的属性都会和本地的redis对应起来
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    // 默认为本机
    private String host = "localhost";
    // redis默认端口为6379
    private int port = 6379;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
