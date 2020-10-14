public class Driver{

	public static void main (String [] arg )
	{
		// Fish actually is a data type 
		// Fish nemo;==int x;
		// lepas new panggil balik 
		//nemo is object,, Fish is class
		Fish nemo = new Fish();

		nemo.Swim();
		nemo.color= "red";//tukar value
		nemo.Swim();

		Fish dory = new Fish();//another object
		dory.Swim();
		dory.color="yellow";
		dory.Swim();
	}
}