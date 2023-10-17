package com.QACart.todo.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	
	public static  Properties props = new Properties();

	public static Properties loadProperties() throws IOException {
		File file = new File("src/test/java/com/QACart/todo/Config/production.properties");
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
		return props;
	}
}
