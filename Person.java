public class Person
{
	private String name;
	private static String ID;
	private static String Title;
	private static String Dep;
	private static int Rate;
	private static int hours;
	private int weekwage = Rate*hours;


	
	
	public Person(String name, String ID, String Title, String Dep, int Rate, int hours)
	{
		this.name = name;
		this.ID = ID;
		this.Title = Title;
		this.Dep = Dep;
		this.Rate  = Rate;
		this.hours = hours;
		weekwage = Rate *hours;
	}
	
	
	
	public String getdetails()
	{
		return name + ", " + ID + ", " + Title + ", " + Dep + ", "+  weekwage;
	}
	
	public String name()
	{
		return name;
	}
	public String ID()
	{
		return ID;
		
	}
	public String Title()
	{
		return Title;
		
	}
	public String Dep()
	{
		return Dep;
	}
	
	public int rate()
	{
		return Rate;
	}
	
	public int hrs()
	{
		return hours;
	}
	public int getwage()
	{
		return weekwage;
	}
	
	
	
	
	
	
}