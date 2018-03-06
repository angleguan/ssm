package com.example.controller;

import com.example.service.IStuuserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LiQian_Nice on 2018/2/19
 */
@RequestMapping("stuuser")
@Controller
@Api(value = "学生管理接口",tags = {"学生管理接口"},description = "学生管理接口")
public class StuuserController {

    private static Logger logger= LoggerFactory.getLogger(StucourseController.class);

    @Autowired
    private IStuuserService stuuserService;

}
