class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	boolean validateMarks(int marks)throws Exception{
		if(marks<=100 && marks>=0){
			return true;
		}
		else{
			throw new Exception("Excetion!");
			return false;
		}
	}
	
	Student(String name,int e1,int e2,int e3)throws Exception{
		this.name=name;
		
		if(validateMarks(e1)&&validateMarks(e2)&&validateMarks(e3)){
			exam1=e1;
			exam2=e2;
			exam3=e3;
			
		}
		else{
			System.out.println("Setting the marks value to 0");
			throw new Exception("Invalid Marks");
		}
	}
	
	
	
	String getName(){
		return name;
	}
	int getExam1(){
		return exam1;
	}
	int getExam2(){
		return exam2;
	}
	int getExam3(){
		return exam3;
	}
	
}	
	
class StudentDemo{
	public static void main(String[] args){
		Student s1,s2;
		
		try{
		s1=new Student("Adam",99,102,-55);
		s2=new Student("Eve",99,88,75);
		
		System.out.println("Name of the Student 1 is "+s1.getName());
		System.out.println("Marks of the Student 1 for exam 1 is "+s1.getExam1());
		System.out.println("Marks of the Student 1 for exam 2 is "+s1.getExam2());
		
		System.out.println("Name of the Student 2 is "+s2.getName());
		System.out.println("Marks of the Student 2for exam 1 is "+s2.getExam1());
		}
		catch(Exception e){
			System.out.println("Exception is: "+e.getMessage());
		}
		
	}
}
