package com.wyd.june.three.web.dao.entity;

/**
 * description
 *
 * @author chufeng
 * @date 2019-11-23 16:44
 */
public class User {

	private Long id;

	private Integer age;

	private String name;

	private String desc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
