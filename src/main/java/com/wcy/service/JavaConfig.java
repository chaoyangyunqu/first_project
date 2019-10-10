package com.wcy.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PackageName:com.wcy.service Description
 * @author:王朝阳
 * @date:2019/10/9
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UserFunctionService userFunctionService(){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return userFunctionService;
    }
    @Bean
    public UserFunctionService userFunctionService(FunctionService functionService){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return userFunctionService;
    }
}
