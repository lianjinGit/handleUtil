package com.handle.util.request;

import com.handle.util.MsgBase;
import com.handle.util.RequestResponseCodeMapping;
import com.handle.util.domin.User;

public class RegisterRequest extends MsgBase {

    public RegisterRequest() {
        this.setType(RequestResponseCodeMapping.REGISTER_REQUESTCODE);
    }
    private User user;

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

}
