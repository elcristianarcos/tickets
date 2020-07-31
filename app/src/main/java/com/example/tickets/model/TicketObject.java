package com.example.tickets.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketObject {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("descrption")
    @Expose
    private String descrption;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("callID")
    @Expose
    private String callID;
    @SerializedName("problemTyp")
    @Expose
    private String problemTyp;
    @SerializedName("U_TipoAtencion")
    @Expose
    private String uTipoAtencion;
    @SerializedName("U_Ciudad")
    @Expose
    private String uCiudad;
    @SerializedName("custmrName")
    @Expose
    private String custmrName;
    @SerializedName("customer")
    @Expose
    private String customer;
    @SerializedName("U_Direccion")
    @Expose
    private String uDireccion;
    @SerializedName("U_Region")
    @Expose
    private String uRegion;
    @SerializedName("U_Contacto")
    @Expose
    private String uContacto;
    @SerializedName("U_Fono")
    @Expose
    private String uFono;
    @SerializedName("U_Fax")
    @Expose
    private String uFax;
    @SerializedName("itemName")
    @Expose
    private String itemName;
    @SerializedName("internalSN")
    @Expose
    private String internalSN;
    @SerializedName("U_NPedido")
    @Expose
    private String uNPedido;
    @SerializedName("assignee")
    @Expose
    private String assignee;
    @SerializedName("U_Marca")
    @Expose
    private String uMarca;
    @SerializedName("U_Comuna")
    @Expose
    private String uComuna;
    @SerializedName("contractID")
    @Expose
    private String contractID;
    @SerializedName("U_Horas_Cubrir")
    @Expose
    private String uHorasCubrir;
    @SerializedName("Usuario")
    @Expose
    private String usuario;
    @SerializedName("ItemCode")
    @Expose
    private String itemCode;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCallID() {
        return callID;
    }

    public void setCallID(String callID) {
        this.callID = callID;
    }

    public String getProblemTyp() {
        return problemTyp;
    }

    public void setProblemTyp(String problemTyp) {
        this.problemTyp = problemTyp;
    }

    public String getUTipoAtencion() {
        return uTipoAtencion;
    }

    public void setUTipoAtencion(String uTipoAtencion) {
        this.uTipoAtencion = uTipoAtencion;
    }

    public String getUCiudad() {
        return uCiudad;
    }

    public void setUCiudad(String uCiudad) {
        this.uCiudad = uCiudad;
    }

    public String getCustmrName() {
        return custmrName;
    }

    public void setCustmrName(String custmrName) {
        this.custmrName = custmrName;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getUDireccion() {
        return uDireccion;
    }

    public void setUDireccion(String uDireccion) {
        this.uDireccion = uDireccion;
    }

    public String getURegion() {
        return uRegion;
    }

    public void setURegion(String uRegion) {
        this.uRegion = uRegion;
    }

    public String getUContacto() {
        return uContacto;
    }

    public void setUContacto(String uContacto) {
        this.uContacto = uContacto;
    }

    public String getUFono() {
        return uFono;
    }

    public void setUFono(String uFono) {
        this.uFono = uFono;
    }

    public String getUFax() {
        return uFax;
    }

    public void setUFax(String uFax) {
        this.uFax = uFax;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getInternalSN() {
        return internalSN;
    }

    public void setInternalSN(String internalSN) {
        this.internalSN = internalSN;
    }

    public String getUNPedido() {
        return uNPedido;
    }

    public void setUNPedido(String uNPedido) {
        this.uNPedido = uNPedido;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getUMarca() {
        return uMarca;
    }

    public void setUMarca(String uMarca) {
        this.uMarca = uMarca;
    }

    public String getUComuna() {
        return uComuna;
    }

    public void setUComuna(String uComuna) {
        this.uComuna = uComuna;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getUHorasCubrir() {
        return uHorasCubrir;
    }

    public void setUHorasCubrir(String uHorasCubrir) {
        this.uHorasCubrir = uHorasCubrir;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
