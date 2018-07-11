package com.example.demo;

import com.example.demo.models.AppRole;
import com.example.demo.models.AppUser;
import com.example.demo.repository.AppRoleRepository;
import com.example.demo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    AppUserRepository userRepository;

    @Autowired
    AppRoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... strings) throws Exception {

        AppRole aRole = new AppRole();
        aRole.setRoleName("STUDENT");
        roleRepository.save(aRole);

        aRole = new AppRole();
        aRole.setRoleName("INSTRUCTOR");
        roleRepository.save(aRole);

        AppUser user = new AppUser();
        user.setUserName("student");
        user.setPassWord("password");
        user.addRole(roleRepository.findByRoleName("STUDENT"));
        userRepository.save(user);

        user = new AppUser();
        user.setUserName("instructor");
        user.setPassWord("password");
        user.addRole(roleRepository.findByRoleName("INSTRUCTOR"));
        userRepository.save(user);
    }

}
