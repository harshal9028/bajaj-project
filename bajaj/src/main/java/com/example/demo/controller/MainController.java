package com.example.demo.controller;
import com.example.demo.pojo.MainResponse;
import com.example.demo.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	private MainService mainService;

	@PostMapping("/bfhl")
	public ResponseEntity<MainResponse> voidLabel(@RequestParam(value = "data[]") String[] paramValues) {

		MainResponse mainResponse = mainService.getResponse(paramValues);
		return new ResponseEntity<>(mainResponse, HttpStatus.OK);
	}
}