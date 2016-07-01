package com.ofpay.dubbo.rpc.protocol.jsonrpc;

/**
 * JsonRpcServiceImpl
 * Created by wuwen on 15/4/1.
 */
public class JsonRpcServiceImpl implements JsonRpcService {
    private boolean called;

    public String sayHello(String name) {
        called = true;
        return "Hello, " + name;
    }

    public boolean isCalled() {
        return called;
    }

    public void timeOut(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String customException() {
        throw new MyException("custom exception");
    }

    static class MyException extends RuntimeException{

        private static final long serialVersionUID = -3051041116483629056L;

        public MyException(String message) {
            super(message);
        }
    }
}
