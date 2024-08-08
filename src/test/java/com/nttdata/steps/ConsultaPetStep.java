package com.nttdata.steps;

import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ConsultaPetStep {

    private static String _URL = null;
    Response response;

    public void laUrlDelLaPaginaPetStore(String urlpet) {
        _URL = urlpet;
    }

    public void consultaLaOrden() {

        response =
                (Response) given()
                        .contentType("application/json")
                        .log()
                        .all()
                        .get(_URL + "/store/order/1")
                        .then()
                        .log()
                        .all()
                        .extract().response();
        ;
    }

    public void RespuestadeEstado(int statuscode) {
        Assert.assertEquals(statuscode, 200);
    }
}
