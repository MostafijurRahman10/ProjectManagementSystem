package com.mostafijurrahman.project.management.model;

import javax.persistence.*;


@Entity
    @Table(name = "Project")
    public class Project {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private int id;

        @Column(name = "projectName")
        private String projectName;

        @Column(name = "intro")
        private String intro;

        @Column(name = "owner")
        private String owner;


        @Column(name = "status")
        private int status;



        @Column(name = "startDate")
        private String startDate;

        @Column(name = "endDate")
        private String endDate;

        @Column(name = "projectMember")
        private int projectMember;

        public int getId() {
            return id;
        }

        public void setId(int id) {

            this.id = id;
        }

        public String getProjectName()
        {
            return projectName;
        }

        public void setProjectName(String projectName) {

            this.projectName = projectName;
        }

        public String getIntro()
        {
            return intro;
        }

        public void setIntro(String intro) {

            this.intro = intro;
        }

        public String getOwner()
        {
            return owner;
        }

        public void setOwner(String owner)
        {
            this.owner = owner;
        }

        public int getStatus() {

            return status;
        }

        public void setStatus(int status) {

            this.status = status;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {

            this.startDate = startDate;
        }

        public String getEndDate()
        {
            return endDate;
        }

        public void setEndDate(String endDate)
        {
            this.endDate = endDate;
        }

        public int getProjectMember()
        {
            return projectMember;
        }

        public void setProjectMember(int projectMember) {

            this.projectMember = projectMember;
        }

}

