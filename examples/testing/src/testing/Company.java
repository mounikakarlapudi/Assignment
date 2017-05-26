package testing;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Department d= new Department();
       
      d.dept_id=121;
      d.dept_name= "saibersys";
      d.no_of_emp= 650;
      
      d.dept_added();
      d.dept_change();
      

      System.out.println("Department id is:" +d.dept_id);
      System.out.println("Department name is:" +d.dept_name);
      System.out.println("Number of employee is:" +d.no_of_emp);
	}

}
