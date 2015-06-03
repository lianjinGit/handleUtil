package com.handle.util.response;

import com.handle.util.MsgBase;
import com.handle.util.RequestResponseCodeMapping;
import com.handle.util.domin.User;

public class LonginResponse extends MsgBase {

    public LonginResponse() {
        this.setType(RequestResponseCodeMapping.LOGIN_RESPONSECODE);
    }

    private User user;

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

}
