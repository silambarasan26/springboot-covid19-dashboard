package covid19.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import covid19.model.Covid19Model;

public class CSVParserUtils {
	
	private static final String FILE_NAME = "path\\covid19\\src\\main\\resources\\data\\state_wise_data.csv";
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Covid19Model> stateWiseData() {
		
		List<Covid19Model> beans = null;
		try {
			beans = new CsvToBeanBuilder(new FileReader(FILE_NAME))
			        .withType(Covid19Model.class)
			        .build()
			        .parse();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        beans.forEach(System.out::println);
		return beans;
	}

}
