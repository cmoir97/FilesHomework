package com.codeclan.example.FilesHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;

    @JsonIgnoreProperties("folders")
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @JsonIgnoreProperties("folder")
    @OneToMany(mappedBy = "folder")
    private List<File> files;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
        this.files = new ArrayList<File>();
    }

    public Folder(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}
