
public class Student {
	
	//Properties  or variables
	public int english;
	public int maths;
	public int chemistry;
	public int physics;
	public int noOfSub = 4;
	
    Student(int english, int maths, int chemistry, int physics)
    {
    	this.english = english;
    	this.maths = maths;
    	this.chemistry = chemistry;
    	this.physics = physics;
    }
	//PEMDAS - Operator precedence
	int averageMarks()
	{
		int avg = (this.english + this.maths + this.chemistry + this.physics) /noOfSub;
		return avg;
	}
	int sumOfMarks() {
		int sum = this.english + this.maths + this.chemistry + this.physics;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(80,100,90,88);
		System.out.println("*********** Student 1 ***********************");
		System.out.println("Average marks :"+ student1.averageMarks());
		System.out.println("Sum of marks :"+ student1.sumOfMarks());
		System.out.println();
		
		Student student2 = new Student(50,60,56,70);
		System.out.println("*********** Student 2 ***********************");
		System.out.println("Average marks :"+ student2.averageMarks());
		System.out.println("Sum of marks :"+ student2.sumOfMarks());
		
	}

}
