package com.springboot.springsecurityjpa.service;

import com.springboot.springsecurityjpa.models.CustomUserDetails;
import com.springboot.springsecurityjpa.models.User;
import com.springboot.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findByUserName(s);

        user.orElseThrow(()->new UsernameNotFoundException("not found"+s));
        return user.map(CustomUserDetails::new).get();
       // return new MyUserDetails(s);
    }
}
