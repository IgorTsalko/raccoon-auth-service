package com.raccoon.auth.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class StudentDetails implements UserDetails {

    private final Long id;
    private final String login;
    private final String email;
    private final String password;
    private final List<String> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login != null ? login : email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // todo: retrieve from db
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // todo: retrieve from db
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // todo: retrieve from db
    }

    @Override
    public boolean isEnabled() {
        return true; // todo: retrieve from db
    }
}
