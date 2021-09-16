/**
 * 
 */
package covid19.service;

import java.util.List;

import org.springframework.stereotype.Service;

import covid19.model.Covid19Data;

/**
 * @author simbu
 *
 */
@Service
public interface ICovid19DataService {

	List<Covid19Data> getStateWiseList();

}
