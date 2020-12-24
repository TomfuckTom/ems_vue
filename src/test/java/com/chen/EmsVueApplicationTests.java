package com.chen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class EmsVueApplicationTests {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void myTest(){
        redisTemplate.opsForValue().set("name","陈俊杰");

    }

}
