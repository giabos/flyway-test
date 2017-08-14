package db.migrations;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;


public class V1__CreateTableCity implements SpringJdbcMigration  {

	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
		jdbcTemplate.execute("create table CITY (name varchar(50), state varchar(50), country varchar(50))");
		jdbcTemplate.execute("insert into CITY values('aaa', 'bbb', 'ccc')");
		
	}

}
