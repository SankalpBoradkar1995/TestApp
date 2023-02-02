package Controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Model.EntityClass;
import Service.StudentService;

@Controller
public class RESTController {

	@Autowired
	StudentService studentServiceObj;

	@RequestMapping(value = "/student/{id}", method = { RequestMethod.GET })
	public ResponseEntity<?> getData(@PathVariable Integer id) {
		//System.out.println("Inside controller");
		Optional<EntityClass> myList = studentServiceObj.getStudentDetails(id);
		return new ResponseEntity<>(myList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public ResponseEntity<?> get() {
		//System.out.println("Inside controller");
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}

	@RequestMapping(value = "student/delete/{id}", method = { RequestMethod.DELETE, RequestMethod.GET })

	public void deleteStudent(@PathVariable Integer id) {
		studentServiceObj.deleteStudent(id);
	}
	
	@PostMapping(value="student/add")
	public ResponseEntity<?> addStudent(@RequestBody EntityClass newEntityClass)
	{
		studentServiceObj.addStudent(newEntityClass);
		
		return new ResponseEntity<>(studentServiceObj.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "student/update/{id}", method = { RequestMethod.PUT, RequestMethod.GET})
	public ResponseEntity<?> updateStudent(@RequestBody EntityClass newEntityClass, @PathVariable Integer id)
	{
		studentServiceObj.updateStudent(newEntityClass,id);
		return new ResponseEntity<>(studentServiceObj.findAll(),HttpStatus.OK);
	}

}
