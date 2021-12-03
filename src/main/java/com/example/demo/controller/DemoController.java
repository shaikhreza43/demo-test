/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.ApiResponse;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

	@GetMapping("/test")
	public ResponseEntity<ApiResponse> test() {

		ApiResponse apiResponse = new ApiResponse<>();
		apiResponse.setData("Hi. This is just a Testing message from your Demo Controller");
		apiResponse.setMessage("Testing Cloud Run");
		apiResponse.setStatusCode(200);

		return ResponseEntity.status(200).body(apiResponse);

	}
}
