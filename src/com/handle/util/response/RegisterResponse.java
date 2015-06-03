package com.handle.util.response;

import com.handle.util.MsgBase;
import com.handle.util.RequestResponseCodeMapping;
import com.handle.util.domin.User;

public class RegisterResponse extends MsgBase {

    public RegisterResponse() {
        this.setType(RequestResponseCodeMapping.REGISTER_RESPONSECODE);
    }

    private User user;

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

}
