package cn.ingrun.imam.Utils;

/**
 * @Author: IngRun
 * @Date: 2019/8/2 9:55
 * @Description:  我的自定义异常类
 */
public class MyException extends Exception {
    String msg ;
    public MyException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
