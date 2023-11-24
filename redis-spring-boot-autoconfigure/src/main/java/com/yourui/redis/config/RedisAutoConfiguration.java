package com.yourui.redis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration // 声明该类为配置类
@EnableConfigurationProperties(RedisProperties.class)// 让Spring识别RedisProperties里面定义的配置信息
@ConditionalOnClass(Jedis.class)// 只有依赖库中有Jedis.class才会 往IOC中注入redis的bean
public class RedisAutoConfiguration {

    /**
     * 提供Jedis的bean
     */
    @Bean // 注入bean
    @ConditionalOnMissingBean(name = "jedis") // 只有在IOC容量里面没有名为jedis的bean时 才注入名为jedis的bean
    public Jedis jedis(RedisProperties redisProperties) {
        return new Jedis(redisProperties.getHost(), redisProperties.getPort());
    }
}