package annotations;

import java.lang.annotation.*;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RententionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Sort {

	boolean invoke() default false;
	String anirudh() default "MergeSort";
}
