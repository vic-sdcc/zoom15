/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mis
 */
@Entity
@Table(name = "coop_pros_repver")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "CoopProsRepver.findAll", query = "SELECT c FROM CoopProsRepver c"),
	@NamedQuery(name = "CoopProsRepver.findByVerDate", query = "SELECT c FROM CoopProsRepver c WHERE c.verDate = :verDate"),
	@NamedQuery(name = "CoopProsRepver.findByReportDtl", query = "SELECT c FROM CoopProsRepver c WHERE c.reportDtl = :reportDtl"),
	@NamedQuery(name = "CoopProsRepver.findByRepVerLogno", query = "SELECT c FROM CoopProsRepver c WHERE c.repVerLogno = :repVerLogno"),
	@NamedQuery(name = "CoopProsRepver.findByGroupVerNo", query = "SELECT c FROM CoopProsRepver c WHERE c.groupVerNo = :groupVerNo")})
public class CoopProsRepver implements Serializable {
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @NotNull
    @Column(name = "ver_date")
    @Temporal(TemporalType.DATE)
	private Date verDate;
	@Size(max = 2147483647)
    @Column(name = "report_dtl")
	private String reportDtl;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rep_ver_logno")
	private Integer repVerLogno;
	@Size(max = 10)
    @Column(name = "group_ver_no")
	private String groupVerNo;
	@JoinColumn(name = "pros_rep_num", referencedColumnName = "pros_rep_num")
    @ManyToOne
	private CoopProsReport prosRepNum;
	@JoinColumn(name = "user_num", referencedColumnName = "mem_no")
    @ManyToOne(optional = false)
	private CoopMember userNum;

	public CoopProsRepver() {
	}

	public CoopProsRepver(Integer repVerLogno) {
		this.repVerLogno = repVerLogno;
	}

	public CoopProsRepver(Integer repVerLogno, Date verDate) {
		this.repVerLogno = repVerLogno;
		this.verDate = verDate;
	}

	public Date getVerDate() {
		return verDate;
	}

	public void setVerDate(Date verDate) {
		this.verDate = verDate;
	}

	public String getReportDtl() {
		return reportDtl;
	}

	public void setReportDtl(String reportDtl) {
		this.reportDtl = reportDtl;
	}

	public Integer getRepVerLogno() {
		return repVerLogno;
	}

	public void setRepVerLogno(Integer repVerLogno) {
		this.repVerLogno = repVerLogno;
	}

	public String getGroupVerNo() {
		return groupVerNo;
	}

	public void setGroupVerNo(String groupVerNo) {
		this.groupVerNo = groupVerNo;
	}

	public CoopProsReport getProsRepNum() {
		return prosRepNum;
	}

	public void setProsRepNum(CoopProsReport prosRepNum) {
		this.prosRepNum = prosRepNum;
	}

	public CoopMember getUserNum() {
		return userNum;
	}

	public void setUserNum(CoopMember userNum) {
		this.userNum = userNum;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (repVerLogno != null ? repVerLogno.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CoopProsRepver)) {
			return false;
		}
		CoopProsRepver other = (CoopProsRepver) object;
		if ((this.repVerLogno == null && other.repVerLogno != null) || (this.repVerLogno != null && !this.repVerLogno.equals(other.repVerLogno))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.CoopProsRepver[ repVerLogno=" + repVerLogno + " ]";
	}
	
}
