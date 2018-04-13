package com.cssrc.despattern.iterator;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-12 9:07
 * @desc
 **/
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterators() {
        return new BookShelfItarator(this);
    }
}
