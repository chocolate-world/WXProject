package com.imooc.enums;

import lombok.Getter;

/**
 * 描述
 * Create By Chocolate
 * 2019/2/27 0027
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
