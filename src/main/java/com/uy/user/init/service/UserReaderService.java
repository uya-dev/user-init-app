package com.uy.user.init.service;

import com.uy.user.init.cfg.AppInputDataCfg;
import com.uy.user.init.entity.UserEntity;
import com.uy.user.init.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserReaderService {

    @Autowired
    private AppInputDataCfg appInputData;

    @Autowired
    private UserRepository userRepository;

    public UserReaderService() {
        System.out.println("born user reader service");
    }

    public void saveToDB() {
        List<AppInputDataCfg.User> inputUserList = appInputData.getUsers();
        System.out.println("Read input list: " + inputUserList.size());

        for (AppInputDataCfg.User user : inputUserList) {
            UserEntity userEntity = new UserEntity();
            userEntity.setFname(user.getFname());
            userEntity.setLname(user.getLname());
            userEntity.setBirthDate(user.getBirthDate());
            userRepository.save(userEntity);
        }

    }


}


/*

  UserReaderService been1 = new UserReaderService();
  been1.userName = "John Doe";

  put been1 in context.

  UserReaderService+Autowired

 */