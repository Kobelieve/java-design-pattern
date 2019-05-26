package com.kobe.practice.chain;

/**
 * @ClassName Handler
 * @Description 责任链模式
 *              使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系
 *              将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止
 * @Author Tao
 * @Date 2019-05-26 08:41
 * @Version 1.0
 */
public abstract class Handler {

    private Handler nextHandler;

    /**
     * 每个处理者都必须对请求做出处理
     * @param request
     * @return
     */
    public final Response handleMessage(Request request) {
        Response response = null;
        // 判断是否是自己的处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            // 自行处理任务
            response = this.echo(request);
        } else {
            // 不属于自己的处理级别
            // 判断是否有下一个处理者
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(request);
            } else {
                // 没有适当的处理者，业务自定义

            }
        }
        return response;
    }

    /**
     * 设置下一个处理者是谁
     * @param handler
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 每个处理者都有一个处理级别
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者都必须实现处理任务
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);

}
