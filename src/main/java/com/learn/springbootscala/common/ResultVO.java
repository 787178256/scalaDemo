package com.learn.springbootscala.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by kimvra on 2019-04-15
 */
@Data
public class ResultVO<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public static <T> ResultVO success(T data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(data);
        resultVO.setMessage("success");
        return resultVO;
    }

    public static <T> ResultVO success() {
        return success(null);
    }

    public static <T> ResultVO fail(Integer code, String message) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMessage(message);
        return resultVO;
    }
}
