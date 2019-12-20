package tp3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import tools.*;

public class MainAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> pClass = Class.forName("tp3.Personne");
		Field[] pFields = pClass.getFields();
		Tools.disp(pClass.getAnnotation(Refactorable.class).toString());
		for(Field p : pFields) {
			Annotation[] annotations = p.getDeclaredAnnotations();
			Tools.disp(p.getName() + ":");
			for(Annotation a : annotations) {
				Tools.disp(a.toString());
			}
		}
	}
}
