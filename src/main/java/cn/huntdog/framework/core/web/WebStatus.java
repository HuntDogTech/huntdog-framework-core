package cn.huntdog.framework.core.web;

/**
 * Created by JonDai on 2016/7/6.
 * 状态描述
 */
public class WebStatus {
    /**
     * 成功处理请求
     */
    public static final String STATUS_SUCCESS = "200";
    /**
     * 请求成功，且已经成功创建新的资源
     */
    public static final String STATUS_SUCCESS_SAVE = "201";
    /**
     * 请求成功，且已经成功更新资源
     */
    public static final String STATUS_SUCCESS_UPDATE = "202";
    /**
     * 请求成功，且已经成功删除该资源
     */
    public static final String STATUS_SUCCESS_DELETE = "203";
    /**
     * 请求为找到该资源
     */
    public static final String STATUS_NOT_FOUND = "404";
    /**
     * 求情服务器端错误
     */
    public static final String STATUS_EXCEPTION = "500";
}
