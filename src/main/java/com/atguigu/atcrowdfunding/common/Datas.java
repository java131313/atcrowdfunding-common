package com.atguigu.atcrowdfunding.common;

import java.util.List;

import com.atguigu.atcrowdfunding.common.bean.User;

public class Datas {
	private List<User> users;
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
