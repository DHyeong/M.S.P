package com.example.md_exam.dto;

import java.time.LocalDate;

public class MedicineDto {

    private int medId;
    private String medName;
    private String medDis;
    private String medEff;
    private String medType;
    private String medStore;
    private String medCom;
    private String medAge;
    private String medPregnant;
    private LocalDate medReg;
    private String IsFiles;

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedDis() {
        return medDis;
    }

    public void setMedDis(String medDis) {
        this.medDis = medDis;
    }

    public String getMedEff() {
        return medEff;
    }

    public void setMedEff(String medEff) {
        this.medEff = medEff;
    }

    public String getMedType() {
        return medType;
    }

    public void setMedType(String medType) {
        this.medType = medType;
    }

    public String getMedStore() {
        return medStore;
    }

    public void setMedStore(String medStore) {
        this.medStore = medStore;
    }

    public String getMedCom() {
        return medCom;
    }

    public void setMedCom(String medCom) {
        this.medCom = medCom;
    }

    public String getMedAge() {
        return medAge;
    }

    public void setMedAge(String medAge) {
        this.medAge = medAge;
    }

    public String getMedPregnant() {
        return medPregnant;
    }

    public void setMedPregnant(String medPregnant) {
        this.medPregnant = medPregnant;
    }

    public LocalDate getMedReg() {
        return medReg;
    }

    public void setMedReg(LocalDate medReg) {
        this.medReg = medReg;
    }

    public String getIsFiles() {
        return IsFiles;
    }

    public void setIsFiles(String isFiles) {
        IsFiles = isFiles;
    }
}
