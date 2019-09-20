package cn.ingrun.imam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: IngRun
 * @Date: 2019/8/21 15:22
 * @Description:
 */
@RestController
public class OtherController {

    @GetMapping
    public Map rollBack(){
        return null;
    }

}
