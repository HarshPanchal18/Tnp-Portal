package org.mca_two.model;

// eligibility
public class Eligibility {
    int id;
    int jdId; // #FK - Job
    int deptId; // #FK - Department
    int sscCutoff;
    int hscCutoff;
    Integer diplomaCutoff = null;
    int ugCutoff;
    int pgCutoff;
}