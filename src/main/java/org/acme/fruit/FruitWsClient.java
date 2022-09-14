package org.acme.fruit;

import io.quarkiverse.cxf.annotation.CXFClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Set;

@ApplicationScoped
public class FruitWsClient {

    @Inject @CXFClient("fruit-ws-client")
    FruitWebService fruitWebService;

    public int getCount() {
        return this.fruitWebService.count();
    }

    public Set<Fruit> getList(){
        return this.fruitWebService.list();
    }
}
