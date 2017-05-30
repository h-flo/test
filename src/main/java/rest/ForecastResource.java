/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import entity.TempData;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hef46464
 */

@Path("forecast")
public class ForecastResource {
    
    
    @GET
    @Path("region/{zip}")
    @Produces(MediaType.APPLICATION_XML)
    public TempData getData(@PathParam("zip") int zip) {
        System.out.println("Zip Code erhalten");
        return new TempData(31.2, 55.3, "C");
    }
    
    @GET
    @Path("region/{lon}/{lat}")
    @Produces(MediaType.APPLICATION_XML)
    public TempData getData(@PathParam("lon") String lon, @PathParam("lat") String lat) {
        return new TempData(31.2, 55.3, "C");
    }
    
    
    
}
