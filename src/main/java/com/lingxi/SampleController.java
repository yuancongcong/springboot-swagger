package com.lingxi;

import io.swagger.annotations.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;




/**
 * 测试示例
 *
 * @author yinshipeng
 */
@RestController
@Api("测试示例api")
@RequestMapping("/api")
public class SampleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @ApiOperation("测试-获取欢迎信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="name",dataType="String",required=true,value="名称",defaultValue="World"),
    })
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
