package com.booking.bookingmanagement.controller;

import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.core.convert.converter.Converter;
import org.springframework.web.multipart.MultipartFile;

public class FileInformationConverter implements Converter<MultipartFile, FileInformation>{

	private static final Logger logger = Logger.getLogger(FileInformationConverter.class.getName());
	
	public FileInformationConverter() {
		logger.info("Create FileInformationConverter");
	}

	@Override
	public FileInformation convert(MultipartFile source) {
		logger.info("Converting");
		FileInformation packages = new FileInformation();
		packages.setFilename(source.getOriginalFilename());
		try {
			packages.setImage(source.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return packages;
	}

}
