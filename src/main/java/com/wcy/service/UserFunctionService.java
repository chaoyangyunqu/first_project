package com.wcy.service;

/**
 * @PackageName:com.wcy.service Description
 * @author:王朝阳
 * @date:2019/10/9
 */
public class UserFunctionService {
    FunctionService functionService;
    public void setFunctionService(FunctionService functionService){
        this.functionService=functionService;
    }
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
