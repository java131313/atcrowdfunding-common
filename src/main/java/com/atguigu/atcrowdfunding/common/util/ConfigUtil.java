package com.atguigu.atcrowdfunding.common.util;

import java.util.ResourceBundle;

public class ConfigUtil {
private static ResourceBundle config = ResourceBundle.getBundle("config");
	
	public static String getValue( String key ) {
		return config.getString(key);
	}
	public static void main(String[] args) {
		String conf = ConfigUtil.getValue("DEFAULT_PASSWORD");
		System.out.println(conf);
	}
}
