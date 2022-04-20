package com.raccoon.auth.service;

import com.raccoon.auth.model.StudentDetails;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentDetailsService implements UserDetailsService {

    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // todo: get student with the student-service
        return new StudentDetails(
                1L,
                "tracer",
                "tracer.pk@mail.ru",
                passwordEncoder.encode("tracer123"),
                List.of("SUPER_USER")
        );
    }
}
