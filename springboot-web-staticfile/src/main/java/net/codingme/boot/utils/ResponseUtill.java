package net.codingme.boot.utils;

import net.codingme.boot.domain.Response;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:33
 */
public class ResponseUtill {

    public static Response success(Object data) {
        return new Response("0000", "success", data);
    }

    public static Response success() {
        return new Response("0000", "success", null);
    }

    public static Response error(String code, String message) {
        return new Response(code, message, null);
    }
}
