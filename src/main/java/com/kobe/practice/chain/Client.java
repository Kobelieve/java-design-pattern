package com.kobe.practice.chain;

/**
 * @ClassName Client
 * @Description 场景类
 * @Author Tao
 * @Date 2019-05-26 09:03
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        // 设置链中的阶段顺序1->2->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        // 提交请求，返回处理结果
        Response response = handler1.handleMessage(new Request());
    }

}
