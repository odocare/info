
package com.beige.manage.common.utils;

/**
 * Redis所有Keys
 *
 * @author Big Hero
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
