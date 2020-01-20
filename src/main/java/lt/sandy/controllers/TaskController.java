package lt.sandy.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/hello")
@RestController
class TaskController {

    @GetMapping
    ResponseEntity helloWorld(@RequestParam(value = "myString", required = false) String myString) {
        if (myString != null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(new Hello());
    }

    @GetMapping("/tasks}")
    Long getId(@PathVariable("id") Long id) {
        return id;
    }


    @PostMapping
    Hello post(@RequestBody Hello hello) {
        return hello;
    }

    static class Hello {
        public String one = "Hello";
        public String two = "World";

        @JsonIgnore
        public String getShit() {
            return "Shit";
        }

        public void setOne(String one) {
            this.one = one;
        }

        public void setTwo(String two) {
            this.two = two;
        }
    }
}
