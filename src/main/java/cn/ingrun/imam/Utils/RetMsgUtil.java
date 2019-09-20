package cn.ingrun.imam.Utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-06 14:52
 * @Description: 返回数据的格式设置类
 */

public class RetMsgUtil {

    //  1 成功   -1 未知失败   -2 操作数据库失败   -3 权限不足

    public static Map getRetMsg(int code,String msg,Object data){
        Map<String,Object> map = new ConcurrentHashMap<>();
        map.put("code",code);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }

    public static Map getRetMsg(Object data){
        Map<String,Object> map = new ConcurrentHashMap<>();
        if (data == null ){
            map.put("code",0);
            map.put("msg","操作失败！");
        }else{
            map.put("code",1);
            map.put("msg","操作成功！");
        }
        map.put("data",data);
        return map;
    }

    public static Map getRetMsg(int code,Object data){
        String msg = "操作失败！";
        if (code == 1 ){
            msg = "操作成功！";
        }
        Map<String,Object> map = new ConcurrentHashMap<>();
        map.put("code",code);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }

}
