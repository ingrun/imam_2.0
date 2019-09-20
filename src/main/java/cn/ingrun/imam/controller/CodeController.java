package cn.ingrun.imam.controller;

import cn.ingrun.imam.domain.Code;
import cn.ingrun.imam.service.CodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: IngRun
 * @Date: 2019/8/21 10:28
 * @Description:
 */
@RestController
public class CodeController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    CodeService codeService;

    @GetMapping("api/getUserCode")
    public Map getUserCode(){
        logger.info("api/getUserCode");
        return codeService.getUserCode();
    }

    @GetMapping("api/getCodeInfoByid")
    public Map getCodeInfoByid(int id){
        logger.info("api/getCodeInfoByid");
        return codeService.getCodeInfoByid(id);
    }

    @GetMapping("api/delCode")
    public Map delCode(int id){
        logger.info("api/delCode");
        return codeService.delCode(id);
    }

    @PostMapping("api/addCode")
    public Map addCode(@RequestBody Code code){
        logger.info("api/addCode");
        return codeService.addCode(code);
    }

    @PostMapping("api/updCode")
    public Map updCode(@RequestBody Code code){
        logger.info("api/updCode");
        return codeService.updCode(code);
    }


}
