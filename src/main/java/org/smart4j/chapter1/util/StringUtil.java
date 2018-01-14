package org.smart4j.chapter1.util;

public class StringUtil {
    public static boolean isEmpty(String str){
        if(str!=null){
            str.trim();
        }
        return StringUtil.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
