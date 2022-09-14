package org.acme.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Set;

@WebService
public interface FruitWebService {

    @WebMethod
    Set<Fruit> list();

    @WebMethod
    Set<Fruit> add(Fruit fruit);

    @WebMethod
    Set<Fruit> delete(Fruit fruit);

    @WebMethod
    int count();
}
