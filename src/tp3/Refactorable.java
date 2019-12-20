package tp3;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
@Repeatable (Refactorables.class)
public @interface Refactorable {
	String nomPersonne() default "[unassigned]";
	RefactoringName nomRefactoring();
	String commentaire() default "[unassigned]";
	boolean isPresentInEclipse();
	int nbCasApplicationCible() default 1;
}

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
@interface Refactorables {
	Refactorable[] value();
}
