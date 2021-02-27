package me.joon.inflearnthejavatest;

public class Study {
    private StudyStatus studyStatus=StudyStatus.DRAFT;
    private int limit;


    public StudyStatus getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(StudyStatus studyStatus) {
        this.studyStatus = studyStatus;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit){
        if(limit<0)throw new IllegalArgumentException("limit는 0 이상이어야 한다");
        this.limit = limit;
    }
}
