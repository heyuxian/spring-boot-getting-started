package com.docs4dev.springboot.demo03.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.docs4dev.springboot.demo03.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void autoconfigTest() {
        User user = new User();
        user.setUsername("tom");
        userRepository.save(user);
        User dbUser = userRepository.findById(user.getId()).orElseThrow(RuntimeException::new);
        assertThat(dbUser).isEqualToComparingFieldByField(user);
    }
}