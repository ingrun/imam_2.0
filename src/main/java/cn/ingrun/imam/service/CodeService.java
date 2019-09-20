package cn.ingrun.imam.service;

import cn.ingrun.imam.domain.Code;

import java.util.Map;

/**
 * @Author: IngRun
 * @Date: 2019/8/21 10:20
 * @Description:
 */
public interface CodeService {

    Code getCodeByid(int id);

    Map getUserCode();

    Map getCodeInfoByid(int id);

    Map addCode(Code code);

    Map delCode(int id);

    Map updCode(Code code);


}
