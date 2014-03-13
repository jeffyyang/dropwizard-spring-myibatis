// Copyright (c) 2012 Health Market Science, Inc.

package com.zlgame.wxos.gamestore.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
    
    private Object message;

    @GET
    @Path("/world")
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello(){
        return this.message;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
    
    
}
