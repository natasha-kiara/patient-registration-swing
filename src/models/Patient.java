/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.ImageIcon;

/**
 *
 * @author kiara
 */
public class Patient {
    
    private String patientType;
    private String firstName;
    private String lastName;
    private String maritalStatus;
    private String gender;
    private String emailAddress;
    private String phoneNumber;
    private String message;
    private boolean terms;
    private ImageIcon profilePic;
    private int age;
    
   
    public Patient(ImageIcon profilePic,String patientType,String firstName,String lastName,String maritalStatus,String gender,String emailAddress,
    String phoneNumber,int age,String message, boolean terms){
          this.profilePic = profilePic;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.message = message;
        this.patientType = patientType;
        this.phoneNumber = phoneNumber;
        this.terms = terms;
        this.age = age;
    }

    public String getPatientType() {
        return patientType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public boolean isTerms() {
        return terms;
    }


    public ImageIcon getProfilePic() {
        return profilePic;
    }
    
    
    
}
