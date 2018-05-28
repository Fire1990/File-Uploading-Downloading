package com.file.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.file.demo.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class FileUploadingDownloadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadingDownloadingApplication.class, args);
	}
}
