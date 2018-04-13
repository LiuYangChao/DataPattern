package com.cssrc.despattern.adapter.delegate;

import com.cssrc.despattern.adapter.Banner;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-13 9:42
 * @desc
 **/
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithAster();
    }

    @Override
    public void printStrong() {
        banner.showWithParen();
    }
}
