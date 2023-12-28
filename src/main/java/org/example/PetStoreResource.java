package org.example;

import jakarta.ws.rs.core.Response;
import org.example.api.specs.v1.petstore.apis.PetApi;

public class PetStoreResource implements PetApi {
    @Override
    public Response getPetsGreeting() {

        return Response.ok("Hello from Pets").build();
    }
}
