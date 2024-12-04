package org.mca_two.model;

import java.sql.Date;

// student_details
public class Student {
    int id; // #PK
    int userId; // #FK - user
    int tnpId;
    int qualificationId; // #FK - Qualification
    String fName;
    String mName;
    String lName;
    String residentialAddress;
    Date dob;
    String contact;
    String resumeLink;

    public Student(int id, int userId, int tnpId, int qualificationId, String fName, String mName, String lName, String residentialAddress, Date dob, String contact, String resumeLink) {
        this.id = id;
        this.userId = userId;
        this.tnpId = tnpId;
        this.qualificationId = qualificationId;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.residentialAddress = residentialAddress;
        this.dob = dob;
        this.contact = contact;
        this.resumeLink = resumeLink;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getTnpId() {
        return tnpId;
    }

    public int getQualificationId() {
        return qualificationId;
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getlName() {
        return lName;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public Date getDob() {
        return dob;
    }

    public String getContact() {
        return contact;
    }

    public String getResumeLink() {
        return resumeLink;
    }

}