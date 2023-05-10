package chandriki2;

public class methodoverr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape r=new square();
      r.draw();
	}

}
class Shape 
{
	void draw()
	{
		System.out.println("no shape.");
	}
}
class square extends Shape
{
	void draw()
	{
		super.draw();
		System.out.println("square shape");
	}
}