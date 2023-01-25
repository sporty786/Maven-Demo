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