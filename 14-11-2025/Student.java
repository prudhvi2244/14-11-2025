class Student {

    Integer sid;
    String sname;
    String semail;

    Student(Integer sid, String sname, String semail) {
        this.sid = sid;
        this.sname = sname;
        this.semail = semail;
    }

    Student() {

    }

    @Override
    public String toString() {
        return "Student ID :"+sid+" Student Name :"+sname+" Student Email :"+semail;
    }

}