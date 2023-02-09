package Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.docusign.esign.client.ApiException;

import Service.DSEnvelope;

@Controller
public class DocuSignController {

	@Autowired
	DSEnvelope DSEnvelopeService;
	
	@GetMapping(value="createEnvelope")
	public ResponseEntity<?> envelope() throws IOException, ApiException
	{
		String response = DSEnvelopeService.createEnvelope("sankalp.boradkar@cognizant.com", "Sankalp");
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
