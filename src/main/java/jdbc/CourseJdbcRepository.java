package jdbc;

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
                    values(1,'Learn AWS','in 28 minutes')
                    """;
    //Creating a method to insert
    public void insert(){
        springjdbcTemplate.update(INSERT_QUERY);
    }

}
