package com.handle.util;

public class MsgBase {

    private int type;

    private int returCode;

    private String returnMsg;


    public int getType() {

        return type;
    }

    public void setType(int type) {

        this.type = type;
    }

    public int getReturCode() {

        return returCode;
    }

    public void setReturCode(int returCode) {

        this.returCode = returCode;
    }

    public String getReturnMsg() {

        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {

        this.returnMsg = returnMsg;
    }

}
