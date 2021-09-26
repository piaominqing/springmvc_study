package com.pmq.service;

import com.pmq.po.User;

public interface UserService {
	boolean login(User user);
	boolean register(User user);
}
