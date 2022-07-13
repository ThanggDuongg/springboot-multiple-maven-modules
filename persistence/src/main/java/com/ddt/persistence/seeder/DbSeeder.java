package com.ddt.persistence.seeder;

import com.ddt.domain.entities.TaskEntity;
import com.ddt.domain.entities.UserEntity;
import com.ddt.persistence.repositories.TaskRepository;
import com.ddt.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private UserRepository _userRepository;
    private TaskRepository _taskRepository;

    @Autowired
    public DbSeeder(UserRepository userRepository, TaskRepository taskRepository) {
        this._taskRepository = taskRepository;
        this._userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        UserEntity userEntity01 = UserEntity
                .builder()
                .Email("user01@gmail.com")
                .Name("User01")
                .Password("1234567")
                .build();

        UserEntity userEntity02 = UserEntity
                .builder()
                .Email("user02@gmail.com")
                .Name("User02")
                .Password("1234567")
                .build();

        UserEntity userEntity03 = UserEntity
                .builder()
                .Email("user03@gmail.com")
                .Name("User03")
                .Password("1234567")
                .build();
        this._userRepository.saveAll(List.of(userEntity01, userEntity02, userEntity03));

        TaskEntity taskEntity01 = TaskEntity
                .builder()
                .Name("Task01")
                .IsComplete(false)
                .DateStart(LocalDate.now())
                .DateEnd(LocalDate.now().plusDays(5))
                .userEntity(userEntity01)
                .build();

        TaskEntity taskEntity02 = TaskEntity
                .builder()
                .Name("Task02")
                .IsComplete(true)
                .DateStart(LocalDate.now().minusDays(3))
                .DateEnd(LocalDate.now().minusDays(1))
                .userEntity(userEntity01)
                .build();

        TaskEntity taskEntity03 = TaskEntity
                .builder()
                .Name("Task03")
                .IsComplete(false)
                .DateStart(LocalDate.now())
                .DateEnd(LocalDate.now().plusMonths(3))
                .userEntity(userEntity03)
                .build();

        this._taskRepository.saveAll(List.of(taskEntity01, taskEntity02, taskEntity03));
    }
}
