/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import model.CoopOrgUnit;
import model.CoopProsReport;
import model.CoopProspect;
import model.CoopReport;
import service.CoopOrgUnitFacadeREST;
import service.CoopProsReportFacadeREST;
import service.CoopProspectFacadeREST;
import service.CoopReportFacadeREST;

/**
 *
 * @author mis
 */
@ManagedBean
@SessionScoped
public class RecommendationBean {

    @PersistenceUnit
    EntityManagerFactory emf;

    @EJB
    private CoopProspectFacadeREST coopProspectFacadeREST;
    private CoopProspect selectedProspect;
    private CoopProspect prospect = new CoopProspect();
    private List<CoopProspect> prospectList;
    private DataModel<CoopProspect> prospectModel;

    @EJB
    private CoopOrgUnitFacadeREST coopOrgUnitFacadeREST;
    private CoopOrgUnit selectedOrgUnit;
    private CoopOrgUnit orgUnit = new CoopOrgUnit();
    private List<CoopOrgUnit> orgUnitList;
    private DataModel<CoopOrgUnit> orgUnitModel;

    @EJB
    private CoopReportFacadeREST coopReportFacadeREST;
    private CoopReport selectedReport;
    private CoopReport report = new CoopReport();
    private List<CoopReport> reportList;
    private DataModel<CoopReport> reportModel;

    @EJB
    private CoopProsReportFacadeREST coopProsReportFacadeREST;
    private CoopProsReport selectedProsReport;
    private CoopProsReport prosReport = new CoopProsReport();
    private List<CoopProsReport> prosReportList;
    private DataModel<CoopProsReport> prosReportModel;

    public void init() {
        prospectList = coopProspectFacadeREST.findAll();
        orgUnitList = coopOrgUnitFacadeREST.findAll();
        reportList = coopReportFacadeREST.findAll();
        prosReportList = coopProsReportFacadeREST.findAll();
    }

    public void beanclear() {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("recommendationBean", null);
    }

    /**
     * Creates a new instance of RecommendationBean
     */
    public RecommendationBean() {
    }

    public CoopProspectFacadeREST getCoopProspectFacadeREST() {
        return coopProspectFacadeREST;
    }

    public void setCoopProspectFacadeREST(CoopProspectFacadeREST coopProspectFacadeREST) {
        this.coopProspectFacadeREST = coopProspectFacadeREST;
    }

    public CoopProspect getSelectedProspect() {
        return selectedProspect;
    }

    public void setSelectedProspect(CoopProspect selectedProspect) {
        this.selectedProspect = selectedProspect;
    }

    public CoopProspect getProspect() {
        return prospect;
    }

    public void setProspect(CoopProspect prospect) {
        this.prospect = prospect;
    }

    public List<CoopProspect> getProspectList() {
        return prospectList;
    }

    public void setProspectList(List<CoopProspect> prospectList) {
        this.prospectList = prospectList;
    }

    public DataModel<CoopProspect> getProspectModel() {
        return prospectModel;
    }

    public void setProspectModel(DataModel<CoopProspect> prospectModel) {
        this.prospectModel = prospectModel;
    }

    public CoopOrgUnitFacadeREST getCoopOrgUnitFacadeREST() {
        return coopOrgUnitFacadeREST;
    }

    public void setCoopOrgUnitFacadeREST(CoopOrgUnitFacadeREST coopOrgUnitFacadeREST) {
        this.coopOrgUnitFacadeREST = coopOrgUnitFacadeREST;
    }

    public CoopOrgUnit getSelectedOrgUnit() {
        return selectedOrgUnit;
    }

    public void setSelectedOrgUnit(CoopOrgUnit selectedOrgUnit) {
        this.selectedOrgUnit = selectedOrgUnit;
    }

    public CoopOrgUnit getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(CoopOrgUnit orgUnit) {
        this.orgUnit = orgUnit;
    }

    public List<CoopOrgUnit> getOrgUnitList() {
        return orgUnitList;
    }

    public void setOrgUnitList(List<CoopOrgUnit> orgUnitList) {
        this.orgUnitList = orgUnitList;
    }

    public DataModel<CoopOrgUnit> getOrgUnitModel() {
        return orgUnitModel;
    }

    public void setOrgUnitModel(DataModel<CoopOrgUnit> orgUnitModel) {
        this.orgUnitModel = orgUnitModel;
    }

    public CoopReportFacadeREST getCoopReportFacadeREST() {
        return coopReportFacadeREST;
    }

    public void setCoopReportFacadeREST(CoopReportFacadeREST coopReportFacadeREST) {
        this.coopReportFacadeREST = coopReportFacadeREST;
    }

    public CoopReport getSelectedReport() {
        return selectedReport;
    }

    public void setSelectedReport(CoopReport selectedReport) {
        this.selectedReport = selectedReport;
    }

    public CoopReport getReport() {
        return report;
    }

    public void setReport(CoopReport report) {
        this.report = report;
    }

    public List<CoopReport> getReportList() {
        return reportList;
    }

    public void setReportList(List<CoopReport> reportList) {
        this.reportList = reportList;
    }

    public DataModel<CoopReport> getReportModel() {
        return reportModel;
    }

    public void setReportModel(DataModel<CoopReport> reportModel) {
        this.reportModel = reportModel;
    }

    public CoopProsReportFacadeREST getCoopProsReportFacadeREST() {
        return coopProsReportFacadeREST;
    }

    public void setCoopProsReportFacadeREST(CoopProsReportFacadeREST coopProsReportFacadeREST) {
        this.coopProsReportFacadeREST = coopProsReportFacadeREST;
    }

    public CoopProsReport getSelectedProsReport() {
        return selectedProsReport;
    }

    public void setSelectedProsReport(CoopProsReport selectedProsReport) {
        this.selectedProsReport = selectedProsReport;
    }

    public CoopProsReport getProsReport() {
        return prosReport;
    }

    public void setProsReport(CoopProsReport prosReport) {
        this.prosReport = prosReport;
    }

    public List<CoopProsReport> getProsReportList() {
        return prosReportList;
    }

    public void setProsReportList(List<CoopProsReport> prosReportList) {
        this.prosReportList = prosReportList;
    }

    public DataModel<CoopProsReport> getProsReportModel() {
        return prosReportModel;
    }

    public void setProsReportModel(DataModel<CoopProsReport> prosReportModel) {
        this.prosReportModel = prosReportModel;
    }

    public Date getD() {
        return new Date();
    }

    public static String formatDate(Date currentDate) {
        DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");
        return dateFormat.format(currentDate);
    }

    public void saveToReport() {
        report.setReportDtl(report.getReportDtl());
        report.setReportDateFrom(report.getReportDateFrom());
        report.setReportDateTo(report.getReportDateTo());
        report.setReportDateEncoded(report.getReportDateEncoded());
        report.setReportTypeCode(report.getReportTypeCode());
        report.setReportNum(report.getReportNum());
        report.setOuCode(orgUnit);
        report.setMemNo(report.getMemNo());
    }

    public void saveToProsReport() {
        prosReport.setProspectNo(selectedProspect);
        prosReport.setReportNum(report);
    }

    public String saveRecommendation() {
        saveToReport();
        coopReportFacadeREST.create(report);
        saveToProsReport();
        coopProsReportFacadeREST.create(prosReport);

        report = new CoopReport();
        prosReport = new CoopProsReport();

        beanclear();
        return "viewRecommendation";
    }

}
