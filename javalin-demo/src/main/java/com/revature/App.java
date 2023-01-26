package com.revature;

import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create(/*config*/);
        app.get("/", ctx -> ctx.result("Hello World/n"));
        app.start(7071);
    }
}

// Open new terminal (can split terminals)
// terminal commands: $ curl localhost: 7071

// Can test with mvn test (Bascially revpro test is a Wrapper for this, so we can send to the progress tracker
// and eliminate unecessary code)
// mvn verify



/**
 * maven - as a dependency manager & build tool
 * structure of maven (src/main+test)
 * the pomxml, which defines the structure of the maven project and contains information about external dependencies
 * mvnrepository, an online library of all open source maven projects
 * different stages of maven lifecycle - eg validate, compile, test, package
 * getting Javalin into our projects
 */