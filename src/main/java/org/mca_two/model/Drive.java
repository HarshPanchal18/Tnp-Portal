package org.mca_two.model;

import java.sql.Date;

// drive_details
public class Drive {
    int id;
    int companyId;
    int openings;
    Date date;

    public Drive(int id, int companyId, int openings, Date date) {
        this.id = id;
        this.companyId = companyId;
        this.openings = openings;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getOpenings() {
        return openings;
    }

    public Date getDate() {
        return date;
    }
}