package tp3;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import tools.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Tools.disp("Entrer le nom de la classe à refactoriser");
		Scanner sc = new Scanner(System.in);
		String className = "tp3." + sc.next();
		Tools.disp(generateInterfaceString(className));
	}
	
	public static String generateInterfaceString(String className) throws ClassNotFoundException {
		String gen = "", classSimpleName = Class.forName(className).getSimpleName();
		Method[] methods = Class.forName(className).getDeclaredMethods();
		Class<?> cSuper = Class.forName(className).getSuperclass();
		Class<?>[] cInterfaces = Class.forName(className).getInterfaces();
		gen += "public interface I" + classSimpleName;
		if(!cSuper.getSimpleName().equals("Object")) {
			gen += " extends " + cSuper.getSimpleName();
		}
		if(cInterfaces.length != 0) {
			gen += " extends ";
			for(Class<?> i : cInterfaces) {
				gen += i.getSimpleName() + ", ";
			}
			gen = gen.substring(0, gen.length()-2);
		}
		gen += "{\n";
		for(Method m : methods) {
			int mModifier = m.getModifiers();
			if(!Modifier.isPrivate(mModifier) && !Modifier.isStatic(mModifier)) {
				String mReturnType = m.getReturnType().getSimpleName();
				String mName = m.getName();
				gen += mReturnType + " " + mName + "();\n";
			}
			
		}
		gen += "}";
		return gen;
	}
}
