package com.cssrc.despattern.iterator;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-12 9:23
 * @desc
 **/
public class BookShelfItarator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    private BookShelfExam bookShelfExam;

    public BookShelfItarator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public BookShelfItarator(BookShelfExam bookShelfExam){
        this.bookShelfExam = bookShelfExam;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
