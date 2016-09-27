/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mis
 */
@Entity
@Table(name = "assetentries_assetcategories")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "AssetentriesAssetcategories.findAll", query = "SELECT a FROM AssetentriesAssetcategories a"),
	@NamedQuery(name = "AssetentriesAssetcategories.findByEntryid", query = "SELECT a FROM AssetentriesAssetcategories a WHERE a.assetentriesAssetcategoriesPK.entryid = :entryid"),
	@NamedQuery(name = "AssetentriesAssetcategories.findByCategoryid", query = "SELECT a FROM AssetentriesAssetcategories a WHERE a.assetentriesAssetcategoriesPK.categoryid = :categoryid")})
public class AssetentriesAssetcategories implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected AssetentriesAssetcategoriesPK assetentriesAssetcategoriesPK;

	public AssetentriesAssetcategories() {
	}

	public AssetentriesAssetcategories(AssetentriesAssetcategoriesPK assetentriesAssetcategoriesPK) {
		this.assetentriesAssetcategoriesPK = assetentriesAssetcategoriesPK;
	}

	public AssetentriesAssetcategories(long entryid, long categoryid) {
		this.assetentriesAssetcategoriesPK = new AssetentriesAssetcategoriesPK(entryid, categoryid);
	}

	public AssetentriesAssetcategoriesPK getAssetentriesAssetcategoriesPK() {
		return assetentriesAssetcategoriesPK;
	}

	public void setAssetentriesAssetcategoriesPK(AssetentriesAssetcategoriesPK assetentriesAssetcategoriesPK) {
		this.assetentriesAssetcategoriesPK = assetentriesAssetcategoriesPK;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (assetentriesAssetcategoriesPK != null ? assetentriesAssetcategoriesPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof AssetentriesAssetcategories)) {
			return false;
		}
		AssetentriesAssetcategories other = (AssetentriesAssetcategories) object;
		if ((this.assetentriesAssetcategoriesPK == null && other.assetentriesAssetcategoriesPK != null) || (this.assetentriesAssetcategoriesPK != null && !this.assetentriesAssetcategoriesPK.equals(other.assetentriesAssetcategoriesPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.AssetentriesAssetcategories[ assetentriesAssetcategoriesPK=" + assetentriesAssetcategoriesPK + " ]";
	}
	
}
