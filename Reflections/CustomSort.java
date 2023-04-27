
public class CustomSort{

	@Sort(type="bubble")
	double list[] = {10,14,12,1,2,3,55,33,12,999};

	//List<Integer> list = new ArrayList<Integer>(Arrays.aslist(1,45,56,36))
	
	
	
	@Invoke
	public void print(){

		for(int i =0 ; i < 10 ; i++ )
		{
			System.out.print(list[i] + ",");
		}
		System.out.println();
	}
}
