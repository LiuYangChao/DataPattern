package com.cssrc.despattern.adapter;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-13 9:26
 * @desc
 **/
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
