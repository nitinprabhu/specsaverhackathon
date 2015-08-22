package uk.specsavers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.specsavers.dao.CustomerDAO;
import uk.specsavers.ui.CustomerDetails;

@Service
@Transactional(rollbackFor = {Exception.class})
public class RetrieveCustomerDetailsService {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	public List<CustomerDetails> fetchAllCustomers()
	{
		List<CustomerDetails> customerDetails=new ArrayList<CustomerDetails>();
		
		for(uk.specsavers.domain.CustomerDetails customerDetail:customerDAO.fetchAllCustomers())
		{
			CustomerDetails details=new CustomerDetails();
			
			details.setAdditionalDetails(customerDetail.getAdditionalDetails());
			details.setAge(customerDetail.getAge());
			details.setContactNumber(customerDetail.getContactNumber());
			details.setFirstName(customerDetail.getFirstName());
			details.setLastHearingTestDate(customerDetail.getLastHearingTestDate());
			details.setLastName(customerDetail.getLastName());
			details.setLastSightTestDate(customerDetail.getLastSightTestDate());
			details.setLocation(customerDetail.getLocation());
			details.setNextHearingTestDate(customerDetail.getNextHearingTestDate());
			details.setNextSightTestDate(customerDetail.getNextSightTestDate());
			details.setReminderStatus(customerDetail.getReminderStatus());
			
			customerDetails.add(details);
		}
		return customerDetails;
	}
	
	public CustomerDetails fetchCustomerDetailsById()
	{
		return null;
	}
	
	public List<CustomerDetails> persistCustomerDetails(CustomerDetails customerDetails)
	{
		return null;
	}
	
	public String sendSMSNotification()
	{
		return null;
	}
	
	public String sendMMSNotification()
	{
		return null;
	}
	
	public String processNotifications()
	{
		return null;
	}
	
	
}
