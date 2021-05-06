package com.github.levis9527.springswagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户DTO")
public class UserDto {

    @ApiModelProperty(value = "姓名", required = true)
    private String name;
    @ApiModelProperty(value = "年龄", required = true)
    private Integer age;

    public UserDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public UserDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
