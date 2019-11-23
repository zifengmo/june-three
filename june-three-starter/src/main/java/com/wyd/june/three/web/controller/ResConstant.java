package com.wyd.june.three.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * description
 *
 * @author chufeng
 * @date 2019-11-23 15:28
 */
public class ResConstant {

	private static final List<String> list;

	static {
		list = new ArrayList<>(1024);
		list.add("黄鹤楼（古代版）");
		list.add("跟着感觉走");
		list.add("全世界宣布爱你");
		list.add("天亮以后");
		list.add("想起");
		list.add("飘雪");
		list.add("好久不见");
		list.add("咫尺相思");
		list.add("醉梦仙霖");
		list.add("爱殇");
		list.add("我的一个道姑朋友");
		list.add("未见青山老");
		list.add("风筝误");
		list.add("鹃");
		list.add("牵绊");
		list.add("白月光");
		list.add("The Right Path");
		list.add("漂洋过海来看你");
		list.add("盛夏的果实");
		list.add("如果没有你");
		list.add("寂寞在唱歌");
		list.add("墨痕");
		list.add("花笺");
		list.add("半壶纱");
		list.add("芙蓉雨");
		list.add("借我");
		list.add("闲岁");
		list.add("牵丝戏");
		list.add("觅红");
		list.add("渡红尘");
		list.add("回梦游仙");
		list.add("少年游");
		list.add("夏恋");
		list.add("下一个天亮");
		list.add("每一天都不同");
		list.add("一直很安静");
		list.add("谁是谁的谁");
		list.add("烟火");
		list.add("送别");
		list.add("像鱼");
		list.add("的");
		list.add("化身孤岛的蓝鲸");

	}

	public static String getYourChoice() {
		int fortune = new Random().nextInt(list.size());
		return list.get(fortune);
	}

	public static void main(String[] args) {
		System.out.println(new Random().nextInt(list.size()));
	}
}
