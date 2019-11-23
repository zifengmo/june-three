package com.wyd.june.three.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

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
	public String sayYourName() throws UnsupportedEncodingException {
		String music = ResConstant.getYourChoice();
		StringBuilder sb = new StringBuilder();
		sb.append(music);
		sb.append("<br/>");
		sb.append("https://music.163.com/#/search/m/?s=");
		sb.append(URLDecoder.decode(music, "utf-8"));
		sb.append("&type=1");
		return sb.toString();
	}
}
