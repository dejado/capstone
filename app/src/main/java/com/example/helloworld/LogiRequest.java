package com.example.helloworld;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LogiRequest extends StringRequest {

    //서버 URL 설정(php 파일 연동)
    final static private String URL = "joan3343.dothome.co.kr/LOgi.php";
    private Map<String, String> map;

    public LogiRequest(String UserEmail, String UserPwd, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("UserEmail", UserEmail);
        map.put("UserPwd", UserPwd);
    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}
