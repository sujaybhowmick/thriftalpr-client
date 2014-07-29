package com.thriftalpr;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created by sujay on 7/29/14.
 */
public class ThriftAlprClient implements AlprClient{

    @Override
    public String getAlprVersion() {
        String version = "";
        TTransport transport = null;
        try {

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);

            AlprService.Client client = new AlprService.Client(protocol);

            version = client.getVersion();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            transport.close();
        }
        return version;
    }
}
