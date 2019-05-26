package com.kobe.practice.chain;

/**
 * @ClassName ConcreteHandler1
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-26 09:01
 * @Version 1.0
 */
public class ConcreteHandler2 extends Handler {

    /**
     * 设置自己的处理级别
     * @return
     */
    protected Level getHandlerLevel() {
        // 设置自己的处理级别
        return null;
    }

    /**
     * 完成自己的处理逻辑
     * @param request
     * @return
     */
    protected Response echo(Request request) {
        // 完成处理逻辑
        return null;
    }
}
