package com.outreachmaps.outreachmaps.models;

import jakarta.persistence.Entity;

@Entity
public class Client extends AbstractEntity {

    //name
    private String firstName;
    private String lastName;
    private String middleName;

    //Date of Birth
    private Integer dobMonth;
    private Integer dobDay;
    private Integer dobYear;

    //Social Security Number

    private Integer ssnFirstThree;
    private Integer ssnMiddleTwo;
    private Integer ssnLastFour;

    public Client(String firstName, String lastName, String middleName, Integer dobMonth, Integer dobDay, Integer dobYear, Integer ssnFirstThree, Integer ssnMiddleTwo, Integer ssnLastFour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dobMonth = dobMonth;
        this.dobDay = dobDay;
        this.dobYear = dobYear;
        this.ssnFirstThree = ssnFirstThree;
        this.ssnMiddleTwo = ssnMiddleTwo;
        this.ssnLastFour = ssnLastFour;
    }

    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(Integer dobMonth) {
        this.dobMonth = dobMonth;
    }

    public Integer getDobDay() {
        return dobDay;
    }

    public void setDobDay(Integer dobDay) {
        this.dobDay = dobDay;
    }

    public Integer getDobYear() {
        return dobYear;
    }

    public void setDobYear(Integer dobYear) {
        this.dobYear = dobYear;
    }

    public Integer getSsnFirstThree() {
        return ssnFirstThree;
    }

    public void setSsnFirstThree(Integer ssnFirstThree) {
        this.ssnFirstThree = ssnFirstThree;
    }

    public Integer getSsnMiddleTwo() {
        return ssnMiddleTwo;
    }

    public void setSsnMiddleTwo(Integer ssnMiddleTwo) {
        this.ssnMiddleTwo = ssnMiddleTwo;
    }

    public Integer getSsnLastFour() {
        return ssnLastFour;
    }

    public void setSsnLastFour(Integer ssnLastFour) {
        this.ssnLastFour = ssnLastFour;
    }

}
