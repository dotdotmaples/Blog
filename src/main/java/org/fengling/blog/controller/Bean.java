package org.fengling.blog.controller;

import java.util.Map;

/**
 * @author 枫铃也
 * @description
 * @since 2019-11-27 14:40
 */
public class Bean {

    private boolean success;
    private String message;
    private Map<String, Long> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Long> getData() {
        return data;
    }

    public void setData(Map<String, Long> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
