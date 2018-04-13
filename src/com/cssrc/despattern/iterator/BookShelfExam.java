package com.cssrc.despattern.iterator;

import java.util.List;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-12 10:38
 * @desc
 **/
public class BookShelfExam implements Aggregate {

    private List<Book> bookList;

    public Book getBookAt(int index){
        return bookList.get(index);
    }

    public void appendBook(Book book){
        this.bookList.add(book);
    }

    public int getLength(){
        return bookList.size();
    }

    @Override
    public Iterator iterators() {
        return new BookShelfItarator(this);
    }
}
