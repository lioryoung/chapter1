package org.smart4j.chapter1.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter1.util.PropsUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseHelper {
    private static final Logger LOGGER= LoggerFactory.getLogger(PropsUtil.class);


    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties properties= PropsUtil.loadProps("config.properties");
        DRIVER=properties.getProperty("jdbc.driver");
        URL=properties.getProperty("jdbc.url");
        USERNAME=properties.getProperty("jdbc.username");
        PASSWORD=properties.getProperty("jdbc.password");
        try{
            Class.forName(DRIVER);
        }catch (ClassNotFoundException e){
            LOGGER.error("can not load jdbc driver",e);
        }
    }

    public static Connection getConnection(){
        Connection conn=null;
        try{
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (SQLException e){
            LOGGER.error("get connection failure",e);
        }
        return conn;
    }

    public static void closeConnection(Connection conn){
        if(conn!=null){
            try{
                conn.close();
            }catch (SQLException e){
                LOGGER.error("close connection failure",e);
            }
        }
    }

}
