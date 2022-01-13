package sfa.springframework.sfa.di;

import com.sun.javafx.scene.traversal.SubSceneTraversalEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sfa.springframework.sfa.di.controllers.ConstructorInjectionController;
import sfa.springframework.sfa.di.controllers.MyController;
import sfa.springframework.sfa.di.controllers.PropretyInjectionController;
import sfa.springframework.sfa.di.controllers.SetterInjectionController;

@SpringBootApplication
public class Application {

 	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------Proprety");

		PropretyInjectionController propretyInjectionController = (PropretyInjectionController) ctx.getBean("propretyInjectionController");
		System.out.println(propretyInjectionController.getGreeting());

		System.out.println("---------Setter");

		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("-----Constructor");

		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreeting());
	}

}
