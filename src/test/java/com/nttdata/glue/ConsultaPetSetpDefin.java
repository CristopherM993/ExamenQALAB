package com.nttdata.glue;

import com.nttdata.steps.ConsultaPetStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConsultaPetSetpDefin {

    @Steps
    ConsultaPetStep consulta;

    @Given("la url {string} del la pagina PetStore")
    public void laUrlDelLaPaginaPetStore(String urlpet) {
        consulta.laUrlDelLaPaginaPetStore(urlpet);
    }

    @When("se envía una solicitud GET del ordenId")
    public void seEnvíaUnaSolicitudGETDelOrdenId() {
        consulta.consultaLaOrden();
    }

    @Then("la respuesta debe tener un código de estado {int}")
    public void laRespuestaDebeTenerUnCódigoDeEstado(int statuscode) {
        consulta.RespuestadeEstado(statuscode);
    }
}
