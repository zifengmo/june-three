package com.wyd.june.three.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author chufeng
 * @date 2019-11-13 17:28
 */
@RestController
@RequestMapping("/june")
public class JuneController {

	@RequestMapping("/answer")
	public String asYouWish(@RequestParam String name) {
		return "never mind, i love you " + name;
	}
}
