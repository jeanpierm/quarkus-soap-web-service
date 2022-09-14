package org.acme.fruit;

import org.acme.cxf.Fruit;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import java.util.Set;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {

    @Inject
    FruitWsClient fruitWsClient;

    @GET
    @Path("/count")
    public Response getCount() {
        Map<String, Integer> response = Map.of("count", fruitWsClient.getCount());
        return Response.ok(response).build();
    }

    @GET
    public Response getFruits() {
        Set<Fruit> fruits = fruitWsClient.getList();
        return Response.ok(fruits).build();
    }
}
