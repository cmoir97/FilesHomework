package com.codeclan.example.FilesHomework.components;

import com.codeclan.example.FilesHomework.models.File;
import com.codeclan.example.FilesHomework.models.Folder;
import com.codeclan.example.FilesHomework.models.User;
import com.codeclan.example.FilesHomework.repositories.FileRepository;
import com.codeclan.example.FilesHomework.repositories.FolderRepository;
import com.codeclan.example.FilesHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;
    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        User cameron = new User("Cameron");
        userRepository.save(cameron);
        User chris = new User("Chris");
        userRepository.save(chris);
        Folder folder1 = new Folder("pages", cameron);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("pictures", cameron);
        folderRepository.save(folder2);
        File file1 = new File("cv", ".txt", 10, folder1);
        fileRepository.save(file1);
        File file2 = new File("profilePicture", ".jpeg", 256, folder2);
        fileRepository.save(file2);
        cameron.addFolder(folder1);
        cameron.addFolder(folder2);
        userRepository.save(cameron);
        folder2.addFile(file2);
        folderRepository.save(folder2);
    }
}
