package entities.concretes;

public class Customer {
	
	private int id;
    private String nameSurname;
    private int customerNo;
    
    public Customer() {
    	
    }
    
  public Customer(int id, String nameSurname, int customerNo) {

	  this.id=id;
	  this.nameSurname=nameSurname;
	  this.customerNo=customerNo;
	  
	  }
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameSurname() {
		return nameSurname;
	}
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

    
  
  
}
