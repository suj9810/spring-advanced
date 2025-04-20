package org.example.expert.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
class PasswordEncoderTest {

    @InjectMocks
    private PasswordEncoder passwordEncoder;

    @Test
    void returnsTrueWhenPasswordMatches() {
        // given
        String rawPassword = "testPassword";
        String encodedPassword = passwordEncoder.encode(rawPassword);

        System.out.println("encodedPassword : " + encodedPassword);
        // when
        boolean matches = passwordEncoder.matches(rawPassword, encodedPassword);
        System.out.println("matches : " + matches);

        // then
        assertTrue(matches);
    }
}
