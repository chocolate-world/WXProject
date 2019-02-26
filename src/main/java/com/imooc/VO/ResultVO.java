package com.imooc.VO;

import lombok.Data;

/**
 * 描述
 * Create By Chocolate
 * 2019/2/26 0026
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
