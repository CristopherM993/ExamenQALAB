package com.nttdata.glue;

import com.nttdata.steps.CrearOrderPetStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PetStoreStepDef {

    @Steps
    CrearOrderPetStep crearOrderPetStep;

    @Given("que tengo una orden con los siguientes datos {int}, {int} , {int} , {string}, {string}, {string}")
    public void queTengoUnaOrdenConLosSiguientesDatoss(int id, int petId, int quantity, String shipDate, String status, String complete) {
        crearOrderPetStep.crearOrderconlosDatos(id, petId, quantity, shipDate, status, complete);
    }

    @When("envío una solicitud POST con la orden al endpoint")
    public void envíoUnaSolicitudPOSTConLaOrdenAlEndpoint() {
        crearOrderPetStep.solicituddeordenexitosa();
    }

    @Then("la respuesta debería tener un código de estado {int}")
    public void laRespuestaDeberíaTenerUnCódigoDeEstado(int codigorespuesta) {
        crearOrderPetStep.validarCodigoRespuestaa(codigorespuesta);
    }

}
