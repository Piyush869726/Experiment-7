// package com.example.experiment7.service;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.example.experiment7.entity.User;
// import com.example.experiment7.repository.UserRepository;

// @Service
// public class CustomUserDetailsService implements UserDetailsService {

//     private final UserRepository repo;

//     public CustomUserDetailsService(UserRepository repo) {
//         this.repo = repo;
//     }

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User user = repo.findByUsername(username)
//                 .orElseThrow(() -> new UsernameNotFoundException("User not found"));

//         return org.springframework.security.core.userdetails.User
//                 .withUsername(user.getUsername())
//                 .password(user.getPassword())
//                 .roles(user.getRole()) // USER / ADMIN
//                 .build();
//     }
// }