package com.macro.mall.portal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class MallPortalApplicationTests {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    public class user{
        public String name;
        public int age;
    }
    @Test
    public void contextLoads() {
    }
    @Test
    public void test() {
        user u = new user();
        redisTemplate.opsForValue().set("key", u);
    }

}
