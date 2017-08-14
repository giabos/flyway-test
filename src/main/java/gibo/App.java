package gibo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App implements CommandLineRunner {

    @Autowired
    private CityMapper cityMapper;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping(value = "/cities")
    public List<City> allCities () {
    	return this.cityMapper.allCities();
    }
    
    @PostMapping(value = "/cities")
    public void createCity (@RequestBody City city) {
    	this.cityMapper.insertCity(city);
    }
    
    @Override
    public void run(String... args) throws Exception {
    	//System.out.println("-------");
    	
    	//this.cityMapper.insertCity(new City("aaa", "bbb", "ccc"));
    	//this.cityMapper.insertCity(new City("AAA", "BBB", "CCC"));
    	
        //System.out.println(this.cityMapper.findByState("BBB"));
    	//System.out.println("-------");
    }

}