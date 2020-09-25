package com.masterpk.lib;



import java.io.IOException;
import java.security.GeneralSecurityException;

public class ApiConnector {

    private static final String protocol = "https://";

    private String url;

    public ApiConnector(String url){
        this.url=url+"/api";
    }

    public String doApiRequest(String path)
    {

    }

}
