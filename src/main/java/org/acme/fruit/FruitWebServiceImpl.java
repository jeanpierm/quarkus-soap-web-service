package org.acme.fruit;

import javax.jws.WebService;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@WebService(endpointInterface = "org.acme.fruit.FruitWebService")
public class FruitWebServiceImpl implements FruitWebService {

    private Set<Fruit> fruits = Collections.synchronizedSet(new HashSet<>());

    public FruitWebServiceImpl() {
        fruits.add(new Fruit("Apple", "Winter fruit"));
        fruits.add(new Fruit("Pineapple", "Tropical fruit"));
    }

    @Override
    public Set<Fruit> list() {
        return fruits;
    }

    @Override
    public Set<Fruit> add(Fruit fruit) {
        fruits.add(fruit);
        return fruits;
    }

    @Override
    public Set<Fruit> delete(Fruit fruit) {
        fruits.remove(fruit);
        return fruits;
    }

    @Override
    public int count() {
        return fruits.size();
    }
}
