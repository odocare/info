/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *

 *
 * 版权所有，侵权必究！
 */

package com.beige.manage.modules.sys.oauth2;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 * @author Big Hero
 */
public class OAuth2Token implements AuthenticationToken {
    private String token;

    public OAuth2Token(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
