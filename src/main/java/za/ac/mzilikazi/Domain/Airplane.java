package za.ac.mzilikazi.Domain;

import java.io.Serializable;

/**
 * Created by mandisi on 2016-04-16.
 */
public class Airplane implements Serializable{
    private String registrationNumber;
    private String beginOfOperation;
    private String status;

    public Airplane() {
    }

    public Airplane(Builder builder){
        registrationNumber = builder.registrationNumber;
        beginOfOperation = builder.beginOfOperation;
        status = builder.status;
    }

    public String getBeginOfOperation() {
        return beginOfOperation;
    }

    public void setBeginOfOperation(String beginOfOperation) {
        this.beginOfOperation = beginOfOperation;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class Builder{
        private String registrationNumber;
        private String beginOfOperation;
        private String status;


        public Builder registrationNumber(String value){
            this.registrationNumber = value;
            return this;
        }

        public Builder beginOfOperation(String value){
            this.beginOfOperation = value;
            return this;
        }

        public Builder status(String value){
            this.status = value;
            return this;
        }
        public Builder copy(Airplane value){
            this.registrationNumber = value.getRegistrationNumber();
            this.beginOfOperation = value.getBeginOfOperation();
            this.status = value.getStatus();
            return this;
        }
        public Airplane build(){
            return new Airplane(this);
        }
    }
}
