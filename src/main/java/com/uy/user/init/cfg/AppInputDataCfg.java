package com.uy.user.init.cfg;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "data")
public class AppInputDataCfg {

    public AppInputDataCfg() {
        System.out.println("born app input data");
    }

    private List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }


    public static class User {
        private String fname;
        private String lname;

        private String birthDate;

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        @Override
        public String toString() {
            return "fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    ", birthDate='" + birthDate + '\'';
        }
    }


}
