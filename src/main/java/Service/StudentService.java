package Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.EntityClass;
import Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	public Optional<EntityClass> getStudentDetails(int id)
	{
		//System.out.println(id);
		return studentRepo.findById(id);
	}
	
	public void deleteStudent(Integer id)
	{
		studentRepo.deleteById(id);
	}
	
	public void addStudent(EntityClass body)
	{
		studentRepo.save(body);
	}
	
	public List<EntityClass> findAll()
	{
		
		List<EntityClass> myList = studentRepo.findAll();
		return studentRepo.findAll();
	}
	
	public void updateStudent(EntityClass ent,Integer id)
	{
		List<EntityClass> list = studentRepo.findAll();
		//list.stream().filter(i->i.getId().equals(id)).findFirst().stream(j->stu)
		
		for(int i=0;i<list.size();i++)
		{
			EntityClass t = list.get(i);
			if(t.getId().equals(id))
			{
				studentRepo.save(ent);
			}
		}
	}
	
}
