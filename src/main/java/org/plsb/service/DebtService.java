package org.plsb.service;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DebtService {
    public void update(){
        Log.info("update debt");
    }
}
