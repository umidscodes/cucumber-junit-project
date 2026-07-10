package com.les.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class ConfigurationReader {
        private static Properties properties = new Properties();

        public ConfigurationReader() {
        }

        public static String getProperty(String keyword) {
            return properties.getProperty(keyword);
        }

        static {
            try {
                FileInputStream file = new FileInputStream("configuration.properties");
                properties.load(file);
                file.close();
            } catch (IOException e) {
                System.out.println("File not found with given path!!!");
                e.printStackTrace();
            }

        }
    }

