import java.util.Date;
import java.lang.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		return students;
		
	}

	@Override
	public void setStudents(Student[] students) {
	
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		if(index<0|| index>=students.length){
			throw new IllegalArgumentException();
		}
		else{
		return students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		
			if(index<0 || index>=students.length || student==null){
				throw new IllegalArgumentException();
			}
			else{
				students[index]=student;
			}
	}

	@Override
	public void addFirst(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
		for(int i=students.length;i>0;i--){
			students[i]=students[i-1];
		}
		students[0]=student;
	}}

	@Override
	public void addLast(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
		students[students.length]=student;
		}
	}

	@Override
	public void add(Student student, int index) {
			if(index<0 || index>=students.length || student==null){
				throw new IllegalArgumentException();
			}
			else{
				students[index]=student;
			}
		
	}

	@Override
	public void remove(int index) {
		if(index<0 || index>=students.length){
				throw new IllegalArgumentException();
			}
			else{
		for(int i=index;i<students.length;i++){
			students[i]=students[i+1];
		}
	}}

	@Override
	public void remove(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
		for(int i=0;i<students.length;i++){
		if(students[i]==student){
			remove(i);
			break;
		}
		}
	}}

	@Override
	public void removeFromIndex(int index) {
		if(index<0 || index>=students.length){
				throw new IllegalArgumentException();
			}
			else{
		for(int i=index+1;i<students.length;i++){
			remove(i);
		}
	}}

	@Override
	public void removeFromElement(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
		for(int j=0;j<students.length;j++){
		if(students[j]==student){
		for(int i=j+1;i<students.length;i++){
			remove(i);
		}
		break;
		}
	}
	}}

	@Override
	public void removeToIndex(int index) {
		if(index<0 || index>=students.length){
				throw new IllegalArgumentException();
			}
			else{
		for(int i=0;index<students.length;i++){
			students[i]=students[index];
			index++;
		}
	}}

	@Override
	public void removeToElement(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
			for(int i=0;i<students.length;i++){
			if(students[i]==student){
			for(int j=0;i<students.length;j++){
			students[j]=students[i];
			i++;
			}
			break;
			}
		}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null){
			throw new IllegalArgumentException();
		}
		else{Student[] temp=new Student[students.length];
		int j=0;
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate().compareTo(date)<0){
				temp[j]=students[i];
				j++;
			}
		}
		return temp;
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if(lastDate==null || firstDate==null){
			throw new IllegalArgumentException();
		}
		else{
		Student[] temp=new Student[students.length];
		int j=0;
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate().compareTo(lastDate)<0 && students[i].getBirthDate().compareTo(firstDate)>0 ){
				temp[j]=students[i];
				j++;
			}
		}
		return temp;
		}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
