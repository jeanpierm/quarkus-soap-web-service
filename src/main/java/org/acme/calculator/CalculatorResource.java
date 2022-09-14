package org.acme.calculator;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/calculator")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CalculatorResource {

    @Inject
    CalculatorWsClient calculatorWsClient;

    @GET
    @Path("/add/{num1}/{num2}")
    public Response add(@PathParam(value = "num1") int num1, @PathParam(value = "num2") int num2) {
        int result = calculatorWsClient.add(num1, num2);
        return Response.ok(Map.of("result", result)).build();
    }
}
