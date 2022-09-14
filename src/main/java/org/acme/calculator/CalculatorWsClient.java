package org.acme.calculator;

import io.quarkiverse.cxf.annotation.CXFClient;
import org.acme.cxf.FruitWebService;
import org.tempuri.CalculatorSoap;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class CalculatorWsClient {

    @Inject @CXFClient("calculator-ws-client")
    CalculatorSoap calculatorService;

    public int add(int a, int b) {
        return calculatorService.add(a, b);
    }
}
