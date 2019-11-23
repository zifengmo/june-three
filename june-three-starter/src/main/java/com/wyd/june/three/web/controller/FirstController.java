package com.wyd.june.three.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页
 *
 * @author chufeng
 * @date 2019-11-13 17:35
 */
@RequestMapping("/")
@RestController
public class FirstController {

	@RequestMapping("")
	public String sayYourName() {
		return ResConstant.getYourChoice();
	}
}
