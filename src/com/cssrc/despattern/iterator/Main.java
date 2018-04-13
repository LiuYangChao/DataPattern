package com.cssrc.despattern.iterator;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-12 9:35
 * @desc
 **/
public class Main {

    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("hello liuyangchao1"));
        bookShelf.appendBook(new Book("hello liuyangchao2"));
        bookShelf.appendBook(new Book("hello liuyangchao3"));
        bookShelf.appendBook(new Book("hello liuyangchao4"));

        //对书架进行遍历操作s
        Iterator it = bookShelf.iterators();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }

}
