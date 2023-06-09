package com.javatechie.spring.drools.api.Config;

import java.io.IOException;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolConfig {

	private KieServices kieServices = KieServices.Factory.get();



	@Bean
	public KieContainer getKieContainer() {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write(ResourceFactory.newClassPathResource("calculator.drl"));
		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll();
		KieModule kieModule = kb.getKieModule();
		return kieServices.newKieContainer(kieModule.getReleaseId());
	}



	@Bean
	public KieSession getKieSession() throws IOException {
		System.out.println("session created...");
		return getKieContainer().newKieSession();

	}

//	private KieFileSystem getKieFileSystem() throws IOException {
//		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//		kieFileSystem.write(ResourceFactory.newClassPathResource("offer.drl"));
//		return kieFileSystem;
//
//	}
//
//	@Bean
//	public KieContainer getKieContainer() throws IOException {
//		System.out.println("Container created...");
//		getKieRepository();
//		KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
//		kb.buildAll();
//		KieModule kieModule = kb.getKieModule();
//		KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//		return kContainer;
//
//	}

//	private void getKieRepository() {
//		final KieRepository kieRepository = kieServices.getRepository();
//		kieRepository.addKieModule(new KieModule() {
//			public ReleaseId getReleaseId() {
//				return kieRepository.getDefaultReleaseId();
//			}
//		});
//	}


}
