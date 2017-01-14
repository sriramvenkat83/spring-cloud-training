package com.training.work;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sriram Venkataraman on 1/8/17.
 */
@RefreshScope
@RestController
@RequestMapping("/greeting")
public class GreetingController {

   /* @Value("${messages.environment}")
    private String env;
*/
    @Value("${greeting: Default greeting}")
    private String greeting;

    @RequestMapping("/getMessage")
    public ResponseEntity<?> getMessage(){
        return new ResponseEntity<>(greeting, HttpStatus.OK);

    }

}
