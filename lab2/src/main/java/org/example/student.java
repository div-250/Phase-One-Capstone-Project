package org.example;


import java.sql.Connection;

public class student {
        private int student_id;
        private String name;
        private String email;
    private Connection connec;


        public student(String name,  String email) {
            this.name = name;
            this.email = email;

        }
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }





}
