package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.demo.pojo.*;
import org.springframework.stereotype.Service;

@Service
public class MainService {
	public MainResponse getResponse(String[] paramValues) {
		String[] requiredParams = Arrays.toString(paramValues).split(",");
		MainResponse response = new MainResponse(true, "firstName_lastName_DataOfBirth", "emailid@gmail.com",
				"DummyRollNumber");
		List<String> alphabets = new ArrayList<>();
		List<String> numbers = new ArrayList<>();

		for (String s : requiredParams) {
			int temp = 0;
			try {
				temp = Integer.parseInt(s);
				numbers.add(String.valueOf(temp));
			} catch (NumberFormatException e) {
				alphabets.add(s);
			}
		}

		response.setAlphabets(alphabets);
		response.setNumbers(numbers);
		return response;
	}
}
