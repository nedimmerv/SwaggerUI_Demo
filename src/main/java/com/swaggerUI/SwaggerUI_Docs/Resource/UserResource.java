package com.swaggerUI.SwaggerUI_Docs.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUsers() {

        return Arrays.asList(
                new User("Nedim", 25000L),
                new User("Kerim", 2550L)
        );
    }

        @GetMapping("/{userName}")
                public User getUser(@PathVariable("userName") final String userName)
        {
            return  new User(userName, 2500L);

    }
    private class User{
        public User(String userName, long l) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        private  String userName;

        public long getSalary() {
            return salary;
        }

        public void setSalary(long salary) {
            this.salary = salary;
        }

        private  long salary;
    }
}
