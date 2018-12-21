import com.ab5tract.clazz.AbstractClassGrdParent;

public class AbstractClassChild extends AbstractClassGrdParent{

	public static int var = 2;
	
	@Override
	public void abstractFun() {
	}
	
	public static void main(String[] args) {
		AbstractClassChild ch = new AbstractClassChild();
		System.out.println(ch.var);
		
		AbstractClassGrdParent ch1 = new AbstractClassChild();
		System.out.println(ch1.var);
		
		AbstractClassChild ch2 = new AbstractClassChild();
		System.out.println(ch2 instanceof AbstractClassGrdParent);
		System.out.println(ch2 instanceof AbstractClassChild);
		System.out.println(ch2.var);
		System.out.println(((AbstractClassGrdParent)ch2).var);
		
		AbstractClassGrdParent ch3 = (AbstractClassGrdParent)ch2;
		
		System.out.println(ch3 instanceof AbstractClassGrdParent);
		System.out.println(ch3 instanceof AbstractClassChild);
		System.out.println(ch3.var);
	}
}