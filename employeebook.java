public class employeebook
{
	static String[][] array = new String[4][8];
	static int[][] array2 = new int[4][8];


	public static void add()
	{
		Person bob = new Person("bob","929","coach","athletics",9, 10);
		Person sam = new Person("sam","934","teacher","chemistry",15, 10);
		Person laura = new Person("laura","5392","principal","admin",13, 10);
		
		array[0][1] = bob.name();
		array[0][2] = bob.ID();
		array[0][3] = bob.Title();
		array[0][4] = bob.Dep();
		
		array2[0][5] = bob.rate();
		array2[0][6] = bob.hrs();
		array2[0][7] = bob.getwage();
		
		array[1][1] = sam.name();
		array[1][2] = sam.ID();
		array[1][3] = sam.Title();
		array[1][4] = sam.Dep();
		
		array2[1][5] = sam.rate();
		array2[1][6] = sam.hrs();
		array2[1][7] = sam.getwage();
		
		array[1][1] = laura.name();
		array[1][2] = laura.ID();
		array[1][3] = laura.Title();
		array[1][4] = laura.Dep();
		
		array2[1][5] = laura.rate();
		array2[1][6] = laura.hrs();
		array2[1][7] = laura.getwage();

	}
	
	
	public static void sort()
	
	{
		int count=0;
		for (int i=1; i< count; i++)
			//comparison loop
		{
			for (int j=0; j< count -1; j++)
			{//iteration loop
				if(array2[j][7] < array2[j][7])
				{
					//switch all of the other arrays to make them in decending order....
				}

			}
		}
	}
	


	
}