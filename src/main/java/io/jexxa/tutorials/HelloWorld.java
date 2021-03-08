package io.jexxa.tutorials;

import io.jexxa.infrastructure.drivingadapter.jmx.JMXAdapter;
import io.jexxa.infrastructure.drivingadapter.rest.RESTfulRPCAdapter;
import io.jexxa.core.JexxaMain;
import io.jexxa.infrastructure.drivingadapter.jmx.JMXAdapter;
import io.jexxa.infrastructure.drivingadapter.rest.RESTfulRPCAdapter;

public class HelloWorld
{


    public String greetings()
    {
        return "HelloWorld";
    }

    public static void main(String[] args)
    {
        JexxaMain jexxaMain = new JexxaMain("HelloWorld");
        jexxaMain.bind(JMXAdapter.class).to(jexxaMain.getBoundedContext())
                .bind(RESTfulRPCAdapter.class).to(HelloWorld.class)
                .start()
                .waitForShutdown()
                .stop();


    }

}