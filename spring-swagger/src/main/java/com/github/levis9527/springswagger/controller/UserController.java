package com.github.levis9527.springswagger.controller;

import com.github.levis9527.springswagger.dto.UserDto;
import com.sun.xml.internal.ws.wsdl.writer.document.ParamType;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户控制器
 */
@Api(tags = "用户api详情")
@RestController
@RequestMapping("user")
public class UserController {

    @ApiOperation(value = "用户查询", notes = "获取所有用户")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<UserDto> getAllUser() {
        List<UserDto> userList = new ArrayList<>();
        userList.add(new UserDto("张三", 18));
        userList.add(new UserDto("李四", 16));
        userList.add(new UserDto("王五", 25));
        return userList;
    }

    @ApiOperation(value = "插入用户", notes = "插入传入的用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", dataType = "String", paramType = "query")
//            @ApiImplicitParam(name = "userDto", value = "用户信息dto", paramType = "")
    })
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public int insertUser(@RequestBody UserDto userDto, String id) {
        System.out.println("insert ok");
        System.out.println(userDto);
        return 1;
    }

    @ApiImplicitParam(name = "id", value = "用户id")
    @RequestMapping(value = "detail/{id}", method = RequestMethod.GET)
    @ApiResponses({
            @ApiResponse(code = 404, message = "用户不存在"),
            @ApiResponse(code = 403, message = "权限不足"),
            @ApiResponse(code = 401, message = "未登录")
    })
    public UserDto detail(@PathVariable String id) {
        System.out.println(id);
        return new UserDto("刘谦", 30);
    }

}
