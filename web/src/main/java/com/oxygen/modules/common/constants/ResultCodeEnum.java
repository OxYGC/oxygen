package com.oxygen.modules.common.constants;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * @Author: Yanggc
 * Time: 16:46
 */

@Getter
public enum ResultCodeEnum {
    SUCCESS(true, 20000, "成功"),
    UNKNOWN_ERROR(false, 20001, "未知错误"),
    PARAM_ERROR(false, 20002, "参数错误"),
    NULL_POINTER(false,20003,"空指针异常"),

    ;


    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }


}
