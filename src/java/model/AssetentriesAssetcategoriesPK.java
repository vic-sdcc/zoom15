/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mis
 */
@Embeddable
public class AssetentriesAssetcategoriesPK implements Serializable {
	@Basic(optional = false)
    @NotNull
    @Column(name = "entryid")
	private long entryid;
	@Basic(optional = false)
    @NotNull
    @Column(name = "categoryid")
	private long categoryid;

	public AssetentriesAssetcategoriesPK() {
	}

	public AssetentriesAssetcategoriesPK(long entryid, long categoryid) {
		this.entryid = entryid;
		this.categoryid = categoryid;
	}

	public long getEntryid() {
		return entryid;
	}

	public void setEntryid(long entryid) {
		this.entryid = entryid;
	}

	public long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) entryid;
		hash += (int) categoryid;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof AssetentriesAssetcategoriesPK)) {
			return false;
		}
		AssetentriesAssetcategoriesPK other = (AssetentriesAssetcategoriesPK) object;
		if (this.entryid != other.entryid) {
			return false;
		}
		if (this.categoryid != other.categoryid) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.AssetentriesAssetcategoriesPK[ entryid=" + entryid + ", categoryid=" + categoryid + " ]";
	}
	
}
