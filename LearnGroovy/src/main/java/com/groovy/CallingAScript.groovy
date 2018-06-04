package com.groovy
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class CallingAScript {

	static main(args) {
		
		ScriptEngine engine = new ScriptEngineManager()
		.getEngineByName("groovy");
try {
	engine.put("street", "Haindaalwisch 17a");
	engine.eval("println 'Hello, Groovy!'");
	engine.eval(new FileReader("C:/Users/chandan/git/GroovyProject/LearnGroovy/src/main/java/com/groovy/Range.groovy"));
} catch (ScriptException e) {
	e.printStackTrace();
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
	}

}
