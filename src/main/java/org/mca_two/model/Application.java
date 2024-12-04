package org.mca_two.model;

import java.sql.Date;

// applications
public class Application {
    int id; // #PK
    int studentId; // FK - student_details
    int jobId; // FK - job_description
    int tnpId;
    Date applyDate;
    int status;
    // JoiningLetter
    Date offerDate;
    Date acceptanceDate;

    public Application() {
    }

    public Application(int id) {
        this.id = id;
    }

    public Application(int id, int studentId, int jobId, int tnpId, Date applyDate, int status, Date offerDate, Date acceptanceDate) {
        this.id = id;
        this.studentId = studentId;
        this.jobId = jobId;
        this.tnpId = tnpId;
        this.applyDate = applyDate;
        this.status = status;
        this.offerDate = offerDate;
        this.acceptanceDate = acceptanceDate;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getJdId() {
        return jobId;
    }

    public int getTnpId() {
        return tnpId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public int getStatus() {
        return status;
    }

    public Date getOfferDate() {
        return offerDate;
    }

    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

}