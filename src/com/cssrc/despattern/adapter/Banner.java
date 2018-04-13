package com.cssrc.despattern.adapter;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-13 9:22
 * @desc
 **/
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("{" + string + "}");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }

}
