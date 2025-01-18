package jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.entity.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner  implements CommandLineRunner {
private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS","in 28 minutes"));
        repository.insert(new Course(2,"Learn DevOps","in 10 minutes"));
        repository.insert(new Course(3,"Learn Full Stack","in 12 minutes"));
    }
}
