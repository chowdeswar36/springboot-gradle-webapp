package com.cg.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cg.SpringBootGradleWebappApplication;
import com.cg.controller.EmployeeController;
import com.cg.service.EmployeeServiceImpl;

public class Constants {
	public static final Logger springMain_logger = LoggerFactory.getLogger(SpringBootGradleWebappApplication.class);

	public static final Logger control_logger = LoggerFactory.getLogger(EmployeeController.class);

	public static final Logger service_logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

}
