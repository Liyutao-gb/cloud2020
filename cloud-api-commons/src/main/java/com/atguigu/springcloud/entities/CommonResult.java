package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liyutao
 * @since 2021/8/1 18:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{

    Integer code;
    String message;
    T data;

    public CommonResult(Integer code, String message)
    {
        this(code, message, null);
    }
}
