package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CrearOrderPetStep {

    private static String CREATE_ORDER = "https://petstore.swagger.io/v2/store/order";

    public void crearOrderconlosDatos(int id, int petId, int quantity,
                                      String shipDate, String status, String complete) {

        SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "  \"id\": " + id + ",\n" +
                        "  \"petId\": \"" + petId + "\",\n" +
                        "  \"quantity\": \"" + quantity + "\",\n" +
                        "  \"shipDate\": \"" + shipDate + "\",\n" +
                        "  \"status\": \"" + status + ",\n" +
                        "  \"complete\": \"" + complete + ",\n" +
                        "}")
                .log().all()
                .post(CREATE_ORDER)
                .then()
                .log().all()
        ;
    }

    public void solicituddeordenexitosa() {
        System.out.println("Envio de solicitud exitosa");
    }

    public void validarCodigoRespuestaa(int codigorespuesta) {
        Assert.assertEquals(codigorespuesta, 200);
    }

}
