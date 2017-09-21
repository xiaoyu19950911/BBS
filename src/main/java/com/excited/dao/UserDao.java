package com.excited.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.excited.domain.User;

@Repository
public interface UserDao {
	public User findUserByUserName(String username);// 通过用户名查找用户

	public User findUserByUserId(int id);// 通过id查找用户

	public void addUser(User user);// 添加新用户

	public void deleteUserByUserName(String username);// 根据用户名删除用户信息

	public void updateUserByUserName(User user);// 修改用户信息

	public String getUserPasswordByUserName(String username);// 根据用户名查询用户密码

	public List<User> getAllUserInfo();// 查询所有用户信息
}
