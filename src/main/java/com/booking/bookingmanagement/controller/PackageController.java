package com.booking.bookingmanagement.controller;

import java.io.IOException;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.booking.bookingmanagement.model.Packages;

@Controller
public class PackageController {

	private static final Logger logger = Logger.getLogger(PackageController.class.getName());
	
	@RequestMapping(value = "/admin/addPackage")
	public String addPackage(@ModelAttribute("addPackage") Optional<Packages> packages,@RequestParam("uploadFile") Optional<FileInformation> uploadFile) throws IOException {
		
		if(uploadFile.isPresent())logger.info(uploadFile.get().getFilename());
		if(uploadFile.isPresent())logger.info(uploadFile.get().getImage().length+"");
		if(packages.isPresent())logger.info(packages.get().toString());
		return "/admin/addPackage";
	}
}
