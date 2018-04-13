package com.cssrc.list;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-08 10:09
 * @desc
 **/
public class Node<T> {

    Node<T> next;
    T data;

    public Node(T data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

}
