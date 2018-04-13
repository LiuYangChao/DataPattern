package com.cssrc.list;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-04-08 10:09
 * @desc    链表结构
 **/
public class LinkedList<T> {

    private Node<T> head;       //表头
    private int size;

    public LinkedList(){
        head = new Node<T>(null);
    }

    public Node<T> getHead(){
        return head;
    }

    public Node<T> add(T data) throws Exception {
        return add(data, size);
    }

    /**
     * 链表的末尾处插入一个节点
     * @param node
     */
    public void add(Node<T> node){
        Node<T> cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        while (node != null){
            size++;
            //有两种情况，1，单独节点，这个时候.next就是null，
            // 2，一个链表的起始位置，这个时候next就是下个节点
            node = node.next;
        }
    }

    public Node<T> add(T data, int index) throws Exception {
        if(index > size){
            throw new Exception("超过链表范围");
        }
        Node<T> cur = head;
        for(int i=0; i<index; i++){
            cur = cur.next;
        }
        Node<T> node = new Node<T>(data);
        cur.next = node;
        size++;
        return node;
    }

    public void print(){
        Node<T> cur = head.next;
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }



    public static void main(String[] agrs){
        LinkedList<String> testList = new LinkedList<>();
        testList.print();
    }

}
