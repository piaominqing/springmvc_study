package com.pmq.service;

import org.springframework.stereotype.Service;

import com.pmq.po.User;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean login(User user) {
		if ("pmq".equals(user.getName()) && "123456".equals(user.getPwd())) {
            return true;
        }
        return false;
	}

	@Override
	public boolean register(User user) {
		if ("pmq".equals(user.getName()) && "123456".equals(user.getPwd())) {
            return true;
        }
		return false;
	}

}
