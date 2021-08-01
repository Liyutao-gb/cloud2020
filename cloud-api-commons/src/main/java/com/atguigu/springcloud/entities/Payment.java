package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liyutao
 * @since 2021/8/1 18:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    Long id;
    String serial;
}
