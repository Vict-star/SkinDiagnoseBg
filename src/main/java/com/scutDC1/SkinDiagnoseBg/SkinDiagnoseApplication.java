package com.scutDC1.SkinDiagnoseBg;

import com.scutDC1.SkinDiagnoseBg.Service.StorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SkinDiagnoseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkinDiagnoseApplication.class, args);
    }

    @Bean
    CommandLineRunner init(com.scutDC1.SkinDiagnoseBg.Service.StorageService storageService) {
        return (args) -> {
            //storageService.deleteAll();
            storageService.init();
        };
    }
}
