/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;
import model.AssetentriesAssetcategories;
import model.AssetentriesAssetcategoriesPK;

/**
 *
 * @author mis
 */
@Stateless
@Path("model.assetentriesassetcategories")
public class AssetentriesAssetcategoriesFacadeREST extends AbstractFacade<AssetentriesAssetcategories> {
	@PersistenceContext(unitName = "zoom15PU")
	private EntityManager em;

	private AssetentriesAssetcategoriesPK getPrimaryKey(PathSegment pathSegment) {
		/*
		 * pathSemgent represents a URI path segment and any associated matrix parameters.
		 * URI path part is supposed to be in form of 'somePath;entryid=entryidValue;categoryid=categoryidValue'.
		 * Here 'somePath' is a result of getPath() method invocation and
		 * it is ignored in the following code.
		 * Matrix parameters are used as field names to build a primary key instance.
		 */
		model.AssetentriesAssetcategoriesPK key = new model.AssetentriesAssetcategoriesPK();
		javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
		java.util.List<String> entryid = map.get("entryid");
		if (entryid != null && !entryid.isEmpty()) {
			key.setEntryid(new java.lang.Long(entryid.get(0)));
		}
		java.util.List<String> categoryid = map.get("categoryid");
		if (categoryid != null && !categoryid.isEmpty()) {
			key.setCategoryid(new java.lang.Long(categoryid.get(0)));
		}
		return key;
	}

	public AssetentriesAssetcategoriesFacadeREST() {
		super(AssetentriesAssetcategories.class);
	}

	@POST
    @Override
    @Consumes({"application/xml", "application/json"})
	public void create(AssetentriesAssetcategories entity) {
		super.create(entity);
	}

	@PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
	public void edit(@PathParam("id") PathSegment id, AssetentriesAssetcategories entity) {
		super.edit(entity);
	}

	@DELETE
    @Path("{id}")
	public void remove(@PathParam("id") PathSegment id) {
		model.AssetentriesAssetcategoriesPK key = getPrimaryKey(id);
		super.remove(super.find(key));
	}

	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
	public AssetentriesAssetcategories find(@PathParam("id") PathSegment id) {
		model.AssetentriesAssetcategoriesPK key = getPrimaryKey(id);
		return super.find(key);
	}

	@GET
    @Override
    @Produces({"application/xml", "application/json"})
	public List<AssetentriesAssetcategories> findAll() {
		return super.findAll();
	}

	@GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
	public List<AssetentriesAssetcategories> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
		return super.findRange(new int[]{from, to});
	}

	@GET
    @Path("count")
    @Produces("text/plain")
	public String countREST() {
		return String.valueOf(super.count());
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
}
