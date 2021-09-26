package com.pmq.converter;

import org.springframework.core.convert.converter.Converter;

import com.pmq.po.User;

public class UserConverter implements Converter<String, User> {

	@Override
	public User convert(String source) {
		// 创建User实例
        User user = new User();
        // 以“，”分隔
        String stringvalues[] = source.split(",");
        if (stringvalues != null && stringvalues.length == 3) {
            // 为user实例赋值
            user.setName(stringvalues[0]);
            user.setAge(Integer.parseInt(stringvalues[1]));
            user.setHeight(Double.parseDouble(stringvalues[2]));
            return user;
        } else {
            throw new IllegalArgumentException(String.format("类型转换失败， 需要格式'编程帮, 18,1.85',但格式是[% s ] ", source));
        }
	}

}
