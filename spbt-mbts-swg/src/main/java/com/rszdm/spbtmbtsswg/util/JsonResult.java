package com.rszdm.spbtmbtsswg.util;

//定义一个json对象，用于返回
public class JsonResult {

    // 先默认一个状态码是失败
    private Integer resultCode = 900;
    private String resultName = "fail";
    private Object result;

    //private  Integer resultCode;
    //private String resultName;

    public JsonResult(){
    }

    public JsonResult(Integer resultCode, String resultName){
        this.resultCode = resultCode;
        this.resultName = resultName;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

}
