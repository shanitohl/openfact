package org.openfact.services.resources.admin;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.DireccionRegionalRepresentation;

/**
 * @author carlosthe19916@gmail.com
 */
@Path("direccionesRegionales")
@Consumes(MediaType.APPLICATION_JSON)
public interface DireccionesRegionalesResource {

    /**
     * @param idDireccionRegional
     *            El ID de DireccionRegional.
     */
    @Path("{idDireccionRegional}")
    public DireccionRegionalResource direccionRegional(
            @PathParam("idDireccionRegional") String idDireccionRegional);

    /**
     * Use este endpoint para crear una direccionRegional. Una direccion
     * regional es una unidad del Gobierno regional.
     * 
     * @summary Create DireccionRegional
     * @param rep
     *            La nueva direccionRegional.
     * @statuscode 200 Si la direccionRegional fue creada satisfactoriamente.
     * @return Informacion acerca de la direccionRegional creada.
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(DireccionRegionalRepresentation rep);

    /**
     * Este endpoint lista todas las direccionesRegionales que existen en el
     * sistema.
     * 
     * @summary List all direccionesRegionales
     * @statuscode 200 Si la lista de direccionesRegionales fue retornada
     *             satisfactoriamente.
     * @return Una Lista de direccionesRegionales.
     */
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<DireccionRegionalRepresentation> getAll();

    /**
     * Este endpoint provee una forma de buscar direccionesRegionales. Los
     * criterios de busqueda estan definidos por los parametros enviados.
     * 
     * @summary Search for DireccionesRegionales
     * @param criteria
     *            Criterio de busqueda.
     * @statuscode 200 Si la busqueda fue realizada satisfactoriamente.
     * @return Los resultados de la busqueda (una pagina de
     *         direccionesRegionales).
     */
    /*@POST
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    public SearchResultsRepresentation<DireccionRegionalRepresentation> search(
            SearchCriteriaRepresentation criteria);*/

}
