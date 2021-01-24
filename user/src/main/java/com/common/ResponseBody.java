package com.common;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResponseBody<T> {
    private int code;
    private T data;

    public ResponseBody(int code) {
        this.code = code;
    }

    public ResponseBody(int code, T data) {
        this.code = code;
        this.data = data;
    }


    public static <V> ResponseBody success(int code) {
        return new ResponseBody(code);
    }

    public static <V> ResponseBody<V> success(V data) {
        return new ResponseBody<V>(200, data);
    }

    public static <V> ResponseBody<V> success(int code, V data) {
        return new ResponseBody<V>(code, data);
    }

    public static <V> ResponseBody<V> err(int code, V data) {
        return new ResponseBody<V>(code, data);
    }

}
