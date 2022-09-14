package org.acme.calculator;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculator")
public class CalculatorResource {


    @Inject
    CalculatorWsClient calculatorWsClient;

    @GET
    @Path("/add/{num1}/{num2}")
    public Response add(@PathParam(value = "num1") int num1, @PathParam(value = "num2") int num2) {
        int result = calculatorWsClient.add(num1, num2);
        return Response.ok(result).build();
    }
}
