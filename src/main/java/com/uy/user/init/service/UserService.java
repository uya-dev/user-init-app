package com.uy.user.init.service;

import com.uy.user.init.cfg.AppInputDataCfg;
import com.uy.user.init.entity.UserEntity;
import com.uy.user.init.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private AppInputDataCfg appInputData;

    @Autowired
    private UserRepository userRepository;

    public UserService() {
        System.out.println("born user reader service");
    }

    public boolean saveToDB() {
        List<AppInputDataCfg.User> inputUserList = appInputData.getUsers();
        System.out.println("Read input list: " + inputUserList.size());

        if(inputUserList.isEmpty()){
            System.out.println("Input list is empty. No user to save.");
            return false;
        }

        for (AppInputDataCfg.User user : inputUserList) {
//            userRepository.save(convertToEntity(user));
            UserEntity userEntity = convertToEntity(user);
            userRepository.save(userEntity);
        }
        return true;
    }

    private static UserEntity convertToEntity(AppInputDataCfg.User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFname(user.getFname());
        userEntity.setLname(user.getLname());
        userEntity.setBirthDate(user.getBirthDate());
        return userEntity;
    }

    public int getUsersCount() {
        return (int) userRepository.count();
    }

    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) userRepository.findAll();
    }

    public UserEntity getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}


/*

  UserReaderService been1 = new UserReaderService();
  been1.userName = "John Doe";

  put been1 in context.

  UserReaderService+Autowired

 */