package xyz.sandersonsa.springbootcamelfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import io.dekorate.openshift.annotation.OpenshiftApplication;

// @OpenshiftApplication(replicas=2)
@SpringBootApplication
public class SpringbootCamelFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCamelFileApplication.class, args);
	}

}

// oc new-app centos/ruby-25-centos7~https://github.com/sclorg/ruby-ex.git
// oc new-app openshift/ubi8-openjdk-17-runtime:1.12~https://github.com/sandersonsa/apache-camel-file.git#main --name=camel-file
// oc new-app registry.access.redhat.com/ubi8/openjdk-17-runtime~https://github.com/sandersonsa/apache-camel-file.git#main --name=camel-file