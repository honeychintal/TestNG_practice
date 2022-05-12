package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertiesFile {
	@Test
	public void read() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\resources\\config.properties");
		prop.load(fis);

		System.out.println("browser: "+prop.get("browser"));
		System.out.println("user: "+prop.get("user"));
		System.out.println("url: "+prop.get("url"));
		System.out.println("office: "+prop.get("office"));
	}
}
