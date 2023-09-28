package org.example;

public class CommercialDriver extends GenericDriver {
    private String hazardousMaterialsType;
    private String carType;

    public CommercialDriver(String name, boolean isProvisional, String materialType, String carType) {
        super(name, isProvisional);
        hazardousMaterialsType = materialType;
        this.carType = carType;
    }

    public String getMaterialsType() {
        return hazardousMaterialsType;
    }

    @Override
    public void setMedicalReport() {
        medicalReport = "Approved to drive " + carType;
    }
}
