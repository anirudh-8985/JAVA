import java.lang.annotation.*;
import java.lang.Class.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.*;  
// import java.lang.Class.getDeclaredFields;



import strategy.*;

public class Main{
	
	public String execute() throws Throwable {
		Class<CustomSort> controller = CustomSort.class;
		Field[] fields = controller.getDeclaredFields();
		CustomSort obj = new CustomSort();
		for(Field field : fields)
		{
			Sort sort = field.getAnnotation(Sort.class);
			if(sort != null)
			{
				
			
				String type = sort.type();
				//List<Integer> list = new ArrayList<Integer>((Collection<Integer>)value);
				double[] list = (double[])field.get(obj);
				
				
				if(type.equals("bubble"))
				{	
					Sorter sorter = new Sorter();

					list = sorter.Sort(list,new Bubblesort());
					//System.out.println(list[0]);
					field.set(obj, list);
				}
				
			}
			
		}
			Method[] methods = controller.getMethods();
			for(Method method : methods){
				Invoke invoke = method.getAnnotation(Invoke.class);
				if(invoke != null){
					method.invoke(obj);
			}
			}
					return null;

		}
		

	public static void main(String... args){
		try{
		new Main().execute();
		} catch (Throwable e){

		}

		
	}
}
