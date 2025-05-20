package com.uy.user.init.service;

import com.uy.user.init.cfg.AppInputDataCfg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserReaderService {

    @Autowired
    private AppInputDataCfg appInputData;

    public UserReaderService() {
        System.out.println("born user reader service");
    }

    public void printUsers() {

        for (AppInputDataCfg.User user : appInputData.getUsers()) {
            System.out.println(user);
        }

    }


}


/*

  UserReaderService been1 = new UserReaderService();
  been1.userName = "John Doe";

  put been1 in context.

  UserReaderService+Autowired

 */