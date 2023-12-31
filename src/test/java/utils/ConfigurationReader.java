package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
       return properties.getProperty(key);
    }

}
