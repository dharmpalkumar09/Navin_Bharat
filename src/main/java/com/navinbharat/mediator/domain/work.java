package com.navinbharat.mediator.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class work {

    @Id
    @GeneratedValue
    private Long Id;
    private Worktype workType;
    private String description;
    private String workLocation;
    private String duration;
    private WorkCategory workCategory;
    private Owner owner;
    private int mandaysEstimation; // number of days work will get finished
    private int costEstimation;
    private Paymentmode paymentmode;
    private  String otherInfo;
    private String landmark;

    @Override
    public String toString() {
        return "work{" +
                "Id=" + Id +
                ", workType=" + workType +
                ", description='" + description + '\'' +
                ", workLocation='" + workLocation + '\'' +
                ", duration='" + duration + '\'' +
                ", workCategory=" + workCategory +
                ", owner=" + owner +
                ", mandaysEstimation=" + mandaysEstimation +
                ", costEstimation=" + costEstimation +
                ", paymentmode=" + paymentmode +
                ", otherInfo='" + otherInfo + '\'' +
                ", landmark='" + landmark + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Worktype getWorkType() {
        return workType;
    }

    public void setWorkType(Worktype workType) {
        this.workType = workType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public WorkCategory getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(WorkCategory workCategory) {
        this.workCategory = workCategory;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getMandaysEstimation() {
        return mandaysEstimation;
    }

    public void setMandaysEstimation(int mandaysEstimation) {
        this.mandaysEstimation = mandaysEstimation;
    }

    public int getCostEstimation() {
        return costEstimation;
    }

    public void setCostEstimation(int costEstimation) {
        this.costEstimation = costEstimation;
    }

    public Paymentmode getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(Paymentmode paymentmode) {
        this.paymentmode = paymentmode;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
