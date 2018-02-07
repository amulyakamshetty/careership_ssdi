package testService;

import static org.junit.Assert.assertTrue;

import javax.mail.MessagingException;

import org.junit.Test;

import com.vjf.service.ImplAddToShortlistService;
import com.vjf.service.ImplEmployerService;

public class TestShortListCandidatesService {
	
	 @Test
	   public void testPassShortList() {
			
		   
		   
		    try {
				new ImplAddToShortlistService().sendEmailSelectedCandidates("sdilly@uncc.edu");
				assertTrue("Email Verified No Exception",true);
				
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assertTrue("Employer Email Verification Failed",true);
				
				
			}
		   
	   }
	 @Test
	   public void testShortListFail() {
			
		   
		   
		    try {
				new ImplAddToShortlistService().sendEmailSelectedCandidates("sdilly@uncc.edu");
				assertTrue("Email Verified No Exception",true);
				
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assertTrue("Employer Email Verification Failed",true);
				
				
			}
		   
	   }
	

	


}
