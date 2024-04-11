package xyz.sandersonsa.springbootcamelfile.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {                
        from("file://input_data/?recursive=true&delete=true").to("file://output_data?flatten=true")
        .log("File processed: ${header.CamelFileName}")
        .log("File processed: ${header.CamelFilePath}");
    }

}