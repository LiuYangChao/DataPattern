package com.cssrc.despattern.adapter;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-13 9:28
 * @desc
 **/
public class Main {

    public static void main(String[] args){
        Print p =new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        com.cssrc.despattern.adapter.delegate.Print pp =
                new com.cssrc.despattern.adapter.delegate.PrintBanner(new Banner("ssss"));
        pp.printStrong();
        pp.printWeak();
    }

}
