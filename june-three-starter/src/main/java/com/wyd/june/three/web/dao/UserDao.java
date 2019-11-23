package com.wyd.june.three.web.dao;

import com.wyd.june.three.web.dao.entity.User;

/**
 * mapper
 *
 * @author chufeng
 * @date 2019-11-22 10:08
 */
public interface UserDao {

	int add(User user);

	User getByName(String name);
}
