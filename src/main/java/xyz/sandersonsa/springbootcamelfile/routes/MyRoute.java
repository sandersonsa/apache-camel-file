package xyz.sandersonsa.springbootcamelfile.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // moving file from jms queue to file system.
        // from("jms:queue:myQueue").to("file://mysrc");
        
        from("file://input_data?delete=true").to("file://output_data");
        // from("file://inputdir/?recursive=true&delete=true").to("file://outputdir?flatten=true")
    }

}