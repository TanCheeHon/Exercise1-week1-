public class Fish{
	//attribute or data member or fields
	private String color ="blue";//default value

	//method
    public void Swim() {
    	System.out.println( color + " fish swim");
		
	}
	//warna is parameter

	public void SetColor(String warna){

		color=warna;
	}
	public String GetColor(){
		return color;
	}
}