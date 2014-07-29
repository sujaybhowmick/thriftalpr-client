package com.thriftalpr;

/**
 * Created by sujay on 7/29/14.
 */
public interface AlprClient {
    String getAlprVersion();

    public static class Factory {
       public static AlprClient getInstance(){
           return new ThriftAlprClient();
       }
    }
}
