package cn.huntdog.framework.core.web;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by JonDai on 2016/7/6.
 * 定义前台的返回格式
 */
public class JsonResult extends Result{
    /**
     * 返回状态码
     */
    private String webStatus;
    /**
     * 返回单个Model
     */
    private Object model;
    /**
     * 返回Model集合
     */
    private Map<String, List<Object>> listModel;
    /**
     * 返回组合数据
     */
    private Map<String, Map<String,Object>> mapModel;

    public JsonResult(){}

    public String getWebStatus() {
        return webStatus;
    }

    public JsonResult setWebStatus(String webStatus) {
        this.webStatus = webStatus;
        return this;
    }

    public Object getModel() {
        return model;
    }

    public JsonResult setModel(Object model) {
        this.model = model;
        return this;
    }

    public Map<String, List<Object>> getListModel() {
        return listModel;
    }

    public JsonResult setListModel(Map<String, List<Object>> listModel) {
        this.listModel = listModel;
        return this;
    }

    public Map<String, Map<String, Object>> getMapModel() {
        return mapModel;
    }

    public JsonResult setMapModel(Map<String, Map<String, Object>> mapModel) {
        this.mapModel = mapModel;
        return this;
    }
}
