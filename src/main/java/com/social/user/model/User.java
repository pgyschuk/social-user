package com.social.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "users")

public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "version")
    private Long verion;

    @Column(name = "created")
    private Date created;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lasttname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "avatarurl")
    private String avatarUrl;

    @Column(name = "accountverified")
    private boolean accountVerified;

    @Column(name = "deactivated")
    private boolean deactivated;

}
