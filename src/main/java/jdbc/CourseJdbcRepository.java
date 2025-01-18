package jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    //Creating a template of JDBC
    //Using spring jdbc to execute a simple query
    @Autowired
    private JdbcTemplate springjdbcTemplate;
    private static String INSERT_QUERY =
            """
                    insert into course(id,name,author)
                    values(? ,?,?)
                    """;
    //Creating a method to insert
    public void insert(Course course){
        springjdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

}
