package com.learning.swagger.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//@Api(value = "MyController", tags = { "MyController" })
@Api()
public class MyController {
   @ApiOperation(value = "Get a greeting"/*, response = String.class*/)
   @ApiResponses(value = {
         @ApiResponse(code = 200, message = "Successfully retrieved greeting"),
         @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
   })
   @GetMapping("/greeting")
   public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
      return "Hello, " + name + "!";
   }
}